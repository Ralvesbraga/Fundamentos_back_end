public class Teste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4);
        Retangulo r1 = new Retangulo(10.1, 5.1);

        System.out.println(q1);
        System.out.println(r1);

        System.out.println(q1.calcularArea(5.0));
    }
    
}
