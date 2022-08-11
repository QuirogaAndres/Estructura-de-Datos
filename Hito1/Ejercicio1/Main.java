package Ejercicio1;

public class Main {
    public static void main(String[] args){
        Vehiculo v1 = new Vehiculo();

        v1.Girar_a_la_Derecha();

        //En la clase vehiculo crear el metodo cambiar de carril y llamarlo desde
        //la clase main
        v1.Cambiar_de_Carril();

        Vehiculo v2 = new Vehiculo("Turbo" , "Blanco" , "Vagonta" , "4x4" , "Toyota");
        v2.Mover();

        //Crear un metodo en la clase vehiculo que me permita mostrar
        //todos sus atributos

        v2.mostrar();

        //Crear un metodo que retorne el nombre del vehiculo
        System.out.println("Nombre:" + v2.getNombre());


        //CAMBIAR DE COLOR DE BLANCO A ROJO
        v2.setColor("Rojo");
        v2.mostrar();

    }
}






