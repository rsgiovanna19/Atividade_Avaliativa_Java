package model;

import java.util.ArrayList;

public class Desenvolvedor extends Funcionario implements Trabalhavel {

private ArrayList<String> tecnologias = new ArrayList<>();


//constructors

public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas, ArrayList<String> tecnologias) {
    super(nome, matricula, valorHora, horasTrabalhadas);
    this.tecnologias = tecnologias;
}

//getters setters 

public ArrayList<String> getTecnologias() {
    return tecnologias;
}

public void setTecnologias(ArrayList<String> tecnologias) {
    this.tecnologias = tecnologias;
}

//metodo abstrato
    @Override
        public float calcularSalario() {
        return getValorHora() * getHorasTrabalhadas();
    }

    
    //implements
    @Override
    public void trabalhar() {
        System.out.println("O Desenvolvedor está implementando um novo projeto...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("O progresso do projeto está sendo relatado pelo estagiário do Desenvolvedor...");
    }
    
    //toString 
        @Override
        public String toString() {
            return super.toString() + "\nTecnologias que são dominadas pelo Desenvolvedor: " + tecnologias;
        }

    
}
