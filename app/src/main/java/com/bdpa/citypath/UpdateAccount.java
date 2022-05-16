package com.bdpa.citypath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UpdateAccount extends AppCompatActivity {
    Button Update;
    EditText checkUserName, checkPassword, makeNewFName, makeNewLName, makeNewEmail, makeNewUsername, makeNewPassword;
    public static void main(String[] args) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_account);
        Update = findViewById(R.id.btn_updateAcc);
        checkUserName = findViewById(R.id.oldUserField);
        checkPassword = findViewById(R.id.oldPassField);
        makeNewFName = findViewById(R.id.newFNameField);
        makeNewLName = findViewById(R.id.newLNameField);
        makeNewEmail = findViewById(R.id.newEmailField);
        makeNewUsername = findViewById(R.id.newUsernameField);
        makeNewPassword = findViewById(R.id.newPasswordField);

    }
    public static String checkUpdates() {
        testUser tu = new testUser();
        tu.setUsername("TestUser");
        tu.setPassword("testUser1");
        tu.setFirstname("Test");
        tu.setLastname("User");
        tu.setEmail("TestUser@gmail.com");
       /* if (checkUserName.value = tu.getUsername() && checkPassword.value = tu.getPassword() && makeNewFName.value != tu.getFirstname()
                && makeNewLName.value != tu.getLastname() && makeNewEmail.value != tu.getEmail() && makeNewUserName != tu.getUsername()
                && makeNewPassword.value != tu.getPassword()) {
            tu.setUsername(makeNewUsername);
            tu.setPassword(makePassword);
            tu.setFirstname(makeNewFName);
            tu.setLastname(makeNewLName);
            tu.setEmail(makeNewEmail);
            return "Updated Account!";

        }*/
        return "Make Sure Info is Correct";
    }
    //String newFName, String newLName,String newUsername, String newEmail, String newPassword, String oldUser, String oldPass

}