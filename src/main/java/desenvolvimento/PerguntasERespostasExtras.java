package desenvolvimento;

import java.util.Scanner;

import org.apache.log4j.Logger;

import entities.Areas;
import entities.PerguntasExtras;

public class PerguntasERespostasExtras {

	private static final Logger LOG = Logger.getLogger(PerguntasERespostasExtras.class);

	int resultadoEngenhariaDeSoftware;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;

	PerguntasExtras perguntasExtras = new PerguntasExtras();
	Resultados resultados = new Resultados();
	Scanner sc = new Scanner(System.in);

	public void perguntasERespostasExtras() {

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoAnaliseDeDados()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDeSoftwareExtra);
			char acaoResponderPerguntaEngenhariaDeSoftwareExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 's') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'n') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'k') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoAnaliseDeDados()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEAnalise);
				char acaoResponderPerguntaEngenhariaEAnaliseExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEAnaliseExtra == 's') {

					resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
					Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
				}

				if (acaoResponderPerguntaEngenhariaEAnaliseExtra == 'n') {

					resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
					Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
				}
			}
		}

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoWebDesign()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDeSoftwareExtra);
			char acaoResponderPerguntaEngenhariaDeSoftwarextra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDeSoftwarextra == 's') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwarextra == 'n') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwarextra == 'k') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoWebDesign()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEWeb);
				char acaoResponderPerguntaEngenhariaEWebExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEWebExtra == 's') {

					resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
					Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
				}

				if (acaoResponderPerguntaEngenhariaEWebExtra == 'n') {

					resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
					Areas.setResultadoWebDesign(resultadoWebDesign);
				}
			}
		}

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoEcommerce()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDeSoftwareExtra);
			char acaoResponderPerguntaEngenhariaDeSoftwareExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 's') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'n') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'k') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoEcommerce()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaEEcommerce);
				char acaoResponderPerguntaEngenhariaEEcommerceExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaEEcommerceExtra == 's') {

					resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
					Areas.setResultadoEcommerce(resultadoEcommerce);
				}

				if (acaoResponderPerguntaEngenhariaEEcommerceExtra == 'n') {

					resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
					Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
				}
			}
		}

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoCienciaDaComputacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDeSoftwareExtra);
			char acaoResponderPerguntaEngenhariaDeSoftwareExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 's') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'n') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'k') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoCienciaDaComputacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaECiencia);
				char acaoResponderPerguntaEngenhariaECienciaExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaECienciaExtra == 's') {

					resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
					Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
				}

				if (acaoResponderPerguntaEngenhariaECienciaExtra == 'n') {

					resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
					Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
				}
			}
		}

		if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoTecnologiaDaInformacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEngenhariaDeSoftwareExtra);
			char acaoResponderPerguntaEngenhariaDeSoftwareExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 's') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'n') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaEngenhariaDeSoftwareExtra == 'k') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {

				resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
				Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
			}

			if (Areas.getResultadoEngenhariaDeSoftware() == Areas.getResultadoTecnologiaDaInformacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEngenhariaETecnologia);
				char acaoResponderPerguntaEngenhariaETecnologiaExtra = sc.next().charAt(0);

				if (acaoResponderPerguntaEngenhariaETecnologiaExtra == 's') {

					resultadoEngenhariaDeSoftware = Areas.getResultadoEngenhariaDeSoftware() + 1;
					Areas.setResultadoEngenhariaDeSoftware(resultadoEngenhariaDeSoftware);
				}

				if (acaoResponderPerguntaEngenhariaETecnologiaExtra == 'n') {

					resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
					Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
				}
			}
		}

		if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoWebDesign()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoWebDesign()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseEWeb);
				char acaoPerguntaAnaliseEWebExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseEWebExtra == 's') {

					resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
					Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
				}

				if (acaoPerguntaAnaliseEWebExtra == 'n') {

					resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
					Areas.setResultadoWebDesign(resultadoWebDesign);
				}
			}
		}

		if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoEcommerce()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoEcommerce()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseEEcommerce);
				char acaoPerguntaAnaliseEEcommerceExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseEEcommerceExtra == 's') {

					resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
					Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
				}

				if (acaoPerguntaAnaliseEEcommerceExtra == 'n') {

					resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
					Areas.setResultadoEcommerce(resultadoEcommerce);
				}
			}
		}

		if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoCienciaDaComputacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoCienciaDaComputacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseECiencia);
				char acaoPerguntaAnaliseECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseECienciaExtra == 's') {

					resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
					Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
				}

				if (acaoPerguntaAnaliseECienciaExtra == 'n') {

					resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
					Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
				}
			}
		}

		if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoTecnologiaDaInformacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaAnaliseDeDadosExtra);
			char acaoResponderPerguntaAnaliseDeDadosExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 's') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'n') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaAnaliseDeDadosExtra == 'k') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 's') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 'n') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtraExtra == 'k') {

				resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
				Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
			}

			if (Areas.getResultadoAnaliseDeDados() == Areas.getResultadoTecnologiaDaInformacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaAnaliseETecnologia);
				char acaoPerguntaAnaliseETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaAnaliseETecnologiaExtra == 's') {

					resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
					Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
				}

				if (acaoPerguntaAnaliseETecnologiaExtra == 'n') {
					resultadoAnaliseDeDados = Areas.getResultadoAnaliseDeDados() + 1;
					Areas.setResultadoAnaliseDeDados(resultadoAnaliseDeDados);
				}
			}
		}

		if (Areas.getResultadoWebDesign() == Areas.getResultadoEcommerce()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (Areas.getResultadoWebDesign() == Areas.getResultadoEcommerce()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebEEcommerce);
				char acaoPerguntaWebDesignECommerceExtra = sc.next().charAt(0);

				if (acaoPerguntaWebDesignECommerceExtra == 's') {

					resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
					Areas.setResultadoWebDesign(resultadoWebDesign);
				}

				if (acaoPerguntaWebDesignECommerceExtra == 'n') {

					resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
					Areas.setResultadoEcommerce(resultadoEcommerce);
				}
			}
		}

		if (Areas.getResultadoWebDesign() == Areas.getResultadoCienciaDaComputacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (Areas.getResultadoWebDesign() == Areas.getResultadoCienciaDaComputacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebECiencia);
				char acaoPerguntaWebECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaWebECienciaExtra == 's') {

					resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
					Areas.setResultadoWebDesign(resultadoWebDesign);
				}

				if (acaoPerguntaWebECienciaExtra == 'n') {

					resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
					Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
				}
			}
		}

		if (Areas.getResultadoWebDesign() == Areas.getResultadoTecnologiaDaInformacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaWebDesignExtra);
			char acaoResponderPerguntaWebDesignExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaWebDesignExtra == 's') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'n') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaWebDesignExtra == 'k') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {

				resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
				Areas.setResultadoWebDesign(resultadoWebDesign);
			}

			if (Areas.getResultadoWebDesign() == Areas.getResultadoTecnologiaDaInformacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaWebETecnologia);
				char acaoPerguntaWebETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaWebETecnologiaExtra == 's') {

					resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
					Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
				}

				if (acaoPerguntaWebETecnologiaExtra == 'n') {

					resultadoWebDesign = Areas.getResultadoWebDesign() + 1;
					Areas.setResultadoWebDesign(resultadoWebDesign);
				}
			}
		}

		if (Areas.getResultadoEcommerce() == Areas.getResultadoCienciaDaComputacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (Areas.getResultadoEcommerce() == Areas.getResultadoCienciaDaComputacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEcommerceECiencia);
				char acaoPerguntaEcommerceECienciaExtra = sc.next().charAt(0);

				if (acaoPerguntaEcommerceECienciaExtra == 's') {

					resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
					Areas.setResultadoEcommerce(resultadoEcommerce);
				}

				if (acaoPerguntaEcommerceECienciaExtra == 'n') {

					resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
					Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
				}
			}
		}

		if (Areas.getResultadoEcommerce() == Areas.getResultadoTecnologiaDaInformacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaEcommerceExtra);
			char acaoResponderPerguntaEcommerceExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaEcommerceExtra == 's') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'n') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaEcommerceExtra == 'k') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {

				resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
				Areas.setResultadoEcommerce(resultadoEcommerce);
			}

			if (Areas.getResultadoEcommerce() == Areas.getResultadoTecnologiaDaInformacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaEcommerceETecnologia);
				char acaoPerguntaEcommerceETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaEcommerceETecnologiaExtra == 's') {

					resultadoEcommerce = Areas.getResultadoEcommerce() + 1;
					Areas.setResultadoEcommerce(resultadoEcommerce);
				}

				if (acaoPerguntaEcommerceETecnologiaExtra == 'n') {

					resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
					Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
				}
			}
		}

		if (Areas.getResultadoCienciaDaComputacao() == Areas.getResultadoTecnologiaDaInformacao()) {

			System.lineSeparator();
			LOG.info("PERGUNTA 17: " + perguntasExtras.perguntaCienciaDaComputacaoExtra);
			char acaoResponderPerguntaCienciaDaComputacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 's') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);

			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'n') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaCienciaDaComputacaoExtra == 'k') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			System.lineSeparator();
			LOG.info("PERGUNTA 18: " + perguntasExtras.perguntaTecnologiaDaInformacaoExtra);
			char acaoResponderPerguntaTecnologiaDaInformacaoExtra = sc.next().charAt(0);

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 's') {

				resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
				Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'n') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (acaoResponderPerguntaTecnologiaDaInformacaoExtra == 'k') {

				resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
				Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
			}

			if (Areas.getResultadoCienciaDaComputacao() == Areas.getResultadoTecnologiaDaInformacao()) {

				System.lineSeparator();
				LOG.info("PERGUNTA 19: " + perguntasExtras.perguntaCienciaETecnologia);
				char acaoPerguntaCienciaETecnologiaExtra = sc.next().charAt(0);

				if (acaoPerguntaCienciaETecnologiaExtra == 's') {

					resultadoCienciaDaComputacao = Areas.getResultadoCienciaDaComputacao() + 1;
					Areas.setResultadoCienciaDaComputacao(resultadoCienciaDaComputacao);
				}

				if (acaoPerguntaCienciaETecnologiaExtra == 'n') {

					resultadoTecnologiaDaInformacao = Areas.getResultadoTecnologiaDaInformacao() + 1;
					Areas.setResultadoTecnologiaDaInformacao(resultadoTecnologiaDaInformacao);
				}
			}
		}

		resultados.resultadosPersonalidades(resultadoEngenhariaDeSoftware, resultadoAnaliseDeDados, resultadoWebDesign,
				resultadoEcommerce, resultadoCienciaDaComputacao, resultadoTecnologiaDaInformacao);
	}

}
