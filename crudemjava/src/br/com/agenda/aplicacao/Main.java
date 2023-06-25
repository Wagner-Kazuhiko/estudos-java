package br.com.agenda.aplicacao;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ContatoDao contatoDao = new ContatoDao();

        Contato contato = new Contato();
        contato.setNome("Maria Gabriela");
        contato.setId(55);
        contato.setDataCadastro(new Date());

        contatoDao.save(contato);
    }
}
