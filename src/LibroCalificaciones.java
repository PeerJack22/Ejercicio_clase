
public class LibroCalificaciones {
    //atributo
    private String nombreDelCurso;
    private String periodo;
    private int anio;
    private double promedio;

    //Constructor con parámetros
    public LibroCalificaciones(String nombre, String periodo, int anio, double promedio) {
        nombreDelCurso = nombre;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }

   //setter
    public void establecerNombreDelCurso(String nombre, String periodo, int anio, double promedio) {
        nombreDelCurso = nombre;
        this.periodo = periodo;
        this.anio = anio;
        this.promedio = promedio;
    }

    //Getter
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;

    }

    public String obtenerPeriodo() {
        return periodo;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    //método personalizado
    public void mostrarMensaje(String nombreDelCurso, String periodo, int anio, double promedio) {
        System.out.printf("Binvenido al libro de calificaciones para\n%s!\n",
                obtenerNombreDelCurso());
        System.out.println("Periodo: "+ obtenerPeriodo());
        System.out.println("Año: "+obtenerAnio());
        System.out.println("Promedio: "+obtenerPromedio());

    }

    public void mostrar(){}
}
