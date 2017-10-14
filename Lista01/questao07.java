import java.util.Scanner;

public class questao07{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        int conceito;

        while(true){
            System.out.print("Digite o conceito do aluno: ");
            conceito = leitor.nextInt();
            if(conceito >= 0 && conceito <= 100){
                break;
            }else{
                System.out.println("Digite um valor de conceito válido!");
            }
        }

        if(conceito < 50){
            System.out.println("Insuficiente");
        }else if(conceito >= 50 && conceito < 65){
            System.out.println("Regular");
        }else if(conceito >= 65 && conceito < 85){
            System.out.println("Bom");
        }else{
            System.out.println("Ótimo");
        }
    }
}