package com.example.joakin.actividad3firebase;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by joaquinlopezamador on 15/11/2016.
 */

public class DataHolder {

    public static String mensaje = "";


    public static FirebaseAuth mAuth;
    public static FirebaseUser FirebaseUser;
    public static String CatergoriaSeleccionada;
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference myRef = database.getReference().child("Mensajes");
    public static DatabaseReference myRefIdiomas = database.getReference().child("Idioma");
    public static DatabaseReference myrefCategorias = database.getReference().child("Categorias");
    public static int hasExecuted = 0;





}





