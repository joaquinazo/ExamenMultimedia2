package com.example.joakin.actividad3firebase;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by joaquinlopezamador on 08/11/2016.
 */

public class MainActivityC implements View.OnClickListener {
    MainActivity mainActivity;


    public MainActivityC(MainActivity mainActivity) {

        this.mainActivity = mainActivity;
        downloadNoticias();
    }

    public void downloadNoticias() {

        DataHolder.myRefIdiomas = DataHolder.database.getReference().child("Idioma/" + 1);


        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                HashMap<String, String> hm = (HashMap<String, String>) dataSnapshot.getValue();

                System.out.println("--------" + hm.get("Palabra1"));

                mainActivity.BTSp.setText(hm.get("boton2"));
                mainActivity.BTEn.setText(hm.get("boton"));
                mainActivity.BTNFUTBOL.setText(hm.get("FUTBOL"));
                mainActivity.BTNGOLF.setText(hm.get("GOLF"));
                mainActivity.BTNKICKBOXING.setText(hm.get("KICKBOXING"));
                mainActivity.BTNMMA.setText(hm.get("MMA"));


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        DataHolder.myRefIdiomas.addValueEventListener(postListener);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.GOLF) {

            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Golf");
        } else if (v.getId() == R.id.ENGLISHBUTTON) {
            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Nba");
        } else if (v.getId() == R.id.SPANISHBUTTON) {
            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Boxeo");
        } else if (v.getId() == R.id.MMA) {
            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Mma");

        } else if (v.getId() == R.id.KICKBOXING) {
            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Kickboxing");
        } else if (v.getId() == R.id.FUTBOL) {
            FragmentManager fm=mainActivity.getSupportFragmentManager();
            FragmentTransaction trns= fm.beginTransaction();

            trns.show(mainActivity.fragmentNoticia);
            trns.commit();
            mainActivity.fragmentNoticia.downloadfromdatabase("Futbol");
        }

    }
}


