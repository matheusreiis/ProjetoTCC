package desenvolvimento;

import java.util.Scanner;

import org.apache.log4j.Logger;

import entities.Areas;
import entities.PerguntasExtras;
import entities.PerguntasObrigatorias;
import respostas.RespostasAdvogado;
import respostas.RespostasAnimador;
import respostas.RespostasArquiteto;
import respostas.RespostasAtivista;
import respostas.RespostasAventureiro;
import respostas.RespostasComandante;
import respostas.RespostasConsul;
import respostas.RespostasDefensor;
import respostas.RespostasEmpresario;
import respostas.RespostasExecutivo;
import respostas.RespostasInovador;
import respostas.RespostasLogico;
import respostas.RespostasLogistico;
import respostas.RespostasMediador;
import respostas.RespostasProtagonista;
import respostas.RespostasVirtuoso;

public class PerguntasERespostas {

	private static final Logger LOG = Logger.getLogger(PerguntasERespostas.class);

	int resultadoEngenhariaDaComputacao;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;
	int resultadoFinal;

	Areas areasTecnologia = new Areas();
	PerguntasObrigatorias perguntasObrigatorias = new PerguntasObrigatorias();
	PerguntasExtras perguntasExtras = new PerguntasExtras();
	RespostasLogistico respostasLogistico = new RespostasLogistico();
	RespostasDefensor respostasDefensor = new RespostasDefensor();
	RespostasAdvogado respostasAdvogado = new RespostasAdvogado();
	RespostasArquiteto respostasArquiteto = new RespostasArquiteto();
	RespostasVirtuoso respostasVirtuoso = new RespostasVirtuoso();
	RespostasAventureiro respostasAventureiro = new RespostasAventureiro();
	RespostasMediador respostasMediador = new RespostasMediador();
	RespostasLogico respostasLogico = new RespostasLogico();
	RespostasEmpresario respostasEmpresario = new RespostasEmpresario();
	RespostasAnimador respostasAnimador = new RespostasAnimador();
	RespostasAtivista respostasAtivista = new RespostasAtivista();
	RespostasInovador respostasInovador = new RespostasInovador();
	RespostasExecutivo respostasExecutivo = new RespostasExecutivo();
	RespostasConsul respostasConsul = new RespostasConsul();
	RespostasProtagonista respostasProtagonista = new RespostasProtagonista();
	RespostasComandante respostasComandante = new RespostasComandante();
	Scanner sc = new Scanner(System.in);

