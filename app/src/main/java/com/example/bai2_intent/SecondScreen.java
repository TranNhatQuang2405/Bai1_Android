package com.example.bai2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Bundle extras = getIntent().getExtras();
        String data = extras.getString("Key");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void finish(){
        Intent data =  new Intent();
        data.putExtra("returnKey1","Trả về giá trị 1");
        data.putExtra("returnKey2","Trả về giá trị 2");
        setResult(RESULT_OK, data);
        super.finish();
    }

}