import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class Main4 {
    char var1;
    /*NO compila esta version porque al predicate se le tiene que asignar tipo*/
    /*
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
        Predicate pr1 = s -> s.length() < 4;
        print(arr, pr1);
    }
    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }*/
    public static void main(String [] args){
        Main4 obj = new Main4();
        System.out.println(">" + obj.var1+" "+null);

        //Period period= Period.of(0,0,0);
        //System.out.println(period);
        //LocalDate date = LocalDate.parse("1980-03-16");
        //System.out.println(date.plusYears(-5));
                /*String [] arr = {"*", "**", "***", "****", "*****", "******"};
                Predicate<String> pr1 = s -> s.length() < 4;
                print(arr, pr1);*/
        }
    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }


}