	public void desenvolvimentoDeRespostas() {

		LOG.info("#### PERGUNTAS IPERSON ####");

		System.lineSeparator();
		LOG.info("PERGUNTA 1: " + perguntasObrigatorias.perguntaLogistico);
		char acaoResponderPerguntaLogistico = sc.next().charAt(0);

		if (acaoResponderPerguntaLogistico == 's' || acaoResponderPerguntaLogistico == 'n'
				|| acaoResponderPerguntaLogistico == 'k') {
			respostasLogistico.respostaLogistico(acaoResponderPerguntaLogistico, resultadoEngenhariaDaComputacao,
					resultadoAnaliseDeDados, resultadoWebDesign, resultadoEcommerce, resultadoCienciaDaComputacao,
					resultadoTecnologiaDaInformacao);
			LOG.info(areasTecnologia.getResultadoAnaliseDeDados());
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 2: " + perguntasObrigatorias.perguntaDefensor);
		char acaoResponderPerguntaDefensor = sc.next().charAt(0);

		if (acaoResponderPerguntaDefensor == 's' || acaoResponderPerguntaDefensor == 'n'
				|| acaoResponderPerguntaDefensor == 'k') {
			respostasDefensor.respostaDefensor(acaoResponderPerguntaDefensor);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 3: " + perguntasObrigatorias.perguntaAdvogado);
		char acaoResponderPerguntaAdvogado = sc.next().charAt(0);

		if (acaoResponderPerguntaAdvogado == 's' || acaoResponderPerguntaAdvogado == 'n'
				|| acaoResponderPerguntaAdvogado == 'k') {
			respostasAdvogado.respostaAdvogado(acaoResponderPerguntaAdvogado);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 4: " + perguntasObrigatorias.perguntaArquiteto);
		char acaoResponderPerguntaArquiteto = sc.next().charAt(0);

		if (acaoResponderPerguntaArquiteto == 's' || acaoResponderPerguntaArquiteto == 'n'
				|| acaoResponderPerguntaArquiteto == 'k') {
			respostasArquiteto.respostaArquiteto(acaoResponderPerguntaArquiteto);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 5: " + perguntasObrigatorias.perguntaVirtuoso);
		char acaoResponderPerguntaVirtuoso = sc.next().charAt(0);

		if (acaoResponderPerguntaVirtuoso == 's' || acaoResponderPerguntaVirtuoso == 'n'
				|| acaoResponderPerguntaVirtuoso == 'k') {
			respostasVirtuoso.respostaVirtuoso(acaoResponderPerguntaVirtuoso);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 6: " + perguntasObrigatorias.perguntaAventureiro);
		char acaoResponderPerguntaAventureiro = sc.next().charAt(0);

		if (acaoResponderPerguntaAventureiro == 's' || acaoResponderPerguntaAventureiro == 'n'
				|| acaoResponderPerguntaAventureiro == 'k') {
			respostasAventureiro.respostaAventureiro(acaoResponderPerguntaAventureiro);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 7: " + perguntasObrigatorias.perguntaMediador);
		char acaoResponderPerguntaMediador = sc.next().charAt(0);

		if (acaoResponderPerguntaMediador == 's' || acaoResponderPerguntaMediador == 'n'
				|| acaoResponderPerguntaMediador == 'k') {
			respostasMediador.respostaMediador(acaoResponderPerguntaMediador);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 8: " + perguntasObrigatorias.perguntaLogico);
		char acaoResponderPerguntaLogico = sc.next().charAt(0);

		if (acaoResponderPerguntaLogico == 's' || acaoResponderPerguntaLogico == 'n'
				|| acaoResponderPerguntaLogico == 'k') {
			respostasLogico.respostaLogico(acaoResponderPerguntaLogico);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 9: " + perguntasObrigatorias.perguntaLogico);
		char acaoResponderPerguntaEmpresario = sc.next().charAt(0);

		if (acaoResponderPerguntaEmpresario == 's' || acaoResponderPerguntaEmpresario == 'n'
				|| acaoResponderPerguntaEmpresario == 'k') {
			respostasEmpresario.respostaEmpresario(acaoResponderPerguntaEmpresario);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 10: " + perguntasObrigatorias.perguntaAnimador);
		char acaoResponderPerguntaAnimador = sc.next().charAt(0);

		if (acaoResponderPerguntaAnimador == 's' || acaoResponderPerguntaAnimador == 'n'
				|| acaoResponderPerguntaAnimador == 'k') {
			respostasAnimador.respostaAnimador(acaoResponderPerguntaAnimador);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 11: " + perguntasObrigatorias.perguntaAtivista);
		char acaoResponderPerguntaAtivista = sc.next().charAt(0);

		if (acaoResponderPerguntaAtivista == 's' || acaoResponderPerguntaAtivista == 'n'
				|| acaoResponderPerguntaAtivista == 'k') {
			respostasAtivista.respostaAtivista(acaoResponderPerguntaAtivista);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 12: " + perguntasObrigatorias.perguntaInovador);
		char acaoResponderPerguntaInovador = sc.next().charAt(0);

		if (acaoResponderPerguntaInovador == 's' || acaoResponderPerguntaInovador == 'n'
				|| acaoResponderPerguntaInovador == 'k') {
			respostasInovador.respostaInovador(acaoResponderPerguntaInovador);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 13: " + perguntasObrigatorias.perguntaExecutivo);
		char acaoResponderPerguntaExecutivo = sc.next().charAt(0);

		if (acaoResponderPerguntaExecutivo == 's' || acaoResponderPerguntaExecutivo == 'n'
				|| acaoResponderPerguntaExecutivo == 'k') {
			respostasExecutivo.respostaExecutivo(acaoResponderPerguntaExecutivo);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 14: " + perguntasObrigatorias.perguntaConsul);
		char acaoResponderPerguntaConsul = sc.next().charAt(0);

		if (acaoResponderPerguntaConsul == 's' || acaoResponderPerguntaConsul == 'n'
				|| acaoResponderPerguntaConsul == 'k') {
			respostasConsul.respostaConsul(acaoResponderPerguntaConsul);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 15: " + perguntasObrigatorias.perguntaProtagonista);
		char acaoResponderPerguntaProtagonista = sc.next().charAt(0);

		if (acaoResponderPerguntaProtagonista == 's' || acaoResponderPerguntaProtagonista == 'n'
				|| acaoResponderPerguntaProtagonista == 'k') {
			respostasProtagonista.respostaProtagonista(acaoResponderPerguntaProtagonista);
		}

		System.lineSeparator();
		LOG.info("PERGUNTA 16: " + perguntasObrigatorias.perguntaComandante);
		char acaoResponderPerguntaComandante = sc.next().charAt(0);

		if (acaoResponderPerguntaComandante == 's' || acaoResponderPerguntaComandante == 'n'
				|| acaoResponderPerguntaComandante == 'k') {
			respostasComandante.respostaComandante(acaoResponderPerguntaComandante);
		}

//		FIM DAS PERGUNTAS OBRIGATÓRIAS

		if (resultadoEngenhariaDaComputacao == resultadoAnaliseDeDados) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDaComputacaoExtra);
			char acaoResponderPerguntaEngenhariaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 's') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'n') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'k') {
				resultadoAnaliseDeDados = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (resultadoEngenhariaDaComputacao == resultadoAnaliseDeDados) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEAnalise);
				char acaoResponderPerguntaEngenhariaEAnaliseExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEAnaliseExtra == 's') {
					resultadoEngenhariaDaComputacao = +1;
				}

				if (acaoResponderPerguntaEngenhariaEAnaliseExtra == 'n') {
					resultadoAnaliseDeDados = +1;
				}
			}
		}

		if (resultadoEngenhariaDaComputacao == resultadoWebDesign) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDaComputacaoExtra);
			char acaoResponderPerguntaEngenhariaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 's') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'n') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'k') {
				resultadoWebDesign = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (resultadoEngenhariaDaComputacao == resultadoWebDesign) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEWeb);
				char acaoResponderPerguntaEngenhariaEWebExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEWebExtra == 's') {
					resultadoEngenhariaDaComputacao = +1;
				}

				if (acaoResponderPerguntaEngenhariaEWebExtra == 'n') {
					resultadoWebDesign = +1;
				}
			}
		}

		if (resultadoEngenhariaDaComputacao == resultadoEcommerce) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDaComputacaoExtra);
			char acaoResponderPerguntaEngenhariaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 's') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'n') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'k') {
				resultadoEcommerce = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (resultadoEngenhariaDaComputacao == resultadoEcommerce) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEEcommerce);
				char acaoResponderPerguntaEngenhariaEEcommerceExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEEcommerceExtra == 's') {
					resultadoEcommerce = +1;
				}

				if (acaoResponderPerguntaEngenhariaEEcommerceExtra == 'n') {
					resultadoEngenhariaDaComputacao = +1;
				}
			}
		}

		if (resultadoEngenhariaDaComputacao == resultadoCienciaDaComputacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDaComputacaoExtra);
			char acaoResponderPerguntaEngenhariaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 's') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'n') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'k') {
				resultadoCienciaDaComputacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (resultadoEngenhariaDaComputacao == resultadoCienciaDaComputacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaECiencia);
				char acaoResponderPerguntaEngenhariaECienciaExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaECienciaExtra == 's') {
					resultadoCienciaDaComputacao = +1;
				}

				if (acaoResponderPerguntaEngenhariaECienciaExtra == 'n') {
					resultadoEngenhariaDaComputacao = +1;
				}
			}
		}

		if (resultadoEngenhariaDaComputacao == resultadoTecnologiaDaInformacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDaComputacaoExtra);
			char acaoResponderPerguntaEngenhariaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 's') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'n') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaEngenhariaDaComputacaoExtra == 'k') {
				resultadoTecnologiaDaInformacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {
				resultadoEngenhariaDaComputacao = +1;
			}

			if (resultadoEngenhariaDaComputacao == resultadoTecnologiaDaInformacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaETecnologia);
				char acaoResponderPerguntaEngenhariaETecnologiaExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaETecnologiaExtra == 's') {
					resultadoEngenhariaDaComputacao = +1;
				}

				if (acaoResponderPerguntaEngenhariaETecnologiaExtra == 'n') {
					resultadoTecnologiaDaInformacao = +1;
				}
			}
		}

		if (resultadoAnaliseDeDados == resultadoWebDesign) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {
				resultadoWebDesign = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {
				resultadoAnaliseDeDados = +1;
			}

			if (resultadoAnaliseDeDados == resultadoWebDesign) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseEWeb);
				char acaoPerguntaAnaliseEWebExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseEWebExtra == 's') {
					resultadoAnaliseDeDados = +1;
				}

				if (acaoPerguntaAnaliseEWebExtra == 'n') {
					resultadoWebDesign = +1;
				}
			}
		}

		if (resultadoAnaliseDeDados == resultadoEcommerce) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {
				resultadoEcommerce = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {
				resultadoAnaliseDeDados = +1;
			}

			if (resultadoAnaliseDeDados == resultadoEcommerce) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseEEcommerce);
				char acaoPerguntaAnaliseEEcommerceExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseEEcommerceExtra == 's') {
					resultadoAnaliseDeDados = +1;
				}

				if (acaoPerguntaAnaliseEEcommerceExtra == 'n') {
					resultadoEcommerce = +1;
				}
			}
		}

		if (resultadoAnaliseDeDados == resultadoCienciaDaComputacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {
				resultadoCienciaDaComputacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {
				resultadoAnaliseDeDados = +1;
			}

			if (resultadoAnaliseDeDados == resultadoCienciaDaComputacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseECiencia);
				char acaoPerguntaAnaliseECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseECienciaExtra == 's') {
					resultadoCienciaDaComputacao = +1;
				}

				if (acaoPerguntaAnaliseECienciaExtra == 'n') {
					resultadoAnaliseDeDados = +1;
				}
			}
		}

		if (resultadoAnaliseDeDados == resultadoTecnologiaDaInformacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {
				resultadoTecnologiaDaInformacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 's') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 'n') {
				resultadoAnaliseDeDados = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 'k') {
				resultadoAnaliseDeDados = +1;
			}

			if (resultadoAnaliseDeDados == resultadoTecnologiaDaInformacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseETecnologia);
				char acaoPerguntaAnaliseETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseETecnologiaExtra == 's') {
					resultadoTecnologiaDaInformacao = +1;
				}

				if (acaoPerguntaAnaliseETecnologiaExtra == 'n') {
					resultadoAnaliseDeDados = +1;
				}
			}
		}

		if (resultadoWebDesign == resultadoEcommerce) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {
				resultadoEcommerce = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {
				resultadoWebDesign = +1;
			}

			if (resultadoWebDesign == resultadoEcommerce) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebEEcommerce);
				char acaoPerguntaWebDesignECommerceExtra = sc.next().charAt(0);

				if (acaoPerguntaWebDesignECommerceExtra == 's') {
					resultadoWebDesign = +1;
				}

				if (acaoPerguntaWebDesignECommerceExtra == 'n') {
					resultadoEcommerce = +1;
				}
			}
		}

		if (resultadoWebDesign == resultadoCienciaDaComputacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {
				resultadoCienciaDaComputacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {
				resultadoWebDesign = +1;
			}

			if (resultadoWebDesign == resultadoCienciaDaComputacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebECiencia);
				char acaoPerguntaWebECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaWebECienciaExtra == 's') {
					resultadoWebDesign = +1;
				}

				if (acaoPerguntaWebECienciaExtra == 'n') {
					resultadoCienciaDaComputacao = +1;
				}
			}
		}

		if (resultadoWebDesign == resultadoTecnologiaDaInformacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {
				resultadoTecnologiaDaInformacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {
				resultadoWebDesign = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {
				resultadoWebDesign = +1;
			}

			if (resultadoWebDesign == resultadoTecnologiaDaInformacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebETecnologia);
				char acaoPerguntaWebETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaWebETecnologiaExtra == 's') {
					resultadoTecnologiaDaInformacao = +1;
				}

				if (acaoPerguntaWebETecnologiaExtra == 'n') {
					resultadoWebDesign = +1;
				}
			}
		}

		if (resultadoEcommerce == resultadoCienciaDaComputacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {
				resultadoCienciaDaComputacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {
				resultadoEcommerce = +1;
			}

			if (resultadoEcommerce == resultadoCienciaDaComputacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEcommerceECiencia);
				char acaoPerguntaEcommerceECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaEcommerceECienciaExtra == 's') {
					resultadoEcommerce = +1;
				}

				if (acaoPerguntaEcommerceECienciaExtra == 'n') {
					resultadoCienciaDaComputacao = +1;
				}
			}
		}

		if (resultadoEcommerce == resultadoTecnologiaDaInformacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {
				resultadoTecnologiaDaInformacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {
				resultadoEcommerce = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {
				resultadoEcommerce = +1;
			}

			if (resultadoEcommerce == resultadoTecnologiaDaInformacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEcommerceETecnologia);
				char acaoPerguntaEcommerceETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaEcommerceETecnologiaExtra == 's') {
					resultadoEcommerce = +1;
				}

				if (acaoPerguntaEcommerceETecnologiaExtra == 'n') {
					resultadoTecnologiaDaInformacao = +1;
				}
			}
		}

		if (resultadoCienciaDaComputacao == resultadoTecnologiaDaInformacao) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {
				resultadoTecnologiaDaInformacao = +1;
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {
				resultadoTecnologiaDaInformacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {
				resultadoCienciaDaComputacao = +1;
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {
				resultadoCienciaDaComputacao = +1;
			}

			if (resultadoCienciaDaComputacao == resultadoTecnologiaDaInformacao) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaCienciaETecnologia);
				char acaoPerguntaCienciaETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaCienciaETecnologiaExtra == 's') {
					resultadoCienciaDaComputacao = +1;
				}

				if (acaoPerguntaCienciaETecnologiaExtra == 'n') {
					resultadoTecnologiaDaInformacao = +1;
				}
			}
		}
	}
}
