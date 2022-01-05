package com.example.login_cadastro_firebase.activity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login_cadastro_firebase.R;

public class Cadastro_email_2 extends AppCompatActivity {

    private Button btnEnviar;
    private EditText edt_email,edt_Senha,edt_confSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_email2);

        btnEnviar = findViewById(R.id.btnEnviar);
        edt_email = findViewById(R.id.edt_email);
        edt_Senha = findViewById(R.id.edt_Senha);
        edt_confSenha = findViewById(R.id.edt_confSenha);

        String email = edt_email.getText().toString();
        String senha = edt_Senha.getText().toString();
        String confSenha = edt_confSenha.getText().toString();



        //criando evento que ira enviar os dados para o firebase
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //iniciando a validação dos dados
                //iniciando no campo email
                if((email == null)||(email.trim().equals(""))){
                    Toast.makeText(getApplicationContext(),"O campo E-mail nao pode estar vazio",Toast.LENGTH_LONG).show();
                    edt_email.requestFocus();
                }else {
                    if ((senha == null) || (senha.trim().equals(""))) {
                        Toast.makeText(getApplicationContext(), "O campo Senha nao pode estar vazio", Toast.LENGTH_LONG).show();
                        edt_Senha.requestFocus();
                    } else {
                        if ((confSenha == null) || (confSenha.trim().equals(""))) {
                            Toast.makeText(getApplicationContext(), "O campo Confirmar senha nao pode estar vazio", Toast.LENGTH_LONG).show();
                            edt_confSenha.requestFocus();
                        } else {
                            if (!senha.equals(confSenha)) {
                                Toast.makeText(getApplicationContext(), "Os campos 'senha' e 'confirmar senha' devem ser iguais", Toast.LENGTH_LONG).show();
                                edt_confSenha.requestFocus();
                            } else {
                                //recuperando os dados contidos na primeira parte do formulario
                                Bundle DadosRecebidos = getIntent().getExtras();
                                String nomeRecb = DadosRecebidos.getString("nome");
                                String dataRecb = DadosRecebidos.getString("data");
                            }

                        }

                    }
                }
            }
        });


    }
}