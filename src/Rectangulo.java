public class Rectangulo extends FiguraDosD {

    boolean esCuadrado() {
        //operador ternario
       boolean cuadrado =  getAncho() == getAlto()?  true: false;
       return cuadrado;


       /* if (getAncho() == getAlto()) {
            return true;
         } else {
            return false;
        }//fin si*/

    }//fin metodo
}//end class
