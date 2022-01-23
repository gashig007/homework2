package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText gmail;
    private EditText password;
    private TextView entrance, text1, text2, forget_password, click_this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        entrance = findViewById(R.id.entrance);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        forget_password = findViewById(R.id.forget_password);
        click_this = findViewById(R.id.click_this);
        button.setOnClickListener(view -> {
            if(gmail.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")) {
                button.setVisibility(view.GONE);
                gmail.setVisibility(view.GONE);
                password.setVisibility(view.GONE);
                entrance.setVisibility(view.GONE);
                text1.setVisibility(view.GONE);
                text2.setVisibility(view.GONE);
                forget_password.setVisibility(view.GONE);
                click_this.setVisibility(view.GONE);
                Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "У вас неправильный логин и пароль", Toast.LENGTH_SHORT).show();
            }
        });

        gmail.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                if(gmail.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor
                            (MainActivity.this, R.color.purple_200));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor
                            (MainActivity.this, R.color.orange));
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                if(password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.purple_200));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
            }
        });

    }
}