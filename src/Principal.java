import modelo.*;

import java.util.Scanner;

public class Principal {
    public void mostrarMenu(){
        Scanner entrada = new Scanner(System.in);
        int opcion = 10;

        while (opcion != 0){
            String menu = """
                    ===================================
                        Bienvenido a Screen Match
                        Seleccione una opción:
                        1. Registrar nueva película
                        2. Registrar nueva serie
                        3. Calcular días para ver una serie
                        0. Salir
                    ===================================
                    """;
            System.out.print(menu);
            System.out.print("Ingrese la opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.ingresarInformacionTitulo();
                    System.out.print("Ingrese la duración en minutos de la película: ");
                    int duracionEnMinutos = entrada.nextInt();
                    entrada.nextLine();
                    peliculaUsuario.setTiempoDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.verInfoTitulo();

                    break;
                case 2:
                    Serie serieUsuario = new Serie();
                    serieUsuario.ingresarInformacionTitulo();
                    serieUsuario.verInfoTitulo();
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo");
                    System.out.print(menu);
                    System.out.print("Ingrese la opción: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();
            }
        }
        System.out.println("Cerrando aplicación... Hasta pronto!.");
        entrada.close();
    }
}
