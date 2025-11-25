package com.example.androidpoo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogicaCadastro extends AppCompatActivity {

    EditText id_var, nome_var, documento_var, curso_var;
    Button btn_cadastrar, btn_visualizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        id_var = findViewById(R.id.etx_id);
        nome_var = findViewById(R.id.etx_nome);
        documento_var = findViewById(R.id.etx_documento);
        curso_var = findViewById(R.id.etx_curso);

        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        btn_visualizar = findViewById(R.id.btn_visualizar);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nome_var.getText().toString();
                String documento = documento_var.getText().toString();
                String curso = curso_var.getText().toString();

            }
        });

        btn_visualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mudar_tela = new Intent();
                startActivity(mudar_tela);
            }
        });
    }
}