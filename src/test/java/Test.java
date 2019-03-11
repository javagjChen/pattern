import com.cgj.pattern.singleton.enumsingleton.EnumSingleton;

public class Test {
    public static void main(String[] args) {
        EnumSingleton e = EnumSingleton.INSTANCE;
        EnumSingleton e1 = EnumSingleton.getInstance();
        e.fun1();
        e1.fun1();
        System.out.println(e == e1);
    }
}
