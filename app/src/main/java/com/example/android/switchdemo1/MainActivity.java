package com.example.android.switchdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch mainSwitch;
    private RelativeLayout rr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rr = (RelativeLayout) findViewById(R.id.relative_layout);
        mainSwitch = (Switch) findViewById(R.id.main_switch);
        mainSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    rr.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_LONG).show();
                }
                else{
                    rr.setBackgroundColor(getResources().getColor(R.color.colorPink));
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
