package hu.markcool.servicesimpledemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

//import android.util.Log;


public class MyService extends Service {

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    
    @Override
    public void onCreate() {
        super.onCreate();
//        Toast.makeText(this, "Service onCreate", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "Service start", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service stop", Toast.LENGTH_SHORT).show();
    }
}