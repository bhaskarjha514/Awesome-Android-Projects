package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked{
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<Person>();
        people.add(new Person("John", "Rambo", "bus"));
        people.add(new Person("Chuck", "Norris", "bus"));
        people.add(new Person("Peter", "Jennings", "plane"));
        people.add(new Person("Tom", "Cruise", "plane"));
        people.add(new Person("John", "Rambo", "bus"));
        people.add(new Person("Chuck", "Norris", "bus"));
        people.add(new Person("Peter", "Jennings", "plane"));
        people.add(new Person("Tom", "Cruise", "plane"));

        people.add(new Person("John", "Rambo", "bus"));
        people.add(new Person("Chuck", "Norris", "bus"));
        people.add(new Person("Peter", "Jennings", "plane"));
        people.add(new Person("Tom", "Cruise", "plane"));

        people.add(new Person("John", "Rambo", "bus"));
        people.add(new Person("Chuck", "Norris", "bus"));
        people.add(new Person("Peter", "Jennings", "plane"));
        people.add(new Person("Tom", "Cruise", "plane"));


        myAdapter = new PersonAdapter(this, people);
        recyclerView.setAdapter(myAdapter);



    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, "Surname: " + people.get(index).getSurname(), Toast.LENGTH_SHORT).show();
    }
}
