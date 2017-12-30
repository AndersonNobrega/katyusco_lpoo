public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException() {
        System.out.println("Você tentou depositar um valor negativo");
    }
}