package respostas;

import entities.Areas;

public class RespostasAdvogado {

//	AREAS FORTES DO ADVOGADO SÃO = ANALISE DE DADOS, ECOMMERCE E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaAdvogado(char acaoResponderPerguntaAdvogado) {

		if (acaoResponderPerguntaAdvogado == 's') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoWebDesign = repositorioWebDesign + respostaNao;

		}

		if (acaoResponderPerguntaAdvogado == 'n') {

			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaNao;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaAdvogado == 'k') {

			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaForte;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaForte;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaForte;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaFraca;
		}
	}
}