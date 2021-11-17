package respostas;

import entities.Areas;

public class RespostasLogico {

//	AREAS FORTES DO LOGICO SÃO = WEB DESIGN, ECOMMERCE E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaLogico(char acaoResponderPerguntaLogico) {

		if (acaoResponderPerguntaLogico == 's') {

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaSim;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaSim;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaSim;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNao;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNao;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNao;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}

		if (acaoResponderPerguntaLogico == 'n') {

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaSim;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaSim;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaSim;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNao;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNao;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNao;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

		}

		if (acaoResponderPerguntaLogico == 'k') {

			resultadoWebDesign = Areas.getResultadoWebDesign() + respostaNaoSeiAreaForte;
			Areas.setResultadoWebDesign(resultadoWebDesign);

			resultadoEcommerce = Areas.getResultadoEcommerce() + respostaNaoSeiAreaForte;
			Areas.setResultadoEcommerce(resultadoEcommerce);

			resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + respostaNaoSeiAreaForte;
			Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);

			resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + respostaNaoSeiAreaFraca;
			Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);

			resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + respostaNaoSeiAreaFraca;
			Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);

			resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + respostaNaoSeiAreaFraca;
			Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

		}
	}
}