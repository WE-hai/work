import java.io.File;

public class Main {

    public static void main(String[] args) {
        double aa = 12.123456;
        System.out.printf("%.2f\n",aa);
        {
            int a = 20;
            Integer a1 = Integer.valueOf(a);
            System.out.println("int"+a+" Integer"+a1);
        }

        {
            Integer a = new Integer(12);
            int a1 = a.intValue();
            System.out.println("Integer"+a+" int"+a1);
        }

        {
            int a = 123;
            String s = String.valueOf(a);
            String s1 = a+"";
            System.out.println("int"+a+" String"+s+" "+"s1");
        }

        {
            String s = "123";
            int a = Integer.parseInt(s);
            System.out.println("String"+s+" int"+a);
        }

        {
            Integer a = new Integer(10);
            String s = Integer.toString(a);
            System.out.println("Integer"+a+" String"+s);
        }

        {
            String s = "234";
            Integer a = Integer.valueOf(s);
            System.out.println("String"+s+" Integer"+ a);
        }
    }
}
