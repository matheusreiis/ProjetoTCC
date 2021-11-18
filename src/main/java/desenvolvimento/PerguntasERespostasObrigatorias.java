package desenvolvimento;

import java.util.Scanner;

import org.apache.log4j.Logger;

import entities.Areas;
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

public class PerguntasERespostasObrigatorias {

	private static final Logger LOG = Logger.getLogger(PerguntasERespostasObrigatorias.class);

	int resultadoEngenhariaDeSoftware;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;

	PerguntasObrigatorias perguntasObrigatorias = new PerguntasObrigatorias();
	Resultados resultados = new Resultados();
	PerguntasERespostasExtras perguntasExtras = new PerguntasERespostasExtras();
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

		LOG.info("PERGUNTA 1: " + perguntasObrigatorias.perguntaLogistico);
		char acaoResponderPerguntaLogistico = sc.next().charAt(0);

		if (acaoResponderPerguntaLogistico == 's' || acaoResponderPerguntaLogistico == 'n'
				|| acaoResponderPerguntaLogistico == 'k') {
			respostasLogistico.respostaLogistico(acaoResponderPerguntaLogistico);
		}

		LOG.info("PERGUNTA 2: " + perguntasObrigatorias.perguntaDefensor);
		char acaoResponderPerguntaDefensor = sc.next().charAt(0);

		if (acaoResponderPerguntaDefensor == 's' || acaoResponderPerguntaDefensor == 'n'
				|| acaoResponderPerguntaDefensor == 'k') {
			respostasDefensor.respostaDefensor(acaoResponderPerguntaDefensor);
		}

		LOG.info("PERGUNTA 3: " + perguntasObrigatorias.perguntaAdvogado);
		char acaoResponderPerguntaAdvogado = sc.next().charAt(0);

		if (acaoResponderPerguntaAdvogado == 's' || acaoResponderPerguntaAdvogado == 'n'
				|| acaoResponderPerguntaAdvogado == 'k') {
			respostasAdvogado.respostaAdvogado(acaoResponderPerguntaAdvogado);
		}

		LOG.info("PERGUNTA 4: " + perguntasObrigatorias.perguntaArquiteto);
		char acaoResponderPerguntaArquiteto = sc.next().charAt(0);

		if (acaoResponderPerguntaArquiteto == 's' || acaoResponderPerguntaArquiteto == 'n'
				|| acaoResponderPerguntaArquiteto == 'k') {
			respostasArquiteto.respostaArquiteto(acaoResponderPerguntaArquiteto);
		}

		LOG.info("PERGUNTA 5: " + perguntasObrigatorias.perguntaVirtuoso);
		char acaoResponderPerguntaVirtuoso = sc.next().charAt(0);

		if (acaoResponderPerguntaVirtuoso == 's' || acaoResponderPerguntaVirtuoso == 'n'
				|| acaoResponderPerguntaVirtuoso == 'k') {
			respostasVirtuoso.respostaVirtuoso(acaoResponderPerguntaVirtuoso);
		}

		LOG.info("PERGUNTA 6: " + perguntasObrigatorias.perguntaAventureiro);
		char acaoResponderPerguntaAventureiro = sc.next().charAt(0);

		if (acaoResponderPerguntaAventureiro == 's' || acaoResponderPerguntaAventureiro == 'n'
				|| acaoResponderPerguntaAventureiro == 'k') {
			respostasAventureiro.respostaAventureiro(acaoResponderPerguntaAventureiro);
		}

		LOG.info("PERGUNTA 7: " + perguntasObrigatorias.perguntaMediador);
		char acaoResponderPerguntaMediador = sc.next().charAt(0);

		if (acaoResponderPerguntaMediador == 's' || acaoResponderPerguntaMediador == 'n'
				|| acaoResponderPerguntaMediador == 'k') {
			respostasMediador.respostaMediador(acaoResponderPerguntaMediador);
		}

		LOG.info("PERGUNTA 8: " + perguntasObrigatorias.perguntaLogico);
		char acaoResponderPerguntaLogico = sc.next().charAt(0);

		if (acaoResponderPerguntaLogico == 's' || acaoResponderPerguntaLogico == 'n'
				|| acaoResponderPerguntaLogico == 'k') {
			respostasLogico.respostaLogico(acaoResponderPerguntaLogico);
		}

		LOG.info("PERGUNTA 9: " + perguntasObrigatorias.perguntaLogico);
		char acaoResponderPerguntaEmpresario = sc.next().charAt(0);

		if (acaoResponderPerguntaEmpresario == 's' || acaoResponderPerguntaEmpresario == 'n'
				|| acaoResponderPerguntaEmpresario == 'k') {
			respostasEmpresario.respostaEmpresario(acaoResponderPerguntaEmpresario);
		}

