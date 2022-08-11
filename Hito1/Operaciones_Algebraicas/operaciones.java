package OperacionesAlgebraicas;

public class operaciones {
    private  int num1;
    private  int num2 ;

    public operaciones(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma(){
        int suma = this.num1 + this.num2;
        return suma;
    }
    public  int resta(){
        int respuesta = this.num1 - this.num2;
        return respuesta;
    }
    public int multiplicacion(){
        int respuesta = this.num1 * this.num2;
        return respuesta;
    }
    public int divsion(){
        int respuesta = this.num1 / this.num2;
        return respuesta;
    }

}
