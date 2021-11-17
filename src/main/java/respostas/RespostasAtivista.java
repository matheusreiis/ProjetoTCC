package respostas;

import entities.Areas;

public class RespostasAtivista {

//	AREAS FORTES DO ATIVISTA SÃO = ENGENHARIA DA COMPUTAÇÃO, WEB DESIGN E ECOMMERCE

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

	public void respostaAtivista(char acaoResponderPerguntaAtivista) {

		if (acaoResponderPerguntaAtivista == 's') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaAtivista == 'n') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;

		}

		if (acaoResponderPerguntaAtivista == 'k') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaForte;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaForte;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaForte;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaFraca;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaFraca;
		}
	}
}