		LOG.info("PERGUNTA 10: " + perguntasObrigatorias.perguntaAnimador);
		char acaoResponderPerguntaAnimador = sc.next().charAt(0);

		if (acaoResponderPerguntaAnimador == 's' || acaoResponderPerguntaAnimador == 'n'
				|| acaoResponderPerguntaAnimador == 'k') {
			respostasAnimador.respostaAnimador(acaoResponderPerguntaAnimador);
		}

		LOG.info("PERGUNTA 11: " + perguntasObrigatorias.perguntaAtivista);
		char acaoResponderPerguntaAtivista = sc.next().charAt(0);

		if (acaoResponderPerguntaAtivista == 's' || acaoResponderPerguntaAtivista == 'n'
				|| acaoResponderPerguntaAtivista == 'k') {
			respostasAtivista.respostaAtivista(acaoResponderPerguntaAtivista);
		}

		LOG.info("PERGUNTA 12: " + perguntasObrigatorias.perguntaInovador);
		char acaoResponderPerguntaInovador = sc.next().charAt(0);

		if (acaoResponderPerguntaInovador == 's' || acaoResponderPerguntaInovador == 'n'
				|| acaoResponderPerguntaInovador == 'k') {
			respostasInovador.respostaInovador(acaoResponderPerguntaInovador);
		}

		LOG.info("PERGUNTA 13: " + perguntasObrigatorias.perguntaExecutivo);
		char acaoResponderPerguntaExecutivo = sc.next().charAt(0);

		if (acaoResponderPerguntaExecutivo == 's' || acaoResponderPerguntaExecutivo == 'n'
				|| acaoResponderPerguntaExecutivo == 'k') {
			respostasExecutivo.respostaExecutivo(acaoResponderPerguntaExecutivo);
		}

		LOG.info("PERGUNTA 14: " + perguntasObrigatorias.perguntaConsul);
		char acaoResponderPerguntaConsul = sc.next().charAt(0);

		if (acaoResponderPerguntaConsul == 's' || acaoResponderPerguntaConsul == 'n'
				|| acaoResponderPerguntaConsul == 'k') {
			respostasConsul.respostaConsul(acaoResponderPerguntaConsul);
		}

		LOG.info("PERGUNTA 15: " + perguntasObrigatorias.perguntaProtagonista);
		char acaoResponderPerguntaProtagonista = sc.next().charAt(0);

		if (acaoResponderPerguntaProtagonista == 's' || acaoResponderPerguntaProtagonista == 'n'
				|| acaoResponderPerguntaProtagonista == 'k') {
			respostasProtagonista.respostaProtagonista(acaoResponderPerguntaProtagonista);
		}

		LOG.info("PERGUNTA 16: " + perguntasObrigatorias.perguntaComandante);
		char acaoResponderPerguntaComandante = sc.next().charAt(0);

		if (acaoResponderPerguntaComandante == 's' || acaoResponderPerguntaComandante == 'n'
				|| acaoResponderPerguntaComandante == 'k') {
			respostasComandante.respostaComandante(acaoResponderPerguntaComandante);
		}

		LOG.info("### FIM DAS PERGUNTAS OBRIGATORIAS ###");

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoAnaliseDeDados()
				|| Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoWebDesign()
				|| Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoEcommerce()
				|| Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoCienciaDaComputacao()
				|| Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoTecnologiaDaInformacao()
				|| Areas.getResultadoAnaliseDeDados() == Areas.getResultadoWebDesign()
				|| Areas.getResultadoAnaliseDeDados() == Areas.getResultadoEcommerce()
				|| Areas.getResultadoAnaliseDeDados() == Areas.getResultadoCienciaDaComputacao()
				|| Areas.getResultadoAnaliseDeDados() == Areas.getResultadoTecnologiaDaInformacao()
				|| Areas.getResultadoWebDesign() == Areas.getResultadoEcommerce()
				|| Areas.getResultadoWebDesign() == Areas.getResultadoCienciaDaComputacao()
				|| Areas.getResultadoWebDesign() == Areas.getResultadoTecnologiaDaInformacao()
				|| Areas.getResultadoEcommerce() == Areas.getResultadoCienciaDaComputacao()
				|| Areas.getResultadoEcommerce() == Areas.getResultadoTecnologiaDaInformacao()
				|| Areas.getResultadoCienciaDaComputacao() == Areas.getResultadoTecnologiaDaInformacao()) {
			

			LOG.info(Areas.getResultadoEngenhariaDeSoftware());
			LOG.info(Areas.getResultadoAnaliseDeDados());
			LOG.info(Areas.getResultadoWebDesign());
			LOG.info(Areas.getResultadoEcommerce());
			LOG.info(Areas.getResultadoCienciaDaComputacao());
			LOG.info(Areas.getResultadoTecnologiaDaInformacao());

			perguntasExtras.perguntasERespostasExtras();
		}
		resultados.resultadosPersonalidades();
	}
}
