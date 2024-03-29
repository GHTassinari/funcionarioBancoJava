package banco;

public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo;

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = true;
    }

    public void bonifica(double aumento) {
        this.salario += aumento;
    }

    public void demite() {
        this.ativo = false;
    }

    public void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$" + salario);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
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

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
