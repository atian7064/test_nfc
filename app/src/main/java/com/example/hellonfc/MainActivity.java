package com.example.hellonfc;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //NFC button
    Button button = findViewById(R.id.nfcButton);
    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Log.d("BUTTONS", "User tapped the Supabutton");
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}