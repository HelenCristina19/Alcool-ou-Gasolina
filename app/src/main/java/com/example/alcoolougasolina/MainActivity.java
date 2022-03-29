package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool, editGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editAlcool);
        editGasolina = findViewById(R.id.editGasolina);

        textResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View view){

      double precoGasolina = Double.parseDouble(editGasolina.getText().toString());
      double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
      double resultado = precoAlcool /precoGasolina;

      /*
      Se precoAlcool / precoGasolina >=  0.7 é melhor utilizar gasolina
      senão é melhor utilizar álcool
       */

      if (resultado >= 0.7 ){

          textResultado.setText("É melhor utilizar gasolina");

      }else{

          textResultado.setText("É melhor utilizar Etanol");

      }


    }


}