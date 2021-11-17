package respostas;

import entities.Areas;

public class RespostasAventureiro {

//	AREAS FORTES DO AVENTUREIRO SÃO = ANALISE DE DADOS, WEB DESIGN E ECOMMERCE

	Areas areasTecnologia = new Areas();

	int respostaSim = 6;
	int respostaNao = 3;
	int respostaNaoSeiAreaForte = 1;
	int respostaNaoSeiAreaFraca = 2;
	int resultadoEngenhariaDaComputacao;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;
	int repositorioEngenhariaDaComputacao;
	int repositorioAnaliseDeDados;
	int repositorioWebDesign;
	int repositorioEcommerce;
	int repositorioCienciaDaComputacao;
	int repositorioTecnologiaDaInformacao;

	public void respostaAventureiro(char acaoResponderPerguntaAventureiro) {

		if (acaoResponderPerguntaAventureiro == 's') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaAventureiro == 'n') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;

		}

		if (acaoResponderPerguntaAventureiro == 'k') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaForte;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaForte;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaForte;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaFraca;
		}
	}
}