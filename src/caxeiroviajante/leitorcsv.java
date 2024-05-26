package caxeiroviajante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leitorcsv {
	public static void main(String[] args) {
	leitorcsv obj = new leitorcsv();
    obj.run();
	}

public void run() {
	
	String arquivoCSV = "entrada.csv";
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ";";
    
    try {
        br = new BufferedReader(new FileReader(arquivoCSV));
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(csvDivisor);

            // Imprime a linha completa
            for (String dado : dados) {
                System.out.print(dado + " ");
            }
            System.out.println(); // Adiciona uma nova linha após imprimir a linha completa
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}



