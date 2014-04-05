package br.com.unb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.lang.Math;

public class Leitura {

	File arquivo1 – new File ( "C:\Users\Rebeca\Desktop\UnB\3 ° semestre\SI\Arquivo_Mestre1.txt");
	File arquivo2 – new File ( "C:\Users\Rebeca\Desktop\UnB\3 ° semestre\SI\Arquivo_Mestre2.txt");
	File arquivo3 – new File ( "C:\Users\Rebeca\Desktop\UnB\3 ° semestre\SI\Arquivo_Mestre.txt");
	File arquivo4 – new File ( "C:\Users\Rebeca\Desktop\UnB\3 ° semestre\SI\Arquivo_Mestre.txt");

	// Verificando se o arquivo ou diretório existe:
	
	Boolean existe1 = arquivo1.exists( ); 
	Boolean existe2 = arquivo2.exists( ); 
	Boolean existe3 = arquivo3.exists( ); 
	Boolean existe4 = arquivo4.exists( ); 
	
	FileReader ler_objeto1 = new FileReader ( arquivo1 );
	FileReader ler_objeto2 = new FileReader ( arquivo2 );
	FileReader ler_objeto3 = new FileReader ( arquivo3 );
	FileReader ler_objeto4 = new FileReader ( arquivo4 );
	
	BufferedReader ler_linha1 = new BufferedReader (ler_objeto1);
	BufferedReader ler_linha2 = new BufferedReader (ler_objeto2);
	BufferedReader ler_linha3 = new BufferedReader (ler_objeto3);
	BufferedReader ler_linha4 = new BufferedReader (ler_objeto4);
	
	
	public int media (File arquivo1) {
		
		while (){
		
			if (arquivo1.read(char[] palavra, int 0, int 7) == "Demanda:"){
				
				int soma += arquivo2.read(char[] d, int 8, int 3;
				int periodo++;
			}
		arquivo1.nextLine();
		}
	return soma/periodo;
	}

	public double devioPadrao (File arquivo1, int media, int periodo){
		
		while (){
			
			if (arquivo1.read(char[] palavra, int 0, int 7) == "Demanda:"){
				
				int x = (media-(arquivo1.read(char[] d, int 8, int 3));
			}
			int var += Math.pow(x,2);
			
		    arquivo1.nextLine();
		    
		    return Math.sqrt(var)/(periodo-1);
		}
		
		public double estoqueMinimo (double desvioPadrao){
			
			double FS=1.6450, EM, PP= 1, LT=2;

			EM = (FS * desvioPadrao) * (Math.sqrt(LT)/PP);
			return EM;
		}

		public double pontoRessuprimento (double media, double estoqueMinimo)
		{
			int LT=2;
			
			return (media*LT)+estoqueMinimo;
		}

	}
	
}
