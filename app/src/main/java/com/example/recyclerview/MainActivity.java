package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","9012034759"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"B","9012034760"));
        arrContacts.add(new ContactModel(R.drawable.recyclerview,"C","9012034761"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"D","9012034762"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"E","9012034763"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"F","9012034764"));
        arrContacts.add(new ContactModel(R.drawable.recyclerview,"G","9012034765"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"H","9012034766"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"I","9012034767"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background,"J","9012034768"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}