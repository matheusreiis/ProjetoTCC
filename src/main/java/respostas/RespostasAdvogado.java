package respostas;

import entities.Areas;

public class RespostasAdvogado {

//	AREAS FORTES DO ADVOGADO SÃO = ANALISE DE DADOS, ECOMMERCE E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaAdvogado(char acaoResponderPerguntaAdvogado) {

		if (acaoResponderPerguntaAdvogado == 's') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaSim;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaSim;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaSim;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNao;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNao;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNao;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}

		if (acaoResponderPerguntaAdvogado == 'n') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaSim;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaSim;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaSim;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNao;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNao;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNao;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

		}

		if (acaoResponderPerguntaAdvogado == 'k') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNaoSeiAreaForte;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNaoSeiAreaForte;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNaoSeiAreaFraca;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNaoSeiAreaFraca;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}
	}
}