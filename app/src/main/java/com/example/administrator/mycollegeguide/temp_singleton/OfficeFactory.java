package com.example.administrator.mycollegeguide.temp_singleton;

import android.content.Context;

import com.example.administrator.mycollegeguide.model.Office;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class OfficeFactory {

    private OfficeFactory officeFactory;

    private List<Office> offices;


    private OfficeFactory(Context context){
        offices = new ArrayList<>();
        addData();
    }



    /**
     * add data to the list
     */
    private void addData(){

    }
}
