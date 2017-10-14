import java.util.Scanner;

public class questao03{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        final int PESO1 = 2, PESO2 = 3, PESO3 = 5, NOTAS = 3;
        float somaNotas = 0F, media;

        for(int i = 0; i < NOTAS; i++){
            System.out.printf("Digite a %dº nota: ", (i+1));
            switch(i){
                case 0:
                    somaNotas += leitor.nextFloat()*PESO1;
                    break;
                case 1:
                    somaNotas += leitor.nextFloat()*PESO2;
                    break;
                case 2:
                    somaNotas += leitor.nextFloat()*PESO3;
                    break;
            }
        }

        media = somaNotas / (PESO1 + PESO2 + PESO3);

        System.out.printf("Média final: %.2f\n", media);

    }
}