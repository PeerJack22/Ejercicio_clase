import static java.lang.Math.sqrt;

public class Operaciones {

    //atributos

    private Double n1;
    private Double n2;

    //metodos
    public Operaciones() {
    }

    public Operaciones(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //getters y setters

    private  Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    private  Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    //Métodos personalizados
    public void imprimirDatos (){
        System.out.println("N1: " + getN1());
        System.out.println("N2: " + getN2());
    }

    public Double sumatoria(){
        return n1 + n2;
    }

    public void sumaimpresion(){
        Double suma = n1 + n2;
        System.out.println(suma);
    }

    public void raiz(){
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }

}
