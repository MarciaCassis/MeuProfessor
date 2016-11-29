package com.marciacassis.meuprofessor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

public class MainActivityTelaPrincipal extends Activity {

    private ArrayList<Registro> aRegistro;

    TelaPrincipal tela_principal;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aRegistro = new ArrayList<Registro>();

        tela_principal = new TelaPrincipal(this);
        tela_cadastro = new TelaCadastroUsuario(this, tela_principal);
        tela_listagem = new TelaListagemUsuarios(this, tela_principal);

        tela_principal.setTelaCadastro(tela_cadastro);
        tela_principal.setTelaListagem(tela_listagem);

        tela_principal.CarregarTela();
    }
    public ArrayList<Registro> getRegistros() {
        return aRegistro;
    }

    public void ExibirMensagem(String msg) {
        AlertDialog.Builder d = new AlertDialog.Builder(MainActivityTelaPrincipal.this);
        d.setTitle("Aviso");
        d.setMessage(msg);
        d.setNeutralButton("OK", null);
        d.show();

    }




}

