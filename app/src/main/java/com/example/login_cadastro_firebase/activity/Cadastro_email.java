package com.example.login_cadastro_firebase.activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_cadastro_firebase.R;

public class Cadastro_email extends AppCompatActivity {

    private Button btn_proximo;
    private EditText edt_nome ,edt_dataNacimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_email);

        btn_proximo = findViewById(R.id.btn_proximo);
        edt_nome = findViewById(R.id.edt_nome);
        edt_dataNacimento = findViewById(R.id.edt_dataNacimento);




        btn_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = edt_nome.getText().toString();
                String date = edt_dataNacimento.getText().toString();

                //Criando a intente que sera resposnavel por enviar os dados para a outra tela
                Intent Proximo = new Intent(getApplicationContext(),Cadastro_email_2.class);



                //fazendo a validação do campo nome
                //verificando se esta vazio
                if( (nome == null) ||(nome.trim().equals("")) ) {
                    Toast.makeText(getApplicationContext(),"O campo nome nao pode estar vazio",Toast.LENGTH_LONG).show();
                    edt_nome.requestFocus();
                }else{
                    //verificando se esta cima do limite permitido
                    if(nome.trim().length() >= 100){
                        Toast.makeText(getApplicationContext(),"Tamanho nao suportado no campo nome",Toast.LENGTH_LONG).show();
                        edt_nome.requestFocus();
                    }else{
                        //verificando se esta abaixo do limite permitido
                        if(nome.trim().length() < 3 ){
                            Toast.makeText(getApplicationContext(),"Tamanho nao suportado no campo nome",Toast.LENGTH_LONG).show();
                            edt_nome.requestFocus();
                        }else{
                            //Fazendo as verificaçoes no campo date

                            if((date == null)||(date.trim().equals(""))){
                                Toast.makeText(getApplicationContext(),"O campo Date nao pode estar vazio",Toast.LENGTH_LONG).show();
                                edt_dataNacimento.requestFocus();
                            }else{
                                //Enviando os dados para a outra tela
                                Proximo.putExtra("nome",nome);
                                Proximo.putExtra("data",date);
                                //iniciando a activity
                                startActivity(Proximo);


                            }


                        }

                    }



                }



            }


        });


    }
}