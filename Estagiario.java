package model;
public class Estagiario extends Funcionario implements Trabalhavel{

private String supervisor;
//as horas trabalhadas pelo estag já contam como HorasTrab - instanciado na classe funcionario

//construtores
    

public Estagiario(String nome, int matricula, float valorHora, int horasTrabalhadas, String supervisor) {
    super(nome, matricula, valorHora, horasTrabalhadas);
    this.supervisor = supervisor;
}

public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
}

//getters and setters

public String getSupervisor() {
    return supervisor;
}
    
//metodo abstrato
    @Override
    public float calcularSalario() {
        return getHorasTrabalhadas() * getValorHora();
    }

//tostring
    @Override
    public String toString() {
    return super.toString() +
    "/nSupervisor do estagiário" + supervisor;
}

//interface - metodos obrigatorios
    @Override
    public void trabalhar() {
        System.out.println("O estagiário está implementando um novo projeto...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O progresso do projeto está sendo relatado pelo estagiário");
    }




}