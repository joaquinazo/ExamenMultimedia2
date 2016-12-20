package com.example.joaquinlopezamador.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by joaquinlopezamador on 15/11/2016.
 */

public class DataHolder {

    public static String mensaje = "";


    public static FirebaseAuth mAuth;
    public static FirebaseUser FirebaseUser;

    public static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference().child("Mensajes");

    public static void writeFirebase(){

        if (mensaje != null){
            DatabaseReference push = myRef.push();
            push.child("Alumno").setValue(DataHolder.FirebaseUser.getEmail());
            push.child("Duda").setValue(mensaje);
            push.child("Listo").setValue(false);

        }


    }




}
