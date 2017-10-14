import java.util.Scanner;

public class questao08{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        int media = 0, menorNum = 0, maiorNum = 0, nota;
        final int QUANTNUM = 10;

        for(int i = 0; i < QUANTNUM; i++){
            System.out.printf("Digite o %dº número inteiro: ", (i+1));
            nota = leitor.nextInt();
            media += nota;
            if(i == 0){
                menorNum = maiorNum = nota;
            }else{
                if(menorNum > nota){
                    menorNum = nota;
                }else if(maiorNum < nota){
                    maiorNum = nota;
                }
            }
        }

        media /= QUANTNUM;

        System.out.printf("Média: %d\nMenor número: %d\nMaior número: %d\n", media, menorNum, maiorNum);
    }
}