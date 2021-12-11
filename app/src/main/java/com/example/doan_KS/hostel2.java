package com.example.doan_KS;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class hostel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
@Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()== android.R.id.home)
        {
        onBackPressed();
    }
    return super.onOptionsItemSelected(item);
    }

    public void trove(View view) {
        Intent in;
        switch (view.getId()) {
            case R.id.btn_back1:
                in = new Intent(hostel2.this, MainActivity.class);
                startActivity(in);
                break;
        }
    }
}