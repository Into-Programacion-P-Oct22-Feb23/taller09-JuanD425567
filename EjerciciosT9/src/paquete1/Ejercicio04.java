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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        double respuesta;
        for (int i = 0; i < promedios.length ; i++) {
            respuesta=promedios[i];
            if((respuesta>=0)&&(respuesta<=5.9)){
                promediosCualitativos[i]="Regular";
            }else{
                if((respuesta>=6)&&(respuesta<+8.9)){
                    promediosCualitativos[i]="Bueno";
                }else{
                    promediosCualitativos[i]="Sobresaliente";
                }
            }
           
        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("%s promedio: %.2f  promedio cualitativos: %s\n"
                    ,estudiantes[i],promedios[i], promediosCualitativos[i]);
        }
        

    }
}
//Creamos una variable que se llama respuesta y comenzamos un ciclo repetitivo 
//con for asignando los valores que son: regular, bueno, sobresaliente a la variale
//promediosCualitativos, para luego hacer otro ciclo For y mediante un PrintF
//lanzar la lista de estudiantes con sus promedios y promedios cualitativos.