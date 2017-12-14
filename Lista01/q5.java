import java.util.Scanner;

public class questao05{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        final String[] MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int numMes;
        
        while (true){
            System.out.print("Digite o número do mês que deseja: ");
            numMes = leitor.nextInt();
            if(numMes <= 12 && numMes >= 1){
                break;
            }else{
                System.out.println("Número inválido.Tente novamente");
            }
        }

        System.out.printf("Mês: %s\n", MESES[numMes-1]);
    }
}