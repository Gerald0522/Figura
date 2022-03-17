public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double pRadio){
        radio = pRadio;
    }

    public double calcularArea(){
        return Math.pow(radio, 2) * 3.14;
    }

    public int numeroLados(){
        return 0;
    }
}
