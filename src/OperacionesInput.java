public class OperacionesInput {

    //Atributos
    private Double a1;
    private Double a2;

    //Constructor


    public OperacionesInput(Double a1, Double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    //Getters and setters

    public Double getA1() {
        return a1;
    }

    public void setA1(Double a1) {
        this.a1 = a1;
    }

    public Double getA2() {
        return a2;
    }

    public void setA2(Double a2) {
        this.a2 = a2;
    }

    //Métodos
    public void sumaImprimir(){
        Double suma = a1 + a2;
        System.out.println("El resultado es: " + suma);
        System.out.println();
    }

    public void restaImprimir(){
        Double resta = a1 - a2;
        System.out.println("El resultado es: " + resta);
        System.out.println();
    }

    public void multiplicaImprimir(){
        Double multiplicacion = a1 * a2;
        System.out.println("El resultado es: " + multiplicacion);
        System.out.println();
    }

    public void divideImprimir(){
        if (a2 == 0){
            System.out.println("No se puede dividir para 0.");
            System.out.println();
        }
        else{
            Double division = a1 / a2;
            System.out.println("El resultado es: " + division);
            System.out.println();
        }

    }

}
