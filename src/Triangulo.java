public class Triangulo extends FiguraDosD {
  double ancho, alto;
    public Triangulo(double ancho, double alto, String tipo) {
        super(ancho, alto);//padre
    }

    public Triangulo(double ancho, double alto, double ancho1, double alto1) {
        super(ancho, alto);
        this.ancho = ancho1;
        this.alto = alto1;
    }

    void calcularÁrea(){

        double area = (getAlto()*getAncho())/2;
    }


    //calcular área son atributos del hijo
    double calcularÁrea(double h, double w){
        ancho=w; alto=h;
        return (alto*ancho)/2;
    }

    //calcular área son atributos del Padre
    double calcularÁrea(double h, float w){
        setAncho(w);setAlto(h);
        return (getAlto()*getAncho())/2;
    }


}
