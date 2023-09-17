public class Main2 {
    static public void main(String[] args) {
        /*Programa si es el arreglo de tipo primitivo si compila correctamente
        * pero si es de tipo clase objeto compila pero produce un null point exception
        * porque el valor por default es null de las clases boxing de primitivos*/
        //si funciona y produce resultado de 0.0

        double [] arr = new double[2];
        System.out.println(arr[0] + arr[1]);

        /*si compila pero produce un error runtime nullpoint exception
        Double [] ar2 = new Double[2];
        System.out.println(ar2[0] + ar2[1]);*/

    }

}
