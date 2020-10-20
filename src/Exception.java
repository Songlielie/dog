import java.util.Scanner;

/**
 * @author Song
 * @date :2018/5/15
 * Time:16:10
 */
public class Exception {
    public static void main(String args[]) {

        try {
            int a[] = new int[2];
            System.out.println("Access element three:" + a[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw:" + e);
        }
        System.out.println("测试抛出异常后是否继续执行！");
    }
}
