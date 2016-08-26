package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Basic Toast skeleton fo displayToast pulled from
    // https://developer.android.com/guide/topics/ui/notifiers/toasts.html

    public void displayToast(String message) {
        Context toastContext = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(toastContext, message, duration);
        toast.show();
    }

    public void popularMovies(View view) {
        displayToast("This button will launch Popular Movies");
    }
    public void stockHawk(View view) {
        displayToast("This button will launch Stock Hawk");
    }
    public void buildItBigger(View view) {
        displayToast("This button will launch Build it Bigger");
    }
    public void makeYourAppMaterial(View view) {
        displayToast("This button will launch Make Your App Material");
    }
    public void goUbiquitous(View view) {
        displayToast("This button will launch Go Ubiquotous");
    }
    public void capstone(View view) {
        displayToast("This button will launch my Capstone Project");
    }
}
