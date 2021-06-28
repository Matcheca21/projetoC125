package br.inatel.bm.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import br.inatel.bm.cachorros.*;

public class CSVUtils {

	public static void gerarCSVDogsComFilhotes(Path arquivo) {
		// TODO Auto-generated method stub
		
		List<Cachorros> doguinho = leCsv(arquivo);
		
		gerarCsvNovo("dog_filtrados.csv" , doguinho);
			
		
		
	}
	
	private static void gerarCsvNovo(String nomeArquivo, List<Cachorros> doguinho) {
		// TODO Auto-generated method stub
		
		String cabecalho = "ID,Ra�a,Filhotes,Pre�o\n";
		
		Path arquivoFinal = Paths.get(nomeArquivo);
		
		try {
			Files.writeString(arquivoFinal, cabecalho);
			
			StringBuilder builder = new StringBuilder();
			
			
			//Filtrando uma Array List
			doguinho.stream().
			                  filter((d) -> d.getNumFilhotes()!=0). //Filtrando os cachorros que possuem filhotes
			                  filter((d) -> d.getPreco() >= 800). // Filtrando os cachorros que custam 800 ou mais
			                  forEach((d) -> {
			                     builder.append(d.getId() + ",").
			                     append(d.getRaca() + ",").
			                     append(d.getNumFilhotes() + ",").
			                     append(d.getPreco() + "\n");
			                  }); //ForEach - montar a string do arquivo
			
			Files.writeString(arquivoFinal, builder.toString(),
					StandardOpenOption.APPEND);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	private static List<Cachorros> leCsv(Path arquivo){
		
		List<Cachorros> cachorro = new ArrayList<>();
		//Manipulacao e conversao do arquivo para objeto
		try {
			List<String> linhas =  Files.readAllLines(arquivo);
			linhas.remove(0);
			
			linhas.forEach((linha) -> {
				
				String[] linhaSplit = linha.split(",");
				Cachorros dog = new Cachorros(Integer.parseInt(linhaSplit[0]) 
					, linhaSplit[1], Integer.parseInt(linhaSplit[2]), Double.parseDouble(linhaSplit[3]));
				
				cachorro.add(dog);
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return cachorro;
		
	}

	
	
	

}
