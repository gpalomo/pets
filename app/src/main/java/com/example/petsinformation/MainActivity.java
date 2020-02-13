package com.example.petsinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.mRegister);
        mButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mRegister:
                Toast.makeText(this, "Register",Toast.LENGTH_SHORT).show();
                resgisterWindow();
                break;
            case R.id.btnLogin:
                Toast.makeText(this, "Valid Information",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void resgisterWindow()
    {
        // Do something in response to button click
        Intent intent = new Intent(this,menuopcions.class);
        startActivity(intent);

    }
}
