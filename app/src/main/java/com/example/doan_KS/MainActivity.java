package com.example.doan_KS;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void thuchien(View view) {
        Intent in;
        switch (view.getId())
        {
            case R.id.btn_home:
                in = new Intent(MainActivity.this, homehotel.class);
                startActivity(in);
                break;
            case R.id.btn_farm:
                in = new Intent(MainActivity.this, farmhotel.class);
                startActivity(in);
                break;
            case R.id.btn_capsule:
                in = new Intent(MainActivity.this, capsulehotel.class);
                startActivity(in);
                break;
            case R.id.btn_hostel:
                in = new Intent(MainActivity.this, hostel2.class);
                startActivity(in);
                break;
        }
    }
}