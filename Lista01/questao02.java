import java.util.Scanner;

public class questao02{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){

        int anoNascimento;
        final int anoAtual = 2017;

        System.out.printf("Digite o seu ano de nascimento: ");
        anoNascimento = leitor.nextInt();

        System.out.printf("A sua idade atual é %d anos\n", (anoAtual - anoNascimento));
    }
}