package com.example.bai2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        //Truyền dữ liệu


        Button btn = (Button)findViewById(R.id.btn);
        btn.setText("Vào GOOGLE");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);
                intent.putExtra("Key", "This is value of key one");
                intent.putExtra("Key2", "This is value of key two");
                int REQUEST_CODE = 9;
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 9) {
            if (data.hasExtra("returnKey1")) {
                Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
            }
        }
    }
}