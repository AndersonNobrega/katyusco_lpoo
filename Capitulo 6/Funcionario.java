public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String rg;
    private int identificador;
    private static int quantFuncionarios = 0;

    public Funcionario() {
        this.identificador = quantFuncionarios+1;
        quantFuncionarios++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    public void mostra() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Nome do departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada no banco: " + this.dataEntradaBanco);
        System.out.println("RG: " + this.rg);
    }
}