/*  
    Laboratorio Aplicación Java Módulo 1
    Jesús Ignacio Betancourt Morales
    Curso Lógica de Programación
    Global Mentoring
*/

package com.sumitel.domain;

public class Teclado {

    private String tipoDeEntrada = "";
    private String marca = "";
    private String color = "";

    public void despliegaInformacionTeclado(){
        System.out.println("\t\tTipo de entrada: " + tipoDeEntrada);
        System.out.println("\t\tMarca: " + marca);
        System.out.println("\t\tColor: " + color);

    }

    public Teclado(String tipoDeEntrada,String marca,String color){
        this.color=color;
        this.marca=marca;
        this.tipoDeEntrada=tipoDeEntrada;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
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
