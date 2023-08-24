package com.example.hellonfc;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // List of URIs to provide to Android Beam
    private Uri[] fileUris = new Uri[10];
    private FileUriCallback fileUriCallback;


        private class FileUriCallback implements NfcAdapter.CreateBeamUrisCallback {
        public FileUriCallback() {
        }
        /**
         * Create content URIs as needed to share with another device
         */
        @Override
        public Uri[] createBeamUris(NfcEvent event) {
            return fileUris;
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Android Beam file transfer is available, continue
        NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        /*
         * Instantiate a new FileUriCallback to handle requests for
         * URIs
         */
        fileUriCallback = new FileUriCallback();
        // Set the dynamic callback for URI requests.
        nfcAdapter.setBeamPushUrisCallback(fileUriCallback, this);

    }
}