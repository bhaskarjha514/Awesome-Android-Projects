package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.dbdemo.data.MyDbHandler;
import com.example.dbdemo.model.Contact;

import java.util.List;

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

        RielMar.setName("Arlex");
        RielMar.setPhoneNumber("0000000000");
        int affectedRows = db.updateContact(RielMar);

        Log.d("dbsql", "No of affected rows are "+ affectedRows);
        db.deleteContactById(1);
        db.deleteContactById(2);
        db.deleteContactById(3);

        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){

            Log.d("dbsql", "Id: "+contact.getId()+ "\n" +
                            "Phone Number: " + contact.getPhoneNumber() + "\n" +
                            "Name: "+contact.getName()+ "\n" );
        }
        Log.d("dbsql", "Bro You have "+ db.getCount()+ "contacts in your database");

    }
}
