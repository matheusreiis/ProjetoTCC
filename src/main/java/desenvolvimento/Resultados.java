package desenvolvimento;

import java.util.Scanner;

import org.apache.log4j.Logger;

import entities.Areas;

public class Resultados {

	private static final Logger LOG = Logger.getLogger(Resultados.class);

	int resultadoEngenhariaDeSoftware;
	int resultadoAnaliseDeDados;
	int resultadoWebDesign;
	int resultadoEcommerce;
	int resultadoCienciaDaComputacao;
	int resultadoTecnologiaDaInformacao;
	int resultadoFinal;
	Scanner sc = new Scanner(System.in);

	public void resultadosPersonalidades() {

		for (int counter = 0; counter < 10; counter++) {

			if (counter > 0) {
				if (Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoAnaliseDeDados())
					
					resultadoFinal = Areas.getResultadoEngenhariaDeSoftware();
				
			} else if (Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoWebDesign()) {
				
			}
		}
		
//		|| Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoWebDesign()
//		|| Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoEcommerce()
//		|| Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoCienciaDaComputacao()
//		|| Areas.getResultadoEngenhariaDeSoftware() > Areas.getResultadoTecnologiaDaInformacao()

	}

}
