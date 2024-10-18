import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner entrada = new Scanner(System.in);

        //LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("","",0,0.0);

        //miLibroCalificaciones1.mostrarMensaje();
        //miLibroCalificaciones2.mostrarMensaje();

//        System.out.println("Escriba el nombre del curso: ");
//        String nombreDelCurso = entrada.nextLine();
//
//        System.out.println("Escriba el período del curso: ");
//        String  periodo = entrada.nextLine();
//
//        System.out.println("Escriba el año del curso: ");
//        int anio = entrada.nextInt();
//
//        System.out.println("Escriba el promedio del curso: ");
//        double promedio = entrada.nextDouble();
//        System.out.println();
//
//        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(nombreDelCurso, periodo, anio, promedio);
//
//        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso,periodo,anio,promedio);
//        miLibroCalificaciones.mostrarMensaje(nombreDelCurso,periodo,anio,promedio);

//        Operaciones operaciones = new Operaciones();
//        operaciones.setN1(20.0);
//        operaciones.setN2(2.0);
//        operaciones.imprimirDatos();
//
//        System.out.println(operaciones.sumatoria());
//        operaciones.sumaimpresion();
//
//        operaciones.raiz();

        for (int i=1; i<=5; i++) {

            System.out.println("Inserte un número:");
            Double a1 = entrada.nextDouble();
            System.out.println("Inserte otro número: ");
            Double a2 = entrada.nextDouble();

            OperacionesInput operacionesInput1 = new OperacionesInput(a1, a2);

            operacionesInput1.sumaImprimir();
            operacionesInput1.restaImprimir();
            operacionesInput1.multiplicaImprimir();
            operacionesInput1.divideImprimir();
        }


    }
}