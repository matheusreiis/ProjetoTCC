package respostas;

import entities.Areas;

public class RespostasComandante {

//	AREAS FORTES DO VIRTUOSO SÃO = ENGENHARIA DA COMPUTAÇÃO, CIÊNCIA DA COMPUTAÇÃO E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaComandante(char acaoResponderPerguntaComandante) {

		if (acaoResponderPerguntaComandante == 's') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;

		}

		if (acaoResponderPerguntaComandante == 'n') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaComandante == 'k') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaForte;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaForte;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaForte;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaFraca;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaFraca;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaFraca;
		}
	}
}