package com.estsoft.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d( "---------------------->",
                "" +
                findViewById( R.id.textView ).isFocusable() + ":" +
                findViewById( R.id.editText ).isFocusable() );



        findViewById( R.id.button_invible ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById( R.id.textView ).setVisibility( View.INVISIBLE );
            }
        });

        findViewById( R.id.button_gone ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById( R.id.textView ).setVisibility( View.GONE );
            }
        });

        findViewById( R.id.button_visible ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById( R.id.textView ).setVisibility( View.VISIBLE );
            }
        });

    }
}
