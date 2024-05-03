package controller;

import java.util.ArrayList;
import java.util.List;

public class CadastrarFuncionarios {

    private static List<MeuFuncionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(MeuFuncionario func){
        listaFuncionarios.add(func);
    }

    public static List<MeuFuncionario> getListaFuncionarios(){
        return listaFuncionarios;
    }

    
    public static boolean excluir(int matricula) {

        for (MeuFuncionario tempFuncionario : listaFuncionarios){
            if (tempFuncionario.getMatricula() == matricula) {
                listaFuncionarios.remove(tempFuncionario);
                return true;
            }
        }

        return false;

    }
}

