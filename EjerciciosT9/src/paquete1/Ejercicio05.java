/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
        */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        char inicialLetra;
        boolean bandera = true;
        
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < estudiantes.length; i++) {
                inicialLetra=estudiantes[i].charAt(0);
                String inicial2=String.valueOf(inicialLetra);
                if (inicial.equals(inicial2)) {
                    bandera=false;
                }
                
            }
        }

    }

}
//creamos un ciclo repetitivo for donde comparamos el valor de i con estudiantes.length
// le asignamos el valor de estudiantes[i].charAt a inicialLetra, inicializamos
//la variable inicial2 y le damos el valor de ValueOF que tiene InicialLetra
//luego en otro if comparamos el char de inicial2 y si cumple la condicion
//bandera pasa a ser Falsa, saliendo asi del ciclo repetitivo.