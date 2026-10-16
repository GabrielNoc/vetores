import java.util.Arrays;
import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" EXERCÍCIO 1 ");
        exercicio1(sc);

        System.out.println("\n EXERCÍCIO 2 ");
        exercicio2(sc);

        System.out.println("\n EXERCÍCIO 3 ");
        exercicio3(sc);

        sc.close();
    }


    public static void exercicio1(Scanner sc) {
        System.out.print("Quantos números você deseja digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        sc.nextLine();
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        int vogais = contarVogais(nome);
        System.out.println("O nome \"" + nome + "\" possui " + vogais + " vogais.");
    }

    private static int contarVogais(String texto) {
        int contador = 0;
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }


    public static void exercicio2(Scanner sc) {
        System.out.print("Quantos números inteiros você deseja digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = vetor[i] * vetor[i];
            }
        }

        System.out.println("Vetor alterado: " + Arrays.toString(vetor));
    }


    public static void exercicio3(Scanner sc) {
        sc.nextLine();
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        char[] vetorNome = nome.toCharArray();
        char[] vetorInvertido = new char[vetorNome.length];

        for (int i = 0; i < vetorNome.length; i++) {
            vetorInvertido[i] = vetorNome[vetorNome.length - 1 - i];
        }

        String nomeInvertido = new String(vetorInvertido);
        System.out.println("Nome original : " + nome);
        System.out.println("Nome invertido: " + nomeInvertido);
    }
}
