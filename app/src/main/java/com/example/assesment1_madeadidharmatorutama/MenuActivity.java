package com.example.assesment1_madeadidharmatorutama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    String username;
    TextView tvCalculator, tvTemperature, tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tvUser = findViewById(R.id.tvUser);
        tvCalculator = findViewById(R.id.tvCalculator);
        tvTemperature = findViewById(R.id.tvTemperature);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                username = null;
            } else {
                username = extras.getString("username");
            }
        } else {
            username = (String) savedInstanceState.getSerializable("username");
        }
        tvUser.setText(username);
        tvCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "On-Progress!", Toast.LENGTH_SHORT).show();
            }
        });
        tvTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, TemperatureActivity.class);
                startActivity(intent);
            }
        });
    }
}
