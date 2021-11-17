package respostas;

import entities.Areas;

public class RespostasComandante {

//	AREAS FORTES DO VIRTUOSO SÃO = ENGENHARIA DA COMPUTAÇÃO, CIÊNCIA DA COMPUTAÇÃO E TECNOLOGIA DA INFORMAÇÃO

	Areas areasTecnologia = new Areas();

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

	public void respostaComandante(char acaoResponderPerguntaComandante) {

		if (acaoResponderPerguntaComandante == 's') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaSim;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaSim;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaSim;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNao;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNao;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNao;
			Areas.setResultadoEcommerce(resultadoEcommerce);

		}

		if (acaoResponderPerguntaComandante == 'n') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaSim;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaSim;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaSim;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNao;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNao;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNao;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

		}

		if (acaoResponderPerguntaComandante == 'k') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNaoSeiAreaForte;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNaoSeiAreaFraca;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNaoSeiAreaFraca;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEcommerce(resultadoEcommerce);

		}
	}
}