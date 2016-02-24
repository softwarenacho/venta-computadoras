/*  
    Laboratorio Aplicación Java Módulo 1
    Jesús Ignacio Betancourt Morales
    Curso Lógica de Programación
    Global Mentoring
*/

package com.sumitel.domain;

public class Monitor {//CREACION DE CLASE

    private double tamaño=0.0;//DECLARACION DE VARIABLES
    private String tipo="";
    private String marca="";
    private String color="";

    public void despliegaInformacionMonitor(){
        System.out.println("\t\tTamaño: " + tamaño);
        System.out.println("\t\tTipo: " + tipo);
        System.out.println("\t\tMarca: " + marca);
        System.out.println("\t\tColor: " + color);

    }

    public Monitor(double tamaño,String tipo,String marca,String color){
        this.color=color;
        this.marca=marca;
        this.tamaño=tamaño;
        this.tipo=tipo;

    }

    public double getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
   
    public String getTipo() {
        return tipo;
    }

 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMarca() {
        return marca;
    }

       public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

}
