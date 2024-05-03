import modelo.*;

import java.util.Scanner;

public class Principal {
    public void mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9){
            String menu = """
                    ===================================
                        Bienvenido a Screen Match
                        Seleccione una opción:
                        1. Registrar nueva película
                        2. Registrar nueva serie
                    ===================================
                    """;
            System.out.println(menu);
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el nobre de la película: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese el año de lanzamiento: ");
                    int fechaLanzamiento = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película: ");
                    int duracionEnMinutos = entrada.nextInt();
                    entrada.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaLanzamiento(fechaLanzamiento);
                    peliculaUsuario.setTiempoDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.verInfoPelicula();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la serie: ");
                    nombre = entrada.nextLine();
                    System.out.print("Ingrese el año de lanzamiento: ");
                    fechaLanzamiento = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el número de temporadas: ");
                    int temporadas = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el número de episodios por temporada: ");
                    int episodiosPorTemporada = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese la duración en minutos por episodio: ");
                    int duracionDeMinutosPorEpisodio = entrada.nextInt();
                    entrada.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombre);
                    serieUsuario.setFechaLanzamiento(fechaLanzamiento);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionDeMinutosPorCapitulo(duracionDeMinutosPorEpisodio);
                    serieUsuario.verInfoPelicula();
            }
        }
    }
}
