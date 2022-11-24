package defensa_colas_hito4;

import Manejo_de_Colas.Manejo_de_Numeros.Numeros;

public class colaCliente {
    private int max;
    private int ini;
    private int fin;
    private Cliente  colacliente[] ;

    public colaCliente(int max){
        this.max = max;
        this.colacliente = new Cliente[this.max + 1];
        this.fin = 0;
        this.ini = 0;
    }

    public boolean esVacia(){
        if (ini == 0 && fin == 0)
            return true;
        return false;

    }

    public boolean esLlenar(){
        if (fin == max)
            return true;
        return false;
    }

    public int nroElem(){
        return fin - ini;
    }

    public void adicionar(Cliente elemento){
        if (esLlenar() == false){
            fin++;
            colacliente[fin] = elemento;
        } else{
            System.out.println("Cola de Clientes Llena");
        }
    }

    public Cliente eliminar(){
        Cliente elementoEliminado = null;

        if (esVacia() == false){
            ini++;
            elementoEliminado = colacliente[ini];
            if (ini == fin ){
                ini = 0;
                fin = 0;
            }
        } else {
            System.out.println("Cola Vacia!!!");
        }
        return elementoEliminado;
    }

    public void mostrarCliente(){
        if (esVacia()){
            System.out.println("Cola Vacia , no hay elementos que mostrar");
        } else {
            Cliente elementoEliminado = null;
            System.out.println("Mostrando datos de la Cola");
            colaCliente aux = new colaCliente(max);

            while (esVacia() == false){
                elementoEliminado = eliminar();
//                System.out.println("Valor = " + elementoEliminado);
               elementoEliminado.muestraCliente();
                aux.adicionar(elementoEliminado);
            }
            vaciar(aux);
        }
    }

    public void vaciar(colaCliente aux){
        while (aux.esVacia() == false)
            adicionar(aux.eliminar());
    }
}

