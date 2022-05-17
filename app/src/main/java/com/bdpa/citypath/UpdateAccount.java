package com.bdpa.citypath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateAccount extends AppCompatActivity {
    Button Update_btn;
    EditText checkUserName, checkPassword, makeNewFName, makeNewLName, makeNewEmail, makeNewUsername, makeNewPassword;
    public static void main(String[] args) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_account);
        Update_btn = findViewById(R.id.btn_updateAcc);
        checkUserName = findViewById(R.id.oldUserField);
        checkPassword = findViewById(R.id.oldPassField);
        makeNewFName = findViewById(R.id.newFNameField);
        makeNewLName = findViewById(R.id.newLNameField);
        makeNewEmail = findViewById(R.id.newEmailField);
        makeNewUsername = findViewById(R.id.newUsernameField);
        makeNewPassword = findViewById(R.id.newPasswordField);

        Update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUpdates();
            }
        });
    }
    public void checkUpdates() {
        testUser tu = new testUser();
        tu.setUsername("TestUser");
        tu.setPassword("testUser1");
        tu.setFirstname("Test");
        tu.setLastname("User");
        tu.setEmail("TestUser@gmail.com");

        if (checkUserName.equals(tu.getUsername()) && checkPassword.equals(tu.getPassword()) &&
                !(makeNewFName.equals(tu.getFirstname()) && makeNewLName.equals(tu.getLastname()) &&
                 makeNewEmail.equals(tu.getEmail()) && makeNewUsername.equals(tu.getUsername()) && makeNewPassword.equals(tu.getPassword()))) {
            System.out.println("Account changed successfully!");
        }else {
            System.out.println("Check information is entered correctly...");
        }
    }


}