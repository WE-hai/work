public class Main {
    public static void main(String[] args) {
        String s = "630105199806221319";
        String str = s.substring(6,14);
        System.out.println(str);
        System.out.println(s.length());
        String string = "  19980622  ";
        System.out.println(string.trim());
        String s1 = new String(new char[]{'a','b','c','d'});
        System.out.println(s1);
        String s2 = new String("abcd");
        System.out.println(s2);
        System.out.println(s.indexOf("19980622"));
        System.out.println("abcd".equals(s1));
        System.out.println(s2.equals("abcd"));
        System.out.println(s1 == s2);
    }
}
