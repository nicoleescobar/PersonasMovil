package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearPersonas extends AppCompatActivity {
    private EditText cc, nombre, apellido;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cc = (EditText)findViewById(R.id.txtCC);
        nombre = (EditText)findViewById(R.id.txtNombre);
        apellido = (EditText)findViewById(R.id.txtApellido);
        resources = this.getResources();
    }

    public void guardar(View view){
        String ced, nomb, apell;
        ced = cc.getText().toString();
        nomb = nombre.getText().toString();
        apell = apellido.getText().toString();

        persona p = new persona(ced, nomb, apell);
        p.guardar();
        Toast.makeText(this, R.string.done, Toast.LENGTH_SHORT).show();
    }
}
