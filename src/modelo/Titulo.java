package modelo;

public class Titulo {
    // Atributos de la clase
    private String nombre;
    private int fechaLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDuracionEnMinutos;

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

    public void verInfoPelicula(){
        System.out.println("*** INFORMACIÓN DEL TÍTULO ***");
        System.out.println("Nombre: " + nombre +  "\nFecha de lanzamiento: " +
                fechaLanzamiento + "\nTiempo de duración: " +
                getTiempoDuracionEnMinutos() + " minutos.");
    }
}
