package com.example.appsaludable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityResultIMC extends AppCompatActivity {
    private TextView textResultado;
    private Button btnSiguiente, btnVolver2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result_imc);

        textResultado =(TextView) findViewById(R.id.textResultado);
        btnSiguiente =(Button) findViewById(R.id.btnSiguiente);
        btnVolver2 =(Button) findViewById(R.id.btnVolver2);


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), Catalogo.class);
                startActivity(intent);
            }
        });

        btnVolver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),MainActivityIMC.class);
                startActivity(intent);
            }
        });

        Intent intent= getIntent();
        textResultado.setText(String.valueOf(intent.getDoubleExtra("resultado", 0.0)));
    }
}
