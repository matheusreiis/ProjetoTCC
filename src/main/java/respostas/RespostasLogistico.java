package respostas;

import entities.Areas;

public class RespostasLogistico {

//	AREAS FORTES DO LOGISTICO SÃO = ANALISE DE DADOS, CIÊNCIA DA COMPUTAÇÃO E TECNOLOGIA DA INFORMAÇÃO

	int respostaSim = 6;
	int respostaNao = 3;
	int respostaNaoSeiAreaForte = 1;
	int respostaNaoSeiAreaFraca = 2;
	int resultadoEngenhariaDeSoftware;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;

	public void respostaLogistico(char acaoResponderPerguntaLogistico) {

		if (acaoResponderPerguntaLogistico == 's') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaSim;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaSim;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaSim;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNao;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNao;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNao;
			Areas.setResultadoEcommerce(resultadoEcommerce);
		}

		if (acaoResponderPerguntaLogistico == 'n') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaSim;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaSim;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaSim;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNao;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNao;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNao;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

		}

		if (acaoResponderPerguntaLogistico == 'k') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNaoSeiAreaForte;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNaoSeiAreaFraca;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEcommerce(resultadoEcommerce);
		}
	}
}