package modelo;

import java.util.Scanner;

public class Titulo {
    Scanner entrada = new Scanner(System.in);
    // Atributos de la clase
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDuracionEnMinutos;

    //Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionEnMinutos() {
        return tiempoDuracionEnMinutos;
    }

    public void setTiempoDuracionEnMinutos(int tiempoDuracionEnMinutos) {
        this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
    }

    //Método para ingresar información sobre el título
    public void ingresarInformacionTitulo(){
        System.out.print("Ingrese el nombre del titulo: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el año de lanzamiento: ");
        fechaLanzamiento = entrada.nextInt();
        entrada.nextLine();
    }

    //Método para ver información sobre el título
    public void verInfoTitulo(){
        System.out.println("*** INFORMACIÓN DEL TÍTULO ***");
        System.out.println("Nombre: " + nombre +  "\nFecha de lanzamiento: " +
                fechaLanzamiento + "\nTiempo de duración: " +
                getTiempoDuracionEnMinutos() + " minutos.");
    }
}
