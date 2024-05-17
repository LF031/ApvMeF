import java.util.*;
public class Exercicio5_5 {

	public static void main(String[] args) {
		// 1 - variaveis
		String nomeAluno;
		int nota;
		char sexo;
		byte contAprovMasc = 0;
		byte contReprovFem = 0;
		int somaNotasFem = 0;
		byte contFem = 0;
		int somaNotas = 0;
		String nomeAprovados[] = new String[50];
		int notaAprovados[] = new int[50];
		byte contAprovados = 0;
		Scanner leia = new Scanner(System.in);
		
		// 2 - Entrada de dados
		for (byte cont = 1; cont <= 50; cont++ ) {
			System.out.print("Digite o nome do aluno: ");
			nomeAluno = leia.nextLine();
			
			do {
				System.out.print("Digite a nota: ");
				nota = leia.nextInt();
				if (nota < 0 || nota > 100) {
					System.out.println("Nota invalida, digite de 0 a 100");
				}
			}while(nota < 0 || nota > 100);
			
			do {
				System.out.print("Digite o sexo: ");
				sexo = leia.next().charAt(0);
				if (sexo != 'M' && sexo != 'F') {
					System.out.println("Sexo invalido, digite M ou F");
				}
			}while(sexo != 'M' && sexo != 'F');
			
			// 3 - calculos
			
			if(nota >= 60) {
				System.out.println("Aluno Aprovado !");
				if (sexo == 'M') {
					contAprovMasc ++;
				}
				nomeAprovados[contAprovados] = nomeAluno;
				notaAprovados[contAprovados] = nota;
				contAprovados ++;
				
			} else {
				System.out.println("Aluno Reprovado !");
				if (sexo == 'F') {
					contReprovFem ++;
				}
			}
			
			if (sexo == 'F') {
				contFem ++;
				somaNotasFem = somaNotasFem + nota;
			}
			somaNotas = somaNotas + nota;
			
			leia.nextLine();
		} // fim do for

		System.out.println("Numero de aprovados do sexo masculino: " + contAprovMasc);
		System.out.println("Numero de reprovados do sexo feminino: " + contReprovFem);
		if (contFem > 0) {
			System.out.println("Media notas sexo feminino: " + somaNotasFem / contFem);
		}
		System.out.println("Media geral de notas: " + somaNotas / (float)50);
		
		System.out.println("RELATORIO DE APROVADOS");
		System.out.println("  NOME     NOTA");
		for (byte x = 0; x < contAprovados; x++ ) {
			System.out.println(nomeAprovados[x] + "          " + notaAprovados[x]);
		}
	}

}
