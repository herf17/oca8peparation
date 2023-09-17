

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}
public class Main {

    public static void change(Message m) { //Line n5
        //m = new Message(); //Line n6 si se descomenta esta linea si el print es el mismo de happy new year 2 veces por
        //que hace referencia a un nuevo objeto que solo es activo en el loque local y por eso no
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4y
    }
}