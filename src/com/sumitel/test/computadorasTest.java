/*  
    Laboratorio Aplicación Java Módulo 1
    Jesús Ignacio Betancourt Morales
    Curso Lógica de Programación
    Global Mentoring
*/

package com.sumitel.test;

import com.sumitel.domain.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Double;

public class computadorasTest {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        //creación de computadora HP
        
        Monitor monitor = new Monitor(17.0, "LCD", "HP", "Negro");
        Teclado teclado = new Teclado("USB", "HP", "Negro");
        Raton raton = new Raton("USB", "HP", "Negro");
        Nombre nombre = new Nombre ("HP");
        Computadora hpComputadora = new Computadora(nombre,1,monitor, raton, teclado);
        

        //creación de computadora Toshiba
        
        monitor = new Monitor(23.0, "LED", "Toshiba", "Blanco");
        teclado = new Teclado("USB", "Toshiba", "Blanco");
        raton = new Raton("USB", "Toshiba", "Blanco");
        nombre = new Nombre ("Toshiba");
        
        Computadora toshibaComputadora = new Computadora(nombre,2,monitor, raton, teclado);
      

        //creación de computadora Armada
        
        monitor = new Monitor(29.0, "LED", "LG", "Plata");
        teclado = new Teclado("Bluetooth", "Microsoft", "Negro");
        raton = new Raton("Bluetooth", "Vorago", "Blanco");
        nombre = new Nombre ("Armada");
        
        Computadora armadaComputadora = new Computadora(nombre,3,monitor, raton, teclado);
        
        //Inicialización del arreglo
        ArrayList<Computadora> computadoras = new ArrayList<Computadora>();
        computadoras.add(hpComputadora);
        computadoras.add(toshibaComputadora);
        computadoras.add(armadaComputadora);
        
        //hpComputadora, toshibaComputadora, armadaComputadora
        
        //Inicialización nueva computadora
        String nuevoNombre, tipoMonitor, marcaMonitor, colorMonitor;
        String tipoTeclado, marcaTeclado, colorTeclado, tipoRaton, marcaRaton, colorRaton;
        int id = 3;
        double tamañoMonitor;
        
        //Inicialización del menú del programa
        int opcion = 0;
        
        while (opcion != 3){
            System.out.println("Seleccione una opción: (1.Desplegar computadoras, 2.Añadir nueva computadora 3. Salir)");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    //Ciclo for que muestra la información de las computadoras
                    for (Computadora computadora : computadoras) {
                        computadora.desplegarInformacionComputadora();
                        System.out.println("");
                    }
                    break;
                case 2:
                    //Funcionalidad para añadir una nueva computadora
                    System.out.println("A continuación añadirá los datos de la computadora:");
                    //Nombre, registro y ID
                    System.out.println("Nombre de la computadora:");
                    nuevoNombre = in.next();
                    nombre = new Nombre (nuevoNombre);
                    id++;
                   
                    //Datos monitor
                    System.out.println("A continuación introducirá los datos del monitor");
                    System.out.println("Tamaño de monitor:");
                    tamañoMonitor = in.nextDouble();
                    System.out.println("Tipo de monitor:");
                    tipoMonitor = in.next();
                    System.out.println("Marca de monitor:");
                    marcaMonitor = in.next();
                    System.out.println("Color de monitor:");
                    colorMonitor = in.next();
                    monitor = new Monitor(tamañoMonitor, tipoMonitor, marcaMonitor, colorMonitor);
                    
                    //Datos teclado
                    System.out.println("A continuación introducirá los datos del teclado");
                    System.out.println("Tipo de teclado:");
                    tipoTeclado = in.next();
                    System.out.println("Marca de teclado:");
                    marcaTeclado = in.next();
                    System.out.println("Color de teclado:");
                    colorTeclado = in.next();
                    teclado = new Teclado(tipoTeclado, marcaTeclado, colorTeclado);
                    
                    //Datos ratón
                    System.out.println("A continuación introducirá los datos del ratón");
                    System.out.println("Tipo de ratón:");
                    tipoRaton = in.next();
                    System.out.println("Marca de ratón:");
                    marcaRaton = in.next();
                    System.out.println("Color de ratón:");
                    colorRaton = in.next();
                    raton = new Raton(tipoRaton, marcaRaton, colorRaton);

                    Computadora  nuevaComputadora = new Computadora(nombre,id,monitor, raton, teclado);
                    computadoras.add(nuevaComputadora);
                    break;
                //salida del sistema
                case 3:
                    System.out.println("Muchas gracias por utilizar el sistema");
                    System.exit(0);
                    break;
            }    
        }
    }
}
