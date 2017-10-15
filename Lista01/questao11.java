import java.util.Scanner;

public class questao11{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        int quantProdutos, codigo;
        float valorTotal = 0F;
        System.out.print("\t-----Bem vindo!-----\n\n\t-----Cárdapio-----\nCódigo\tProduto\t\t\tPreço\n10\tPastel de carne\t\t1,50\n");
        System.out.print("11\tCoxinha de frango\t1,80\n12\tEmpada de frango\t1,90\n20\tHamburguer\t\t10,00\n");
        System.out.print("30\tPizza\t\t\t8,00\n50\tSuco\t\t\t2,50\n\n");

        System.out.print("Digite a quantidade de produtos que foram comprados: ");
        quantProdutos = leitor.nextInt();

        for(int i = 0; i < quantProdutos; i++){
            System.out.printf("Digite o código do %dº produto: ", (i+1));
            codigo = leitor.nextInt();
            switch(codigo){
                case 10:
                    valorTotal += 1.5F;
                    break;
                case 11:
                    valorTotal += 1.8F;
                    break;
                case 12:
                    valorTotal += 1.9F;
                    break;
                case 20:
                    valorTotal += 10F;
                    break;
                case 30:
                    valorTotal += 8F;
                    break;
                case 50:
                    valorTotal += 2.5F;
                    break;
                default:
                    System.out.println("Código não encontrado.Tente novamente");
                    i--;
                    break;
            }
        }

        if(valorTotal > 50){
            valorTotal *= 0.95;
        }

        System.out.printf("O valor final do pedido é R$%.2f\n", valorTotal);

    }
}