package com.example.bai2_intent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceEx extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.e("Khởi tạo","Service đã được tạo");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e("Huỷ","Service đã bị huỷ");
    }
}
