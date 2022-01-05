package com.example.login_cadastro_firebase.activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_cadastro_firebase.R;
import com.google.firebase.auth.FirebaseAuth;

public class Tela_inicial extends AppCompatActivity {

    private Button id_btn_cadastro,id_btn_login;
    private FirebaseAuth usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


        //Iniciando a instancia do firebase

        usuario = FirebaseAuth.getInstance();

        //verificando se o usuario ja esta logado no sistema
        if(usuario.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),tela_principal.class));
        }



        id_btn_cadastro = findViewById(R.id.id_btn_cadastro);
        id_btn_login = findViewById(R.id.id_btn_login);

        /*Criando evento de click do botao de cadastro*/
        id_btn_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(getApplicationContext(),Cadastro.class);
                startActivity(I);

            }
        });

        /*Criando o evento de click do botao de login*/

        id_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(getApplicationContext(),Login.class);
                startActivity(I);

            }
        });

    }

}