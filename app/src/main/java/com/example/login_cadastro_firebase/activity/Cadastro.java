package com.example.login_cadastro_firebase.activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_cadastro_firebase.R;

public class Cadastro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


    }

    public void Cadastro_facebook(View v){
    /*Nesse momento nao sei como proseguir*/
    }
    public void Cadastro_email(View v){
        Intent I = new Intent(getApplicationContext(),Cadastro_email.class);
        startActivity(I);
    }
    public void Cadastro_google(View v){
        /*Nesse momento nao sei como proseguir*/
    }

}