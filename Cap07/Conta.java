public abstract class Conta {

    protected double saldo;

    public void deposita(double valor) {

        if (valor < 0) {
            throw new ValorInvalidoException();
        } else {
            this.saldo += valor - 0.10;
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public abstract void atualiza(double taxa);
}
