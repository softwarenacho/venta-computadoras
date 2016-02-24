/*  
    Laboratorio Aplicación Java Módulo 1
    Jesús Ignacio Betancourt Morales
    Curso Lógica de Programación
    Global Mentoring
*/

package com.sumitel.domain;

public class Computadora {

    private Nombre varNombre;
    private int id=0;
    private Monitor varMonitor;
    private Teclado varTeclado;
    private Raton varRaton;

    public Computadora(){//constructor vacio
   
}

    public Computadora(Nombre nombre,int id,Monitor monitorVar, Raton ratonVar, Teclado tecladoVar){//constructor que inicializa variables
        this.varNombre=nombre;
        this.id=id;
        this.varMonitor=monitorVar;
        this.varRaton=ratonVar;
        this.varTeclado=tecladoVar;
        
    }

    public void desplegarInformacionComputadora(){
       System.out.println("COMPUTADORA:");
       varNombre.despliegaInformacionNombre();
       System.out.println("Informacion del Monitor");
       varMonitor.despliegaInformacionMonitor();
       System.out.println("Informacion del Teclado");
       varTeclado.despliegaInformacionTeclado();
       System.out.println("Informacion del Raton");
       varRaton.despliegaInformacionDeRaton();
    }
    
    public Nombre getNombre() {//creacion del get
        return varNombre;
    }

    public void setNombre(Nombre nombreVar) {//creacion del set
        this.varNombre = nombreVar;
    }

    public Monitor getMonitor() {//creacion del get
        return varMonitor;
    }

    public void setMonitor(Monitor monitorVar) {//creacion del set
        this.varMonitor = monitorVar;
    }

    public Teclado getTecladoVar() {//creacion del get
        return varTeclado;
    }

    public void setTecladoVar(Teclado tecladoVar) {//creacion del set
        this.varTeclado = tecladoVar;
    }

    public Raton getRatonVar() {//creacion del get
        return varRaton;
    }

    public void setRatonVar(Raton ratonVar) {//creacion del set
        this.varRaton = ratonVar;
    }

    public int getID() {
        return id;
    }

   
    public void setID(int iD) {
        this.id = iD;
    }
}


