package controller;

import model.Funcionario;

//criacao desta classe para implementacao de objetos!!!! ja que a classe funcionario é abstrata

public class MeuFuncionario extends Funcionario{

   private String mesInicio;

//construtores
public MeuFuncionario(String nome, int matricula, float valorHora, int horasTrabalhadas, String mesInicio) {
       super(nome, matricula, valorHora, horasTrabalhadas);
       this.mesInicio = mesInicio;
}

//getters and setters
public String getMesInicio() {
    return mesInicio;
}

public void setMesInicio(String mesInicio) {
    this.mesInicio = mesInicio;
}

@Override
public float calcularSalario() {
    throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
}

@Override
public String toString() {
    return super.toString() + "\nMês de início: " + mesInicio;
}



    
    

    
   

  

  


}
