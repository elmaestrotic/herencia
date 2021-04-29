public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4,8,"Escaleno");//hijo de la subclase
        //t1.setAncho(8.2);
        System.out.println(t1.calcularÁrea(18.2,8.2));

        FiguraDosD f1= new FiguraDosD(4,2);//objeto de la super
        f1.calcularÁrea();
    }

}
