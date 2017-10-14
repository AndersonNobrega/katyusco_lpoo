import java.util.Scanner;

public class questao12{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        final int VALORMAX = 10;

        for(int i = 0; i <= VALORMAX; i++){
            System.out.printf("Valor atual: %d\nValor elevado ao quadrado: %d\nValor elevado ao cubo: %d\n\n", i, (i*i), (i*i*i));
        }
    }
}