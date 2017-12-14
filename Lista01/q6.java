import java.util.Scanner;

public class questao06{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        String nomeCliente;
        int diarias, diaria = 60;
        float valorTotal;

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = leitor.next();

        while(true){
            System.out.print("Digite a quantidade de diarias do cliente: ");
            diarias = leitor.nextInt();
            if(diarias > 0){
                break;
            }else{
                System.out.println("Digite um valor de diarias válido!");
            }
        }

        if(diarias < 15){
            valorTotal = diaria*diarias + diarias*8F;
        }else if(diarias == 15){
            valorTotal = diaria*diarias + diarias*6F;
        }else{
            valorTotal = diaria*diarias + diarias*5.5F;
        }
        System.out.printf("Nome do cliente: %s\nValor final da conta: %.2f\n", nomeCliente, valorTotal);
    }
}