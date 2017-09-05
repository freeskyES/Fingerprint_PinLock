package com.es.fingerprint_authentication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button fingerprintButton, passwordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fingerprintButton = (Button) findViewById(R.id.fingerprint_btn);
        passwordButton = (Button) findViewById(R.id.password_btn);

        fingerprintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, FingerprintActivity.class);
                startActivity(intent);
            }
        });
        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, PinLockActivity.class);
                startActivity(intent);
            }
        });
    }
}
