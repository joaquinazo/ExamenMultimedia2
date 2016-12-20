package com.example.joaquinlopezamador.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button SVButton;
    EditText ETUSer;
    EditText ETMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityC mainActivity= new MainActivityC(this);
        SVButton = (Button)findViewById(R.id.Send);
        ETUSer = (EditText)findViewById(R.id.nombre);
        //ETMensaje = (EditText)findViewById(R.id.me);
        SVButton.setOnClickListener(mainActivity);

    }

}
