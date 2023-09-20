/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaprobado;
import java.util.Scanner;

public class NotaAprobado{

    public void Nota(){
    int nota;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduzca nota a analizar: ");
    nota = entrada.nextInt();
    if (nota > 5){
    System.out.println("prueba superada ");
        }
    }
    public static void main(String[] args){
        NotaAprobado nota = new NotaAprobado();
        nota.Nota();
        
    }
}