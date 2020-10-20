import java.util.concurrent.atomic.AtomicInteger;

public class NoReturn {

//    String str = new String("good");
    String str = "good";
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        NoReturn noReturn = new NoReturn();
//        noReturn.exchange(noReturn.str,noReturn.ch);
        noReturn.exchange(noReturn.str,noReturn.ch);
        System.out.println(noReturn.str + "和");
        System.out.println(noReturn.ch);
    }
    public void exchange(String str,char c[]){
//        this.str = str;
        str = "test ok";
        c[0] = 'g';
    }
}