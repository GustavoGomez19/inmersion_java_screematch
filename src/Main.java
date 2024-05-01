import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Attributes
        int fechaLanzamiento = 1999;
        double evaluacion = 5.0;
        boolean incluidoEnPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix, la mejor película del fin del mílenio
                """;
        double mediaEvaluacionUsuario = 0;
        double evaluacionPelicula = 0;
        int cantidadCalificaciones = 0;

        System.out.println("Nombre de la película: " + nombre);
        System.out.print("Sinopsis: " + sinopsis);
        System.out.println("Año de lanzamiento de la película: " + fechaLanzamiento);
        System.out.println("Tuvo una evaluación de: " + evaluacion);
        System.out.println("Está incluida en el plan básico? " + incluidoEnPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 5.0) / 3;
        System.out.println("Promedio de evaluación de la película " + nombre + " fue de: " + mediaEvaluacion);

        if (fechaLanzamiento >= 2023) {
            System.out.println("Película popular del momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la calificación de la película: (" + nombre + ")");
            evaluacionPelicula = entrada.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + evaluacionPelicula;
        }
        System.out.println("El promedio de evaluación de la película " + nombre + " fue: " + mediaEvaluacionUsuario/3);

        while (cantidadCalificaciones < 3) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la calificación de la película: (" + nombre + ")");
            evaluacionPelicula = entrada.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + evaluacionPelicula;
            cantidadCalificaciones++;
        }
        System.out.println("El promedio de evaluación de la película " + nombre + " fue: " + mediaEvaluacionUsuario/3);
    }
}