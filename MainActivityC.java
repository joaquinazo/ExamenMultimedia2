package com.example.joaquinlopezamador.firebase;

import android.content.Intent;
import android.view.View;

/**
 * Created by joaquinlopezamador on 08/11/2016.
 */

public class MainActivityC implements View.OnClickListener{
    MainActivity mainActivity;


    public MainActivityC(MainActivity mainActivity)  {

        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if (mainActivity.ETUSer != null || mainActivity.ETMensaje !=null){
            DataHolder.mensaje = mainActivity.ETUSer.getText().toString();
            DataHolder.writeFirebase();

        }



    }
}
