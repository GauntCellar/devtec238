package br.tec.devtec238.funçao;

import java.util.Scanner;

public class Funçao {
	public void mediaAritmetica() {
		//BLOCO - Declaração de variável
				int nota1, nota2, nota3, nota4, notar;
				float media, mediar;
				Scanner read = new Scanner(System.in);
				
				//BLOCO - Entrada de dados
				System.out.println("Digite a nota 1: ");
				nota1 = read.nextInt();
				System.out.println("Digite a nota 2: ");
				nota2 = read.nextInt();
				System.out.println("Digite a nota 3: ");
				nota3 = read.nextInt();
				System.out.println("Digite a nota 4: ");
				nota4 = read.nextInt();
				
				//BLOCO - processamento
				media = (nota1+nota2+nota3+nota4)/4;
				
				//BLOCO - saida de dados
				if (media >= 7) {//verdadeiro
					System.out.println("Aluno aprovado, com média: " + media);
				}else {
					System.out.println("Digite a nota da recuperação: ");
					notar = read.nextInt();
					
					mediar = (media+notar)/2;
					
					if (mediar >=5) {
						System.out.println("Aluno aprovado com média em recuperação: " + mediar);
					}else {
						System.out.println("Aluno reprovado, com média em recuperação: " + mediar);
					}
					System.out.println("Aluno reprovado, com média: " + mediar);
				}
	}

	public void sequencia5() {
		// TODO Auto-generated method stub
		
	}

}
