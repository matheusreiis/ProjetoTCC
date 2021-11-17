package respostas;

import entities.Areas;

public class RespostasExecutivo {

//	AREAS FORTES DO EXECUTIVO SÃO = ENGENHARIA DA COMPUTAÇÃO, ANALISE DE DADOS E CIENCIA DA COMPUTAÇÃO

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

	public void respostaExecutivo(char acaoResponderPerguntaExecutivo) {

		if (acaoResponderPerguntaExecutivo == 's') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaExecutivo == 'n') {

			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;

		}

		if (acaoResponderPerguntaExecutivo == 'k') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaForte;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaForte;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaForte;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaFraca;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaFraca;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaFraca;
		}
	}
}