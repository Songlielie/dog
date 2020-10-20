/**
 * @author Song
 * @date :2018/3/27
 * Time:8:41
 */
public class Construct extends Object {
    private int id;

    public Construct(int id) {
        this.id = id;
        System.out.println("Cake Object\t" + id + "\tis created.");
    }

    @Override
    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object\t" + id + "\tid disposed");
    }
}
