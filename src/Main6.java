import java.io.FileNotFoundException;
import java.io.IOException;
/*
abstract class Super {
    public abstract void m1() throws ArrayIndexOutOfBoundsException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        System.out.print("SUBMethod");
        throw new ArrayIndexOutOfBoundsException();
    }
}

public class Main6 {
    public static void main(String[] args) {
        /*
        * Metodo para compilar valida el metodo de
        * de suèr porque la variable es de esa referencia
        * como el objetoto instanciado es de tipo Sub en runtime
        * ejecutara el metodo de de la clase Sub*/
        /*Super s = new Sub();
        try {
            s.m1();
        }  catch(IOException e){

        } finally {
            System.out.print("N");
        }
    }
}*/