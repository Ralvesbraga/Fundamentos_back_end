public class Retangulo extends Quadrilatero{
    
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.getBase() * this.getAltura();
    }
    @Override
    public String toString() {
        return "Retangulo [base=" + base + ", altura=" + altura + ", calcularArea()=" + calcularArea() + "]";
    }

    
    
}
