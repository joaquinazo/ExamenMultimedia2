package com.example.joakin.actividad3firebase;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

import static android.R.attr.password;
import static com.google.android.gms.internal.zzs.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentNoticia extends Fragment implements View.OnClickListener {

    MainActivity mainActivity;
    TextView texto;
    Button back;
    public FragmentNoticia() {






    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_fragment_noticia, container, false);

        texto = (TextView) v.findViewById(R.id.textooooo);
        back = (Button)v.findViewById(R.id.button2);
        mainActivity=(MainActivity) getActivity();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm=mainActivity.getSupportFragmentManager();
                FragmentTransaction trns= fm.beginTransaction();
                trns.hide(FragmentNoticia.this);
                trns.commit();
            }
        });

        return v;
    }


    @Override
    public void onClick(View v) {

    }

    public void downloadfromdatabase(final String str) {
        DataHolder.myRefIdiomas = DataHolder.database.getReference().child("Categorias/" + str);



        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                System.out.println("YEYEYEYEYEY" +  dataSnapshot.child(str).getValue());
                HashMap<String, String> hm = (HashMap<String, String>) dataSnapshot.child(str).getValue();

                texto.setText(hm.get("Noticia"));


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        DataHolder.myrefCategorias.addValueEventListener(postListener);
    }
}



