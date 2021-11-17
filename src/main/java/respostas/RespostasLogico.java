package respostas;

import entities.Areas;

public class RespostasLogico {

//	AREAS FORTES DO LOGICO SÃO = WEB DESIGN, ECOMMERCE E TECNOLOGIA DA INFORMAÇÃO

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

	public void respostaLogico(char acaoResponderPerguntaLogico) {

		if (acaoResponderPerguntaLogico == 's') {

			resultadoWebDesign = repositorioWebDesign + respostaSim;
			resultadoEcommerce = repositorioEcommerce + respostaSim;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaSim;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNao;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNao;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNao;

		}

		if (acaoResponderPerguntaLogico == 'n') {

			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaSim;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaSim;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaSim;
			resultadoWebDesign = repositorioWebDesign + respostaNao;
			resultadoEcommerce = repositorioEcommerce + respostaNao;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNao;

		}

		if (acaoResponderPerguntaLogico == 'k') {

			resultadoWebDesign = repositorioWebDesign + respostaNaoSeiAreaForte;
			resultadoEcommerce = repositorioEcommerce + respostaNaoSeiAreaForte;
			resultadoTecnologiaDaInformacao = repositorioTecnologiaDaInformacao + respostaNaoSeiAreaForte;
			resultadoEngenhariaDaComputacao = repositorioEngenhariaDaComputacao + respostaNaoSeiAreaFraca;
			resultadoAnaliseDeDados = repositorioAnaliseDeDados + respostaNaoSeiAreaFraca;
			resultadoCienciaDaComputacao = repositorioCienciaDaComputacao + respostaNaoSeiAreaFraca;
		}
	}
}