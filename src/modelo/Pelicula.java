package modelo;
import java.util.Scanner;

public class Pelicula extends  Titulo{
    Scanner entrada = new Scanner(System.in);

    //Atributo propio de la clase
    private String director;

    //Métodos Getter y Setter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //Método sobrescrito de la clase Titulo para ingresar la información específica de la pelícuala
    @Override
    public void ingresarInformacionTitulo() {
        super.ingresarInformacionTitulo();
        System.out.print("Ingrese el nombre del director: ");
        setDirector(entrada.nextLine());
    }

    //Método sobrescrito de la clase Titulo para mostrar la información específica de la película
    @Override
    public void verInfoTitulo() {
        super.verInfoTitulo();
        System.out.println("Director: " + director);
    }

}
