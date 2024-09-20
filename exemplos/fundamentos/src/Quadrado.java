public class Quadrado implements IQuadrilatero {
    private double lado;

    

    public Quadrado(double lado) {
        this.lado = lado;
    }



    public double getLado() {
        return lado;
    }



    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double calcularArea() {
        return this.getLado() * this.getLado();
        
    }

    
    public double calcularArea(Double diagonal){
        return diagonal * diagonal;
    }



    @Override
    public String toString() {
        return "Quadrado [lado=" + lado + ", calcularArea()=" + calcularArea() + "]";
    }

    
}
