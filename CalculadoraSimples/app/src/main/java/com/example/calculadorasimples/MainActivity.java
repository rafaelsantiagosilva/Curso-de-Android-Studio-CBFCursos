package com.example.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.IdentityHashMap;

public class MainActivity extends AppCompatActivity {


    TextView tv_resultado;

    EditText et_valor1;
    EditText et_valor2;

    double num1 = 0;
    double num2 = 0;
    double resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_resultado = findViewById(R.id.tv_resultado);
        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);
    }

    public void exibirResultado(String resultado) {
        tv_resultado.setText(resultado);
    }

    public void somar() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        resultado = num1 + num2;
        exibirResultado(String.valueOf(resultado));
    }

    public void subtrair() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        resultado = num1 - num2;
        exibirResultado(String.valueOf(resultado));
    }

    public void multiplicar() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        resultado = num1 * num2;
        exibirResultado(String.valueOf(resultado));
    }

    public void dividir() {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());

        if (num2 != 0){
            resultado = num1 / num2;
            exibirResultado(String.valueOf(resultado));
        } else {
            exibirResultado("ERRO: Impossível dividir por 0!");
        }
    }

    public void operar(View botaoClicado) {
        if(botaoClicado.getId() == R.id.btn_somar) {
            somar();
        } else if (botaoClicado.getId() == R.id.btn_subtrair) {
            subtrair();
        } else if (botaoClicado.getId() == R.id.btn_multiplicar) {
            multiplicar();
        } else if (botaoClicado.getId() == R.id.btn_dividir) {
            dividir();
        }
    }
}