package modelo;

public class Serie extends  Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionDeMinutosPorCapitulo;

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

    @Override
    public int getTiempoDuracionEnMinutos() {
        return duracionDeMinutosPorCapitulo * episodiosPorTemporada * temporadas;
    }

    @Override
    public void verInfoPelicula() {
        super.verInfoPelicula();
        System.out.println("Temporadas: " + temporadas + "\nCapitulos por temporada: " + episodiosPorTemporada);
    }
}
