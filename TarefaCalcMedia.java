package modulos.md08.tarefacalcmedia;

import java.util.Scanner;

public class TarefaCalcMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a primeira nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();
        //Fechar o scanner dps da leitura
        scanner.close();

        // Calcular a media

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media do aluno foi: " + media);



    }

}
