package modelo;

public class CalculadoraDeTiempo {
    private int calcularTiempoTotalTitulos;

    public int getCalcularTiempoTotalTitulos(int tiempoDuracionEnMinutos) {
        return calcularTiempoTotalTitulos;
    }

    public void calcularTiempoTitulos(Titulo titulo){
        calcularTiempoTotalTitulos = calcularTiempoTotalTitulos + titulo.getTiempoDuracionEnMinutos();
        System.out.println("El tiempo que necesitas para ver las películas y series ingresadas es de" + calcularTiempoTotalTitulos + " minutos");
    }

}
