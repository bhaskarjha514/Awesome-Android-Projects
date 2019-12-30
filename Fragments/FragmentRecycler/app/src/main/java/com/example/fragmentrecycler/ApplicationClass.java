package com.example.fragmentrecycler;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Person> people;


    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Mariel", "9469081341"));
        people.add(new Person("RielMar", "9934560873"));
        people.add(new Person("Arlex", "9934560873"));

    }
}
