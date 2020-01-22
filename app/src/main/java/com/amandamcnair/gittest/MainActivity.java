package com.amandamcnair.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Test", "This is a test");
        Log.i("Test", "This is another test");
        //git add
        //git commit <-- only local repository
        // git push <-- take everything to the server
        // git commit, commit and push
    }
}
