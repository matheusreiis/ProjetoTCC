package main;

import org.apache.log4j.Logger;

import desenvolvimento.PerguntasERespostas;

public class Principal {

	private final static Logger LOG = Logger.getLogger(Principal.class);

	public static void main(String[] args) {

		PerguntasERespostas perguntasERespostas = new PerguntasERespostas();

		LOG.info("########## INICIO DO BACKEND ##########");

		perguntasERespostas.desenvolvimentoDeRespostas();

	}

}
