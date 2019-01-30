package com.alvar.preferenciasej12;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String FICHERO="telefono";
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        SharedPreferences prefs = getSharedPreferences(FICHERO, Context.MODE_PRIVATE);

        String strTelefono =prefs.getString("tel","");

        editText.setText(strTelefono);

    }

    public void guardar(View view) {
        SharedPreferences prefs = getSharedPreferences(FICHERO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("tel",editText.getText().toString());

        editor.commit();

    }
}
