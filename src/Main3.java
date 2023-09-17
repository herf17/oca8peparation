class PenDrive {
    int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
    String type;
    String make;
    OTG(int capacity, String type) {
        /*INSERT-1*/
        super(capacity);
        this.type = type;
    }
    OTG(String make) {
        /*INSERT-2*/
        super(0);
        this.make = make;
    }
}

public class Main3 {
    public static void main(String[] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}
/*Currently above code causes compilation error.

Which of the options can successfully print 128:TYPE-C on to the console?
Replace INSERT-1 with: super(capacity); this.type = type; Replace INSERT-2 with: super(0);
* */
