package model;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Trabalhavel{

    private float bonusAnual;
    private ArrayList<Funcionario> equipeSobGerencia; 


//construtores

public Gerente(String nome, int matricula, float valorHora, int horasTrabalhadas, float bonusAnual,
            ArrayList<Funcionario> equipeSobGerencia) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    
//getters and setters
    public float getBonusAnual() {
    return bonusAnual;
}


public void setBonusAnual(float bonusAnual) {
    this.bonusAnual = bonusAnual;
}


public ArrayList<Funcionario> getEquipeSobGerencia() {
    return equipeSobGerencia;
}


public void setEquipeSobGerencia(ArrayList<Funcionario> equipeSobGerencia) {
    this.equipeSobGerencia = equipeSobGerencia;
}


//metodo abstrato
@Override
public float calcularSalario() {
    return getValorHora() * getHorasTrabalhadas() + bonusAnual;
}


//implements
@Override
public void trabalhar() {
    System.out.println("O gerente está analisando o novo projeto...");
}

@Override
public void relatarProgresso() {
    System.out.println("O projeto foi aprovado!");
}

//toString

@Override
public String toString() {
    return super.toString() + "Bônus anual: " + bonusAnual + "Equipe sob gerencia: " + equipeSobGerencia;
}
}
