package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.dbdemo.data.MyDbHandler;
import com.example.dbdemo.model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact bhai = new Contact();
        bhai.setPhoneNumber("9910665678");
        bhai.setName("Bhaskar");
        // Adding a contact to the db
        db.addContact(bhai);

        // Creating a contact object for the db
        Contact Mariel = new Contact();
        Mariel.setPhoneNumber("7810665678");
        Mariel.setName("Mariel");
        // Adding a contact to the db
        db.addContact(Mariel);

        // Creating a contact object for the db
        Contact RielMar = new Contact();
        RielMar.setPhoneNumber("7890665678");
        RielMar.setName("Rielmar");
        // Adding a contact to the db
        db.addContact(RielMar);
        Log.d("dbsql", "Id For MAriel and kuya mar are successfully added to the database");

    }
}
