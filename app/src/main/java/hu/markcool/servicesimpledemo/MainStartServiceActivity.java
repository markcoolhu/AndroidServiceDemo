package hu.markcool.servicesimpledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainStartServiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_start_service);


        Button bShow = (Button) findViewById(R.id.btnShow);


        // show button click event
        bShow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent intent = new Intent(MainStartServiceActivity.this, MyService.class);
                startService(intent);


                Intent intentNext = new Intent(MainStartServiceActivity.this, MainStopServiceActivity.class);
                startActivity(intentNext);
            }
        });
    }

}

