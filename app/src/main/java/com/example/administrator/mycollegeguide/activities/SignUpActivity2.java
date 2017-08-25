package com.example.administrator.mycollegeguide.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.administrator.mycollegeguide.R;

/**
 * Created by Administrator on 2017/8/15 0015.
 */


/**
 * second page of the sign up
 */
public class SignUpActivity2 extends AppCompatActivity  implements View.OnClickListener{

    private EditText studentId , id;
    private Spinner collegeSpinner , majorSpinner , degreeSpinner , gradeSpinner;
    private Button nextButton;


    /**
     * onCreate()
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_2);

        referenceElement();
    }




    /**
     * references element on the layout
     */
    private void referenceElement(){
        studentId = (EditText)findViewById(R.id.student_id);
        id = (EditText)findViewById(R.id.id);
        collegeSpinner = (Spinner)findViewById(R.id.college_spinner);
        majorSpinner = (Spinner)findViewById(R.id.major_spinner);
        degreeSpinner = (Spinner)findViewById(R.id.degree_spinner);
        gradeSpinner = (Spinner)findViewById(R.id.grade_spinner);
        nextButton = (Button)findViewById(R.id.next_button2);

        nextButton.setOnClickListener(this);
    }




    /**
     * returns an intent that will be used by some
     * activities that will open this
     * @param context
     * @return
     */
    public static Intent getIntent(Context context){

        Intent intent = new Intent(context , SignUpActivity2.class);
        return intent;
    }




    /**
     * onClick method
     * @param view
     */
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.next_button2 : {
                Intent intent = SignUpActivity3.getIntent(this);
                startActivity(intent);
                break;
            }
        }
    }
}
