package main;

import org.apache.log4j.Logger;

import desenvolvimento.PerguntasERespostasObrigatorias;

public class Principal {

	private final static Logger LOG = Logger.getLogger(Principal.class);

	public static void main(String[] args) {

		PerguntasERespostasObrigatorias perguntasERespostas = new PerguntasERespostasObrigatorias();

		LOG.info("########## INICIO DO BACKEND ##########");

		perguntasERespostas.desenvolvimentoDeRespostas();

	}

}
