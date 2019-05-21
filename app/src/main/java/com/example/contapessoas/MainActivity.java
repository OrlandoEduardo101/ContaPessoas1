package com.example.contapessoas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numeroPessoas = 0;
    int numeroHomens = 0;
    int numeroMulher = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoTexto = (TextView) findViewById(R.id.text);

        final Button botao1 = (Button) findViewById(R.id.button);
        final Button botao2 = (Button) findViewById(R.id.button2);
        final Button botao3 = (Button) findViewById(R.id.reset);

        botao1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroPessoas++;
                numeroHomens++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botao1.setText(Integer.toString(numeroHomens));
            }
        });

        botao2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroPessoas++;
                numeroMulher++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botao2.setText(Integer.toString(numeroMulher));
            }
        });

        botao3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroPessoas=0;
                numeroHomens=0;
                numeroMulher=0;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botao1.setText(Integer.toString(numeroHomens));
                botao2.setText(Integer.toString(numeroMulher));
            }
        });

    }



}
