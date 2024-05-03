package controller;
import java.util.List;


public class Sistema {
    
    private static void exibirMenu(){

        System.out.println("--MENU DE GERENCIAMENTO--");
        System.out.println("Digite o que você deseja:");
        System.out.println("1) Cadastrar novo funcionário");
        System.out.println("2) Exibir todos os funcionários");
        System.out.println("3) Buscar funcionário.");
        System.out.println("4) Remover funcionário.");
    }

    private static void opcoes(int op){

        switch(op){
        case 1:

        String nome;
        int matricula;
        float valorHora;
        int horasTrabalhadas;
        String mesInicio;

                //método para adicionar usuário...
                System.out.println("--CADASTRAR NOVO USUÁRIO--");
                
                System.out.println("Digite o nome do funcionário: ");
                nome = Console.lerString();
                System.out.println("Digite a matricula do novo funcionário:");
                matricula = Console.lerInt();
                System.out.println("Digite o valor da hora do funcionario");
                valorHora = Console.lerFloat();
                System.out.println("Digite as horas trabalhadas por este funcionário:");
                horasTrabalhadas = Console.lerInt();
                System.out.println("Digite o mês que este funcionário iniciou: ");
                mesInicio = Console.lerString();
                

                //como funcionario é uma classe abstrata e nao permite a criacao de objetos
                //podemos instanciar os objetos de funcionarios com a classe MeuFuncionario -
                //tendo ela herança de Funcionarios

                //criando nova classe p guardar informacoes 
                MeuFuncionario novoFuncionario = new MeuFuncionario(nome, matricula, valorHora, horasTrabalhadas, mesInicio);

                //add na arraylist conforme o metodo cadastrar na classe CadastrarFuncionarios faz. 
                CadastrarFuncionarios.cadastrar(novoFuncionario);


                System.out.println("Usuário adicionado com sucesso!");
                break;

        case 2:
                System.out.println("--EXIBIR TODOS OS FUNCIONÁRIOS--");
                //metodo p visualizar todos os funcionarios
                exibirFuncionarios();
                break;

        case 3: 
                System.out.println("--BUSCAR FUNCIONÁRIO--");
                System.out.println("Digite a matrícula do funcionário: ");
                matricula = Console.lerInt();
                exibirFuncionarios();
                break;

        case 4:
                System.out.println("--REMOVER FUNCIONÁRIO--");
                System.out.println("Digite a matricula a ser removida:");
                matricula = Console.lerInt();
                removerFunc(matricula);
            break;

        case 0:
                System.out.println("Saindo do sistema...");
                break;

        default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
                break;
        }
    }


    //metodos para o exibirMenu


    public static void exibirFuncionarios(){

        //chamando a arraylist
    List<MeuFuncionario> funcionarios = CadastrarFuncionarios.getListaFuncionarios();

    if (funcionarios.isEmpty()) {       //se a lista estiver vazia - retorna que nao existem funcionarios cadastrados
    System.out.println("Não há funcionários cadastrados.");
        } else {        //se existir algo na lista - retorna todos os funcionarios existentes nela!
    for (MeuFuncionario funcionario : funcionarios) {
        System.out.println(funcionario);
    }
}
    }

    public static MeuFuncionario buscarFunc(int matricula) {
        List<MeuFuncionario> funcionarios = CadastrarFuncionarios.getListaFuncionarios();
        for (MeuFuncionario func : funcionarios) {
            if (func.getMatricula() == matricula) {
                return func; // Retorna o funcionário encontrado
            }
        }
        return null; // Retorna null se o funcionário não for encontrado
    }

    public static void removerFunc(int matricula) {
        System.out.println("Removendo funcionário com matrícula " + matricula + "...");
        if (CadastrarFuncionarios.excluir(matricula)) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário com matrícula " + matricula + " não encontrado.");
        }
    }
    


public static void executar() {
    int op;

         do {
                exibirMenu();
                op = Console.lerInt();
                opcoes(op);
         } while (op != 0);
    
        }

    }
    

    


