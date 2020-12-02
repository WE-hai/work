public class Test {
    public static void main(String[] args) {
        String s = "123";
        Integer a = new Integer(2);
        int b = 3;
        System.out.println("包装类 -> 基本数据类型："+a.intValue());
        System.out.println("基本数据类型 -> 包装类："+Integer.valueOf(b));
        System.out.println("字符串 -> 基本数据类型："+Integer.parseInt(s));
        System.out.println("基本数据类型 -> 字符串:"+String.valueOf(b));
        System.out.println("包装类 -> 字符串："+a.toString());
        System.out.println("字符串 -> 包装类："+Integer.valueOf(s));
    }
}
