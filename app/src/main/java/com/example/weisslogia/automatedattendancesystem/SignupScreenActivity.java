package com.example.weisslogia.automatedattendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
    }


    public void gotoTransferringStudentId(View view) {
        Intent signinIntent = new Intent(this, TransferringStudentID.class);
        startActivity(signinIntent);
    }

    public void goToRegistrationSuccessful(View view)
    {
        Intent i = new Intent(this,RegistrationSuccessfulActivity.class);
        TextView UsernameSignup = (TextView)findViewById(R.id.UsernameSignup);
        TextView UserIdSignup = (TextView)findViewById(R.id.UserIdSignup);
        TextView PasswordSignup = (TextView)findViewById(R.id.PasswordSignup);

        String newUsername = UsernameSignup.getText().toString();
        String newUserId = UserIdSignup.getText().toString();
        String newUserPassword = PasswordSignup.getText().toString();

        i.putExtra("userName",newUsername);
        i.putExtra("userId",newUserId);
        i.putExtra("userPassword",newUserPassword);

        startActivity(i);
    }

}
