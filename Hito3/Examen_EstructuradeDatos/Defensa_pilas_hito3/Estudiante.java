package Defensa_pilas_hito3;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private int notaFinal;
    private String Ci;

    public Estudiante(String nombres , String apellidos , int edad , String sede , int notaFinal , String ci){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.Ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getCi() {
        return Ci;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setCi(String ci) {
        Ci = ci;
    }
    public void mostrarEstudiante(){
        System.out.println("\n Mostrando Estudiante"); // ALT + 92
        System.out.println(" Nombres: " + this.getNombres());
        System.out.println(" Apellidos: " + this.getApellidos());
        System.out.println(" Edad: " + this.getEdad());
        System.out.println(" Sede: " + this.getSede());
        System.out.println(" notaFinal: " + this.getNotaFinal());
        System.out.println(" Ci: " + this.getCi());
    }
}
