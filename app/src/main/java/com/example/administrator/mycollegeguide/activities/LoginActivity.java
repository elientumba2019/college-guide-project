package com.example.administrator.mycollegeguide.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;


/**
 * Activity Login for user to log into
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private TextView signUp , forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        button = (Button)findViewById(R.id.login_button);
        signUp = (TextView)findViewById(R.id.sign_up);
        forgotPassword = (TextView)findViewById(R.id.forgot_password);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = CollegeActivity.getIntent(LoginActivity.this);
                startActivity(intent);
            }
        });


        signUp.setOnClickListener(this);
        forgotPassword.setOnClickListener(this);
    }




    /**
     * onClick listener
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.sign_up : {
                Intent intent = SignUpActivity1.getIntent(LoginActivity.this);
                startActivity(intent);
                break;
            }


            case R.id.forgot_password : {
                Intent intent = ForgotPAssword1.getIntent(LoginActivity.this);
                startActivity(intent);
                break;
            }
        }
    }
}
