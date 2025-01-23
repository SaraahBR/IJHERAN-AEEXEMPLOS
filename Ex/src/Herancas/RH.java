package Herancas;

public class RH extends Funcionario {
    private int senha;
    public int AvaliacaoDeDesempenho;
    private int NumeDeFuncDaEmp;
    private String recrutamento;
    private Double salarios;
    public String beneficios;

    public RH() {

    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getAvaliacaoDeDesempenho() {
        return AvaliacaoDeDesempenho;
    }

    public void setAvaliacaoDeDesempenho(int avaliacaoDeDesempenho) {
        AvaliacaoDeDesempenho = avaliacaoDeDesempenho;
    }

    public int getNumeDeFuncDaEmp() {
        return NumeDeFuncDaEmp;
    }

    public void setNumeDeFuncDaEmp(int numeDeFuncDaEmp) {
        NumeDeFuncDaEmp = numeDeFuncDaEmp;
    }

    public String getRecrutamento() {
        return recrutamento;
    }

    public void setRecrutamento(String recrutamento) {
        this.recrutamento = recrutamento;
    }

    public Double getSalarios() {
        return salarios;
    }

    public void setSalarios(Double salarios) {
        this.salarios = salarios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
