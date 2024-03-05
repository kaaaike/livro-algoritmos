// Build:   javac Imprimir.java
// Execute: java Imprimir

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Imprimir {

	public static void main(String[] args) {
		List<String> conteudoArquivo = lerArquivo("arquivo.txt");
		imprimeItens(conteudoArquivo);
	}

	public static void imprimeItens(List<String> lista) {
		for (String item : lista) {
			try {
				Thread.sleep(1000); // Pausa por 1 segundo
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(item);
		}
	}

	public static List<String> lerArquivo(String nomeArquivo) {
		List<String> conteudo = new ArrayList<>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				conteudo.add(linha);
			}
		} catch (IOException e ) {
			e.printStackTrace();
		}
		return conteudo;
	}
}
