package com.example.administrator.mycollegeguide.model;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public class CollegeModel {

    private String name;
    private String category;


    public CollegeModel(String name, String category) {
        this.name = name;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "CollegeModel{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeModel)) return false;

        CollegeModel that = (CollegeModel) o;

        if (!name.equals(that.name)) return false;
        return category.equals(that.category);

    }


    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }



}
