package com.example.administrator.mycollegeguide.temp_singleton;

import android.content.Context;

import com.example.administrator.mycollegeguide.model.MajorModel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

public class MajorFactory {

    private static MajorFactory majorFactory;

    private List<MajorModel> majorModels;

    private static final String DEPT_OF = "Department of ";




    private MajorFactory(Context context){
        majorModels = new ArrayList<>();
        addMajor();
    }



    public static MajorFactory getInstance(Context context){
        if (majorFactory == null){
            majorFactory = new MajorFactory(context);
            return majorFactory;
        }

        return majorFactory;
    }



    public List<MajorModel> getMajorModels(){
        return majorModels;
    }




    public MajorModel getMajor(UUID id){
        for(MajorModel majorModel : majorModels){
            if (majorModel.getId().equals(id)){
                return majorModel;
            }
        }
        return null;
    }


    private void addMajor(){

        majorModels.add(new MajorModel("Software Engineering", DEPT_OF + "Information"));
        majorModels.add(new MajorModel("Materials Physics", DEPT_OF + "Physics"));
        majorModels.add(new MajorModel("Optic", DEPT_OF + "Physics"));
        majorModels.add(new MajorModel("Physics", DEPT_OF + "Physics"));
        majorModels.add(new MajorModel("Applied Mathematics", DEPT_OF + "Mathematics"));
        majorModels.add(new MajorModel("Ecology", DEPT_OF + "Biology"));
        majorModels.add(new MajorModel("MBA", DEPT_OF + "Economy"));
        majorModels.add(new MajorModel("translation", DEPT_OF + " foreign language"));
        majorModels.add(new MajorModel("multimedia", DEPT_OF + "creative culture"));
        majorModels.add(new MajorModel("Psycology", DEPT_OF + "life science"));
    }
}
