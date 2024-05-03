package modelo;

public class Serie extends  Titulo{

    //Atributos porpios de la clase
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionDeMinutosPorCapitulo;
    private int horasPorDia;

    //Métodos Getter y Setter
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionDeMinutosPorCapitulo() {
        return duracionDeMinutosPorCapitulo;
    }

    public void setDuracionDeMinutosPorCapitulo(int duracionDeMinutosPorCapitulo) {
        this.duracionDeMinutosPorCapitulo = duracionDeMinutosPorCapitulo;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    //Método sobrescrito de la clase Titulo con el cualse calcula el tiempo de duración en minutos de la serie
    @Override
    public int getTiempoDuracionEnMinutos() {
        return duracionDeMinutosPorCapitulo * episodiosPorTemporada * temporadas;
    }

    //Método sobrescrito de la clase Titulo para ingresar la información específica de la serie
    @Override
    public void ingresarInformacionTitulo() {
        super.ingresarInformacionTitulo();
        System.out.print("Ingrese el número de temporadas: ");
        temporadas = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el número de episodios por temporada: ");
        episodiosPorTemporada = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese la duración en minutos por episodios: ");
        duracionDeMinutosPorCapitulo = entrada.nextInt();
        entrada.nextLine();
    }

    //Método sobrescrito de la clase Titulo para mostrar la información específica de la serie
    @Override
    public void verInfoTitulo() {
        super.verInfoTitulo();
        System.out.println("Temporadas: " + temporadas +
                "\nCapitulos por temporada: " + episodiosPorTemporada);
    }
}
