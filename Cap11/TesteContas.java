public class TesteContas {
    
    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();
        
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            
        }
    }
}