/*  
    Laboratorio Aplicación Java Módulo 1
    Jesús Ignacio Betancourt Morales
    Curso Lógica de Programación
    Global Mentoring
*/

package com.sumitel.domain;

public class Nombre {//CREACION DE CLASE

    private String nombre="";

    public void despliegaInformacionNombre(){
        System.out.println("\t\t"+"Computadora "+nombre);

    }

    public Nombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}