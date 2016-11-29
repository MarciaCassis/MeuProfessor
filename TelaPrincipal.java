package com.marciacassis.meuprofessor;

/**
 * Created by MarciaCassis on 28/11/2016.
 */

import android.view.View;
import android.widget.Button;

public class TelaPrincipal {

    MainActivityTelaPrincipal act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;

    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;

    public TelaPrincipal(MainActivityTelaPrincipal act) {

        this.act = act;
    }

    public void CarregarTela()
    {
        act.setContentView(R.layout.activity_main_tela_principal);
        btcadastrar_usuario = (Button) act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = (Button) act.findViewById(R.id.bt_Listar_usuarios);


        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tela_cadastro.CarregarTela();
            }
        });

        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tela_listagem.CarregarTela();
            }
        });

    }

    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro)
    {
        this.tela_cadastro = tela_cadastro;
    }
    public void setTelaListagem(TelaListagemUsuarios tela_listagem)
    {
        this.tela_listagem = tela_listagem;
    }

}
