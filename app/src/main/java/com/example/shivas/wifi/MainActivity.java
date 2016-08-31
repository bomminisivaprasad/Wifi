package com.example.shivas.wifi;

import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
 Switch aSwitch;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(Switch)findViewById(R.id.wi);
        wifiManager=(WifiManager)getSystemService(WIFI_SERVICE);
      aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

              if(isChecked && wifiManager.isWifiEnabled()){
                  wifiManager.setWifiEnabled(true);

              }
             if (!isChecked && wifiManager.isWifiEnabled()){
                 final boolean b = wifiManager.setWifiEnabled(false);
             }
          }
      });

    }
}
