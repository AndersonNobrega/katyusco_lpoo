import java.util.Scanner;

public class questao01{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){

        float velocidade;
        final float CONVERSAO = 3.6F;

        System.out.printf("Digite um valor em m/s: ");
        velocidade = leitor.nextFloat();

        velocidade *= CONVERSAO;

        System.out.printf("Valor em km/h: %f\n", velocidade);
    }
}