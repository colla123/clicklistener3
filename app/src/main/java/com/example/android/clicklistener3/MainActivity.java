package com.example.android.clicklistener3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file.
        setContentView(R.layout.activity_main);


        TextView mytext = (TextView) findViewById(R.id.text);


        mytext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent nameintent = new Intent(MainActivity.this, NameActivity.class );

                startActivity(nameintent);
            }
        });
    }


}
