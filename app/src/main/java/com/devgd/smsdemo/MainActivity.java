package com.devgd.smsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phno,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phno = findViewById(R.id.phno);
        message = findViewById(R.id.message);

    }

    public void sendMessage(View view) {
        SmsManager smsManager = SmsManager.getDefault();

        smsManager.sendTextMessage("+91 "+phno.getText().toString(),null,
                message.getText().toString(),null,null);

        Toast.makeText(getApplicationContext(),"Message Successfully delivered!",
                Toast.LENGTH_LONG).show();
    }
}