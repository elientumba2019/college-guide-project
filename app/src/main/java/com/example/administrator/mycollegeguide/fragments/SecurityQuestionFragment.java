package com.example.administrator.mycollegeguide.fragments;

import android.app.Dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.example.administrator.mycollegeguide.R;



/**
 * Created by Administrator on 2017/8/16 0016.
 */

public class SecurityQuestionFragment extends DialogFragment {


    private DialogInterface.OnClickListener listener;


    /**
     * returns a dialog
     * @param savedInstanceState
     * @return
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        setOnClickListener();

        AlertDialog dialog = new AlertDialog.Builder(getActivity()).setTitle("Answer The Security Question").setPositiveButton("OK" , listener
        ).setNegativeButton("Cancel" , null).setView(R.layout.dialog_question).create();


        return dialog;
    }





    /**
     * click listener event for the dialog window
     */
    private void setOnClickListener(){

        listener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity() , "Hello world" , Toast.LENGTH_LONG).show();
            }
        };
    }
}
