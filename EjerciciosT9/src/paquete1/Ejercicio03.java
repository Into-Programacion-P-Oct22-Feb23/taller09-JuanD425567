/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double suma = 0;
        double div = 0;
        for (int contador = 0; contador < arreglo.length; contador++) {
            suma = suma + arreglo[contador];

        }
        div = (double) suma / arreglo.length;

        for (int contador = 0; contador < arreglo.length; contador++) {
            if (arreglo[contador] < div) {
                
                elementosAbajoMedia = elementosAbajoMedia + 1;
            } else {
               
                elementosArribaMedia = elementosArribaMedia +1;
            }
        }

        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+div);
        System.out.println("Los elementos abajo de la media son"
                + ": " +elementosAbajoMedia);
        System.out.println("Los elementos arriba de la media"
                + " son: " + elementosArribaMedia);
    }

}
//aumetamos variables sacamos la media, la suma y mediante un for y un if
//comparamos y conseguimos la cantidad de valores que estan arriba y abajo
//de la media, luego presentamos en pantalla.