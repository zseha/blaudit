package com.zseha.blaudit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.qpython.qsl4a.*;
import org.qpython.qsl4a.qsl4a.activity.FutureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, FutureActivity.class);
        startActivity(intent);
    }
}
