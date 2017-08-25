package com.example.administrator.mycollegeguide.temp_singleton;

import com.example.administrator.mycollegeguide.model.CollegeModel;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/8/2 0002.
 */


/**
 * Singleton class Factory that contains all colleges
 */
public class CollegeFactory {

    private static ArrayList<CollegeModel> list = null;
    private static CollegeFactory factory;


    //college categories
    public static final String EDUCATION = "education";
    public static final String SCIENCE = "Science";
    public static final String CLA = "culture language and art";
    public static final String EH = "economy and humanities";



    public CollegeFactory(){
        list = new ArrayList<>();
    }


    /**
     * Singleton instance method
     * @return
     */
    /*
    public static CollegeFactory getInstance(){

        if(factory == null){
            factory = new CollegeFactory();
            return  factory;
        }

        return  factory;
    }
    */



    /**
     * Factory method
     * @return
     */
    public  ArrayList<CollegeModel> getCollegeList(){



        list.add(new CollegeModel("College of Vocational and Technical Education" , EDUCATION));
        list.add(new CollegeModel("College of international Culture and Education" , EDUCATION));
        list.add(new CollegeModel("College of Teacher Education" , EDUCATION));
        list.add(new CollegeModel("Institute of Education Science" , EDUCATION));
        list.add(new CollegeModel("Hangzhou College of early Education" , EDUCATION));
        list.add(new CollegeModel("College of Physical Education" , EDUCATION));

        list.add(new CollegeModel("College of Law and Political Science" , SCIENCE));
        list.add(new CollegeModel("College of Chemistry and Life Science" , SCIENCE));
        list.add(new CollegeModel("College of MPI" , SCIENCE));
        list.add(new CollegeModel("College of Engineering" ,SCIENCE));
        list.add(new CollegeModel("College of Geography and Environemental Science" , SCIENCE));

        list.add(new CollegeModel("Foreign Language College" , CLA));
        list.add(new CollegeModel("College of communication and creative Culture" , CLA));
        list.add(new CollegeModel("College of African Studies" , CLA));
        list.add(new CollegeModel("College of Music" , CLA));
        list.add(new CollegeModel("College of Fine Art" , CLA));

        list.add(new CollegeModel("College of Economy and Management" , EH));
        list.add(new CollegeModel("College of Humanities" , EH));



        return list;
    }


    /**
     * method used to return a list of colleges given a category
     * @param category
     * @return
     */
    public ArrayList<CollegeModel> getColleges(String category){

        ArrayList<CollegeModel> colleges = getCollegeList();
        ArrayList<CollegeModel> list = new ArrayList<>();

        for(int c = 0 ; c < colleges.size() ; c++){
            if(colleges.get(c).getCategory().equals(category)){
                list.add(colleges.get(c));
            }
        }

        return  list;
    }
}
