/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calctriangulo;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalcTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite o valor da base");
        float base = sc.nextFloat();
        System.out.println("Digite o valor da altura");
        float altura = sc.nextFloat();
        
        area = base * altura;
        
        System.out.println("Valor da area do triangulo é igual " + area);
        
    }
    
}
