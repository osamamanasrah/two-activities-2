package com.example.twoactiveties2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpVar();
    }

    private void setUpVar() {
        editText = findViewById(R.id.edtMessage);
        button = findViewById(R.id.btnSend);
    }


    public void btnSendOnClick(View view) {
        String message = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}