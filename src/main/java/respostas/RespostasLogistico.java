package respostas;

import entities.Areas;

public class RespostasLogistico {

//	AREAS FORTES DO LOGISTICO SÃO = ANALISE DE DADOS, CIÊNCIA DA COMPUTAÇÃO E TECNOLOGIA DA INFORMAÇÃO

	Areas areasTecnologia = new Areas();

	int respostaSim = 6;
	int respostaNao = 3;
	int respostaNaoSeiAreaForte = 1;
	int respostaNaoSeiAreaFraca = 2;
//	int resultadoEngenhariaDaComputacao;
//	int resultadoAnaliseDeDados;
//	int resultadoWebDesign;
//	int resultadoEcommerce;
//	int resultadoCienciaDaComputacao;
//	int resultadoTecnologiaDaInformacao;
//	int repositorioEngenhariaDaComputacao;
//	int repositorioAnaliseDeDados;
//	int repositorioWebDesign;
//	int repositorioEcommerce;
//	int repositorioCienciaDaComputacao;
//	int repositorioTecnologiaDaInformacao;

	public int respostaLogistico(char acaoResponderPerguntaLogistico, int resultadoEngenhariaDaComputacao,
			int resultadoAnaliseDeDados, int resultadoWebDesign, int resultadoEcommerce,
			int resultadoCienciaDaComputacao, int resultadoTecnologiaDaInformacao) {

		if (acaoResponderPerguntaLogistico == 's') {

			resultadoAnaliseDeDados = 6;
			areasTecnologia.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
//			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
//			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
//			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
//			resultadoWebDesign = repositorioWebDesign + respostaNao;
//			resultadoEcommerce = repositorioEcommerce + respostaNao;

		}

		if (acaoResponderPerguntaLogistico == 'n') {

//			resultadoWebDesign = repositorioWebDesign + respostaSim;
//			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
//			resultadoEcommerce = repositorioEcommerce + respostaSim;
//			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
//			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;
//			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaLogistico == 'k') {

//			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaForte;
//			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaForte;
//			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaForte;
//			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaFraca;
//			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaFraca;
//			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaFraca;
		}
		return resultadoAnaliseDeDados;
	}
}