

import java.util.Scanner;
// esse comando importa o scanner para ser usado no programa

public class Main {
    public static void main(String[] args) {
// essa é a declaração do objeto

        Scanner sc = new Scanner(System.in);
        // aqui está sendo criada a variável que entrará pelo teclado, vai ser encerrada quando não precisar mais dela.

        int lerInteiro;
        // declarando as variaveis com o tipo na frente, no caso tipo double, ou seja, numeros reais ou com ponto flutuante.
        Double lerReal;

        System.out.print("Digite um número inteiro: ");
        lerInteiro = sc.nextInt();
        // atenção ao tipo de next que deve estar casado com o tipo de variável

        System.out.println(" Você Digitou o número = " + lerInteiro);

        System.out.print("Agora digite um número real: ");
        lerReal = sc.nextDouble();
        System.out.println(" Agora você Digitou o número Real = " + lerReal);
        // o uso do separador entre a parte inteira e decimal do número real se dá de acordo com o teclado, porém a saída é no padráo dos EUA


        sc.close();
        // aqui termina o uso do teclado, o recurso scanner sendo encerrrado
    }
}
