package defensa_colas_hito4;

import Manejo_de_Colas.Manejo_de_Numeros.Numeros;

public class mainCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Andres" , "Quiroga" , 24 , "Bolivia" , "Masculino" , "Gold");
        Cliente cliente2 = new Cliente("Vladimir" , "Huariste" , 26 , "Paris" , "Masculino" , "Gold");
        Cliente cliente3 = new Cliente("Loukas" , "Marin" , 27 , "Rusia" , "Masculino" , "Gold");
        Cliente cliente4 = new Cliente("Agustin" , "Palle" , 28 , "Canada" , "Masculino" , "Silver");
        Cliente cliente5 = new Cliente("Josue" , "Mendoza" , 49 , "Argentina" , "Masculino" , "vip");

        colaCliente Cliente = new colaCliente(10);
        Cliente.adicionar(cliente1);
        Cliente.adicionar(cliente2);
        Cliente.adicionar(cliente3);
        Cliente.adicionar(cliente4);
        Cliente.adicionar(cliente5);

//        Cliente cliente6 = new Cliente("Donald" , "Trump" , 67 , "EEUU" , "Masculino" , "Gold");
//        Cliente cliente7 = new Cliente("Popeye" , "Espinaca" , 47 , "Marueco" , "Masculino" , "Vip");
//        Cliente cliente8 = new Cliente("Adolfo" , "Hitler" , 57 , "URSS" , "Masculino" , "Silver");
//        Cliente cliente9 = new Cliente("Maria" , "Magdalena" , 97 , "Mexico" , "Femenino" , "Gold");
//        Cliente cliente10 = new Cliente("Federica" , "Peluche" , 47 , "Ciudad Peluche" , "Femenina" , "Gold");
//
//        colaCliente Cliente = new colaCliente(10);


        Cliente.mostrarCliente();
    }

//    public static int muestraMayorElemento(colaCliente cola) {
//        Numeros aux = new Numeros(100);
//        int edad = 100;
//        int valorExtraidoDeLacola = 0;
//        while (!cola.esVacia()) {
//            valorExtraidoDeLacola = cola.eliminar();
//            if (valorExtraidoDeLacola < edad) {
//                edad = valorExtraidoDeLacola;
//            }
//            aux.adicionar(valorExtraidoDeLacola);
//        }
//        cola.vaciar(aux);
//        return valorExtraidoDeLacola;
//    }
//
//
//    public static void menorValoralPrincipio(colaCliente cola){
//        int mayorValor = muestraMayorElemento(cola);
//        int valorEliminadodelaCola;
//        Numeros aux = new Numeros(100);
//
//        while (cola.esVacia() == false){
//            valorEliminadodelaCola = cola.eliminar();
//            if (mayorValor != valorEliminadodelaCola){
//                aux.adicionar(valorEliminadodelaCola);
//            }
//        }
//        cola.adicionar(mayorValor);
//        cola.vaciar(aux);
//        cola.mostrarCliente();
//    }



}
