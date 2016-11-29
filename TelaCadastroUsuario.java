package com.marciacassis.meuprofessor;

/**
 * Created by MarciaCassis on 28/11/2016.
 */

/**
 * Created by MarciaCassis on 27/11/2016.
 */

import android.app.*;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastroUsuario {

    MainActivityTelaPrincipal act;
    EditText ednome, edemail, edtelefone, eddisciplina;
    Button btcadastrar, btcancelar_cadastro;
    TelaPrincipal tela_principal;


    public TelaCadastroUsuario(MainActivityTelaPrincipal act, TelaPrincipal tela_principal) {

        this.act = act;
        this.tela_principal = tela_principal;
    }

    public void CarregarTela()
    {
        act.setContentView(R.layout.cadastro_de_usuario);
        ednome = (EditText) act.findViewById(R.id.ednome);
        edemail = (EditText) act.findViewById(R.id.edemail);
        edtelefone = (EditText) act.findViewById(R.id.edtelefone);
        eddisciplina = (EditText) act.findViewById(R.id.eddisciplina);

        btcadastrar = (Button) act.findViewById(R.id.btcadastrar);
        btcancelar_cadastro = (Button) act.findViewById(R.id.btcancelar_cadastro);

        btcadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);

                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar usuário ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new
                        DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                String nome = ednome.getText().toString();
                                String email = edemail.getText().toString();
                                String telefone = edtelefone.getText().toString();
                                String disciplina = eddisciplina.getText().toString();

                                act.getRegistros().add(new Registro(nome,email, telefone, disciplina));
                                act.ExibirMensagem("Cadastro efetuado com sucesso!");
                                tela_principal.CarregarTela();
                            }
                        });
                dialogo.show();
            }
        });
        btcancelar_cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Sair do cadastro ?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tela_principal.CarregarTela();
                    }
                });
                dialogo.show();
            }
        });
    }
}