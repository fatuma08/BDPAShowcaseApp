package com.bdpa.citypath;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText userField;
    private EditText passField;
    private Button btn_login;
    private String currUser;
    private String currPass;
    public static void main(String[] args) {
        testUser person = new testUser();
        //person.setUsername("Guest1");
        //person.setPassword("gUest123");
        checkAccount(person.getUsername(), person.getPassword());
    }
    String userFieldValue;
    public static String checkAccount(String user, String pass) {
        if (userField.value == user && passField.value == pass) {
            return "Redirected to Profile: Success";
            currUser = user;
            currPass = pass;
        }else if (userField.value != user) {
            return "Username is Incorrect!";
        }else if (passField.value != user) {
            return "Password is Incorrect!";
        }
        return "Enter Correct Information";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        userField = findViewById(R.id.usernamefield);
        passField = findViewById(R.id.passwordField);
        btn_login = findViewById(R.id.loginButton);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper dbHelper = new DatabaseHelper(LoginActivity.this);
            }
        });
    }
}