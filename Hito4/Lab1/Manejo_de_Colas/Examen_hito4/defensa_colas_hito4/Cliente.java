package defensa_colas_hito4;

public class Cliente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public Cliente(String nombres, String apellidos, int edad, String pais, String genero, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
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

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
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

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void muestraCliente(){

            System.out.println("\n Mostrando Cliente"); // ALT + 92
            System.out.println(" Nombres: " + this.getNombres());
            System.out.println(" Apellidos: " + this.getApellidos());
            System.out.println(" Edad: " + this.getEdad());
            System.out.println(" Pais: " + this.getPais());
            System.out.println(" Genero: " + this.getGenero());
            System.out.println(" Tipo: " + this.getTipo());

    }
}
