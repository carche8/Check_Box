package com.example.myapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView result;
    private CheckBox multi, divid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.txt_numero1);
        numero2 = (EditText) findViewById(R.id.txt_numero2);
        result = (TextView) findViewById(R.id.resultado);
        multi = (CheckBox) findViewById(R.id.multiplicar);
        divid = (CheckBox) findViewById(R.id.dividir);
        suma = (CheckBox) findViewById(R.id.sumna);

    }


    public void Calcular (View view) {

        String valor1_String = numero1.getText().toString();
        String valor2_String = numero2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        String resultado = "";

        if(multi.isChecked() == true){
            int mult = valor1_int * valor2_int;
            resultado = " La multiplicacion es: " + multi + " / ";
            result.setText(resultado);
        }

        if (divid.isChecked() == true){

            if(valor2_int != 0){
                int divi = valor1_int / valor2_int;
                resultado = resultado + "La division es: " + divid;
                result.setText(resultado);
            }
            int divi = valor1_int / valor2_int;
            resultado = result + "La division es: " + divid;
            } else {
            Toast.makeText(this, "El segundo valor debe ser diferente a cero", Toast.LENGTH_LONG).show();
        }




    }
}