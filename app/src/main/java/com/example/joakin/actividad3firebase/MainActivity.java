package com.example.joakin.actividad3firebase;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.joakin.actividad3firebase.R;

public class MainActivity extends AppCompatActivity {

    Button BTEn;
    Button BTSp;
    Button BTNKICKBOXING;
    Button BTNFUTBOL;
    Button BTNGOLF;
    Button BTNMMA;
    FragmentNoticia fragmentNoticia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityC mainActivity= new MainActivityC(this);

        BTNKICKBOXING = (Button) findViewById(R.id.KICKBOXING);
        BTNFUTBOL =  (Button) findViewById(R.id.FUTBOL);
        BTNGOLF = (Button) findViewById(R.id.GOLF);
        BTNMMA = (Button) findViewById(R.id.MMA);
        BTEn = (Button) findViewById(R.id.ENGLISHBUTTON);
        BTSp = (Button) findViewById(R.id.SPANISHBUTTON);

        fragmentNoticia=(FragmentNoticia) getSupportFragmentManager().findFragmentById(R.id.fragmentNoticia);
        fragmentNoticia.getView().setBackgroundColor(Color.WHITE);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction trns= fm.beginTransaction();
        trns.hide(fragmentNoticia);
        trns.commit();

        BTEn.setOnClickListener(mainActivity);
        BTSp.setOnClickListener(mainActivity);
        BTNMMA.setOnClickListener(mainActivity);
        BTNMMA.setOnClickListener(mainActivity);
        BTNGOLF.setOnClickListener(mainActivity);
        BTNFUTBOL.setOnClickListener(mainActivity);
    }

}
