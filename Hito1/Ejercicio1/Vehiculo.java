package Ejercicio1;

public class Vehiculo {
    // atrivutos de la clase
    private String nombre;
    private String color;
    private String modelo;
    private String tamano;
    private String marca;

    //Constructor de la clase Vehiculo
    public Vehiculo(){
        System.out.println("Soy el constructor ");
    }
    public Vehiculo(String nombre, String color, String modelo, String tamano,String marca){
        this.nombre = nombre;
        this.color = color;
        this.tamano = tamano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void Mover(){
        System.out.println("Soy el metodo Mover");
    }

    public void Frenar(){
        System.out.println("Soy el Metodo Frenar");
    }

    public void Girar_a_la_Derecha(){
        System.out.println("Soy el Metodo Girar a la Derecha");
    }

    public void Girar_a_la_Izquierda(){
        System.out.println("Soy el Metodo Girar a la Izquierda");
    }

    public void Cambiar_de_Carril(){
        System.out.println("Soy el metodo Cambiar de Carril ");
    }

    //Crear un metodo en la clase vehiculo que me permita mostrar
    //todos sus atributos
    public void mostrar(){
        System.out.println("El nombre es:" + this.nombre);
        System.out.println("El color es:" + this.color);
        System.out.println("El tamano es:" + this.tamano);
        System.out.println("El modelo es:" + this.modelo);
        System.out.println("El marca es:" + this.marca);

    }
    //Crear un metodo que retorne el nombre del vehiculo

    public String getNombre(){
        return this.nombre;
    }

    public void setColor(String nuevocolor) {
        this.color = nuevocolor;
    }
}


