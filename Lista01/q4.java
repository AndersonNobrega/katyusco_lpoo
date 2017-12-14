import java.util.Scanner;

public class questao04{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        final int NOTAS = 4;
        float media = 0F;

        for(int i = 0; i < NOTAS; i++){
            System.out.printf("Digite a %dº nota: ", (i+1));
            media += leitor.nextFloat();
        }

        media /= NOTAS;

        if(media < 5){
            System.out.println("---Reprovado---");
        }else if(media >= 5 && media < 7){
            System.out.println("---Final---");
        }else{
            System.out.println("---Aprovado---");
        }

    }
}