package com.example.android.switchdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch mainSwitch;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.linear_layout);
        final ImageView image = (ImageView) findViewById(R.id.image);
        mainSwitch = (Switch) findViewById(R.id.main_switch);
        mainSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ll.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                    image.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_LONG).show();
                }
                else{
                    ll.setBackgroundColor(getResources().getColor(R.color.colorPink));
                    image.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
