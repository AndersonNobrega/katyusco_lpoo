public class Empresa {
    private Funcionario[] empregados;
    private String cnpj;
    private int index;

    public Empresa() {
        this.index = 0;
        empregados = new Funcionario[10];
    }

    public Empresa(int tamanho) {
        this.index = 0;
        empregados = new Funcionario[tamanho];
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adiciona(Funcionario pessoa) {
        if (index == empregados.length) {
            System.out.println("Array esta cheio");
        } else {
            empregados[index] = pessoa;
            index++;
        }
    }

    public void mostraEmpregados() {
        for (int i = 0; i < index; i++) {
            System.out.println("\nFuncionario N." + (i+1) + "\n");
            empregados[i].mostra();
        }
    }

    public boolean contem(Funcionario pessoa) {
        for (int i = 0; i < index; i++) {
            if (pessoa == empregados[i]) {
                return true;
            }
        }
        return false;
    }
}
