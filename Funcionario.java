package model;

//classe abstrata = nao pode instanciar objetos a partir dela, somente a partir de suas subclasses
public abstract class Funcionario {
    private String nome;
    private int matricula;
    private float valorHora;
    private int horasTrabalhadas;

    
    //constructors 
    public Funcionario(String nome, int matricula, float valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    //getters and setters 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
 
    
    //metodos abstratos
    public abstract float calcularSalario();

    
    //toString 
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nMatrícula: " + matricula + "\nValor da hora: " + valorHora
     + "\nHoras trabalhadas: " + horasTrabalhadas;
    }

    

   
    
    
}
