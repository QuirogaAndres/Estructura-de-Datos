package Defensa_pilas_hito3;

public class Main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Andres" , "Quiroga" , 24 , "El Alto" , 90 , "9208422LP");
        Estudiante est2 = new Estudiante("Lionel" , "Messi" , 64 , "Cochabamba" , 95 , "87453146LP");
        Estudiante est3 = new Estudiante("Popeye" , "Perez" , 54 , "Santa Cruz" , 60 , "12345678LP");
        Estudiante est4 = new Estudiante("Winston" , "Churchill" , 44 , "La Paz" , 70 , "09876543LP");
        Estudiante est5 = new Estudiante("Adolfo" , "Hitler" , 34 , "El Alto" , 80 , "56193064LP");

        PiladeEstudiante pila = new PiladeEstudiante(10);
        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);

//        pila.mostrarPilaEstudiantes();
        aprobados(pila , 60);
//        kesimo(pila , 4);
//        mover_estudiantes(pila);
    }

    // Determinar cuantos estudiantes de la sede el alto aprobaron

    public static void aprobados(PiladeEstudiante pila , int notafinal){
        PiladeEstudiante aux = new PiladeEstudiante(10);
        Estudiante valornota = null;
        int mayornota = 0;

        while (!pila.esVacio()){
        valornota = pila.eliminar();
            if (valornota.getNotaFinal() > notafinal && valornota.getSede() == "El Alto"){
                mayornota = mayornota + 1;
            }
            aux.adicionar(valornota);
        }
        System.out.println("Los estudiantes aprobados: " +  mayornota);
    }

    // kesimo
    public static void kesimo(PiladeEstudiante pila , int valorkesimo){
        PiladeEstudiante aux = new PiladeEstudiante(10);
        Estudiante valor = null;

        while (pila.esVacio() == false){
            if (pila.nroElem() != valorkesimo){
                aux.adicionar(pila.eliminar());
            } else {
                valor = pila.eliminar();
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrarPilaEstudiantes();
    }
    // Mover a la base con menor nota

    public static void mover_estudiantes(PiladeEstudiante pila){
        PiladeEstudiante aux = new PiladeEstudiante(10);
        Estudiante menor =  pila.eliminar();
        Estudiante valor = null;

        while (!pila.esVacio()){
            valor = pila.eliminar();

            if ( valor.getNotaFinal() < menor.getNotaFinal()){
                menor = valor;
            }
            aux.adicionar(valor);
        }
        while (pila.esVacio() == false){
            if (pila.esVacio()){
                aux.adicionar(pila.eliminar());
            } else {
                valor = pila.eliminar();
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrarPilaEstudiantes();
        menor.mostrarEstudiante();
    }

    // Mostrar cuantos estudiantes aprobaron
}