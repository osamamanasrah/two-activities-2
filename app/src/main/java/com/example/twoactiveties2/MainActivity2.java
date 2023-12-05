package com.example.twoactiveties2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setUpVars();
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        editText.setText(message);
    }

    private void setUpVars() {
        editText = findViewById(R.id.edtMessage);
        button = findViewById(R.id.btnReplay);
    }

    public void btnReplayOnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}