package com.stdserver.msms.ui;

import com.stdserver.msms.ui.Prefs;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.stdserver.msms.App;
import com.stdserver.msms.ui.LogView;

public class Main extends Activity {   
	
    private App app;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {   
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            ActionBar actionBar = getActionBar();
            Toast.makeText(this, "Okay this has just executed because it is true", Toast.LENGTH_SHORT).show();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        app = (App)getApplication();
                
        startActivity(new Intent(this, LogView.class));       
    }    
}