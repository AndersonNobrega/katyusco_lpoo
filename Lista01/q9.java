import java.util.Scanner;

public class questao09{
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args){
        int[] numeros = new int[2];
        int soma = 0, quantPar = 0, quantImpar = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: ", (i+1));
            numeros[i] = leitor.nextInt();

            if(numeros[i] % 2 == 0){
                quantPar++;
            }else{
                quantImpar++;
            }
            soma += numeros[i];
        }

        System.out.printf("Números pares: %d\nNúmeros impares: %d\nSoma dos números: %d\n", quantPar, quantImpar, soma);
    }
}