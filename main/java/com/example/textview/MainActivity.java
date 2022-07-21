package com.example.textview;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 TextView first,second,third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(TextView) findViewById(R.id.FirstText);
        second=(TextView) findViewById(R.id.SecondText);
        third=(TextView) findViewById(R.id.ThirdText);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(findViewById(android.R.id.content),"YOU CLICLKED ON SUNIL KUMAR",Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(com.google.android.material.R.color.material_deep_teal_500));
                snackbar.show();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(findViewById(android.R.id.content),"YOU CLICLKED ON HARISH KUMAR",Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(com.google.android.material.R.color.material_blue_grey_800));
                snackbar.show();

            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(findViewById(android.R.id.content),"YOU CLICLKED ON SUBHAM KUMAR",Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(com.google.android.material.R.color.material_deep_teal_200));
                snackbar.show();
            }
        });
    }
}"
        android:textStyle="normal"