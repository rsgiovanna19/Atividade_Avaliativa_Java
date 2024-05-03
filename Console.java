package controller;
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {        //leitura de dados int
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static float lerFloat() {        //leitura de dados float
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {      //leitura de dados string 
        return leitor.nextLine();
    }
    
}
