public class Rectangulo extends Figura {
    private double base;
    private double altura;
    private int lados;

    public Rectangulo(double pBase, double pAltura, int pLados){
        base = pBase;
        altura = pAltura;
        lados = pLados;
    }

    public double calcularArea(){
        return base * altura;
    }

    public int numeroLados(){
        return 4;
    }
}
