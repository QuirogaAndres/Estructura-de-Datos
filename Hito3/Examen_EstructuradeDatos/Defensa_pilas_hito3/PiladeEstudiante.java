package Defensa_pilas_hito3;

import PiladeLibros.Libro;
import PiladeLibros.PiladeLibros;

public class PiladeEstudiante {
    private int max;
    private int tope;
    private Estudiante[] estudiantes;

    public PiladeEstudiante(int max){
        this.tope = 0;
        this.max = max;
        this.estudiantes = new Estudiante[this.max + 1];
    }

    public boolean esVacio(){
        if (tope == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlenar(){
        if (tope == max){
            return true;
        } else {
            return false;
        }
    }

    public int nroElem(){
        return this.tope;
    }

    public void adicionar(Estudiante nuevoestudiante){
        if (this.esLlenar() == false){
            this.tope = this.tope + 1;
            this.estudiantes [this.tope] = nuevoestudiante;
        } else {
            System.out.println("La Pila de Estudiantes esta llena.");
        }
    }

    public Estudiante eliminar(){
        Estudiante elementoEliminado = null;

        if (this.esVacio() == false){
            elementoEliminado = this.estudiantes[this.tope];
            this.tope = this.tope - 1;
        } else {
            System.out.println("La Pila de Estudiantes esta vacia.");
        }
        return elementoEliminado;
    }

    public void llenar(){}

    public void mostrarPilaEstudiantes(){
        Estudiante elem = null;
        if (esVacio()){
            System.out.println("Pila Vacia, no hay Item que mostrar");
        }
        else
        {
            System.out.println("\n Mostrando la Pila ");
            PiladeEstudiante aux = new PiladeEstudiante(this.max);
            while (!esVacio())
            {
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PiladeEstudiante aux){
        while (!aux.esVacio())
            adicionar(aux.eliminar());
    }
}

