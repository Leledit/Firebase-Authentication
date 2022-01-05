package com.example.login_cadastro_firebase.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_cadastro_firebase.R;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




    }

    public void logi_facebook(View view){
        /*Depois irei fazer a passagem para a proxima tela(nao sei presseguir agora)*/
    }
    public void logi_email(View view){
        Intent I = new Intent(getApplicationContext(),Login_email.class);
        startActivity(I);
    }
    public void logi_google(View view){
        /*Depois irei fazer a passagem para a proxima tela(nao sei presseguir agora)*/
    }
}