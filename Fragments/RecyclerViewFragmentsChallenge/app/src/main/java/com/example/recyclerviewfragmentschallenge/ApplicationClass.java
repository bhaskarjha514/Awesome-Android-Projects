package com.example.recyclerviewfragmentschallenge;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Car> cars;


    @Override
    public void onCreate() {
        super.onCreate();

        cars =  new ArrayList<Car>();
        cars.add(new Car("Volkswagen", "Polo", "Chuck Norris", "09230456789"));
        cars.add(new Car("Mercedes", "E200", "Peter Pollock", "08730456789"));
        cars.add(new Car("Nissan", "Almera", "Chris James", "09230456789"));
        cars.add(new Car("Mercedes", "E180", "John Rambo", "09230456789"));
        cars.add(new Car("Volkswagen", "Konbi", "Nelson Mandela", "09230456789"));
        cars.add(new Car("Nissan", "Navara", "Paul Bunting", "09230456789"));
        cars.add(new Car("Mercedes", "E150", "Mariel Trinidad", "09230456789"));
    }
}
