package respostas;

import entities.Areas;

public class RespostasProtagonista {

//	AREAS FORTES DO PROTAGONISTA SÃO = ENGENHARIA DA COMPUTAÇÃO, WEB DESIGN, CIÊNCIA DA COMPUTAÇÃO

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

	public void respostaProtagonista(char acaoResponderPerguntaProtagonista) {

		if (acaoResponderPerguntaProtagonista == 's') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaProtagonista == 'n') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;

		}

		if (acaoResponderPerguntaProtagonista == 'k') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaForte;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaForte;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaForte;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaFraca;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaFraca;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaFraca;
		}
	}
}