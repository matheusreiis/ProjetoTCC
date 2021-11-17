package respostas;

import entities.Areas;

public class RespostasInovador {

//	AREAS FORTES DO INOVADOR SÃO = ENGENHARIA DA COMPUTAÇÃO, WEB DESIGN E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaInovador(char acaoResponderPerguntaInovador) {

		if (acaoResponderPerguntaInovador == 's') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaSim;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaSim;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaSim;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNao;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNao;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNao;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}

		if (acaoResponderPerguntaInovador == 'n') {

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaSim;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaSim;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaSim;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNao;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNao;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNao;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

		}

		if (acaoResponderPerguntaInovador == 'k') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNaoSeiAreaForte;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNaoSeiAreaForte;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNaoSeiAreaFraca;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNaoSeiAreaFraca;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}
	}
}