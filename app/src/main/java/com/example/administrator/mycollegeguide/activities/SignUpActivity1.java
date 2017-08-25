package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/15 0015.
 */


/**
 * Sign up activity
 */
public class SignUpActivity1 extends AppCompatActivity implements View.OnClickListener{


    private EditText name , surname ,
            email , password , confirmPassword;

    private Button next;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_1);

        getReference();
    }





    /**
     * get reference of element on the
     * layout
     */
    private void getReference(){

        name = (EditText)findViewById(R.id.name);
        surname = (EditText)findViewById(R.id.surname);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        confirmPassword = (EditText)findViewById(R.id.confirm_password);
        next = (Button)findViewById(R.id.next_button);

        next.setOnClickListener(this);
    }





    /**
     * returns the intent that will be used by some activty to open this
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){
        Intent intent = new Intent(context , SignUpActivity1.class);
        return  intent;
    }






    /**
     * onClick method for
     * Click event
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.next_button : {
                Intent intent = SignUpActivity2.getIntent(this);
                startActivity(intent);
                break;
            }

        }
    }
}
