package br.inatel.bm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import br.inatel.bm.utils.CSVUtils;

public class PetShopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path arquivo = Paths.get("ArquivoCSV.csv"); 
		
		 CSVUtils.gerarCSVDogsComFilhotes(arquivo);
		
		 /* try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.forEach((l) -> {
				System.out.println(l);
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
		
		
	}

}
