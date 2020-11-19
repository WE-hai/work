import java.io.*;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        //初始化File对象
        File f = new File("F:\\work\\11-11\\a.txt");
        System.out.println("当前文件："+f);
        //判断文件是否存在
        System.out.println("判断是否存在："+f.exists());
        //判断是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());
        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());
        //文件长度，前提是文件必须存在
        System.out.println("获取文件的长度："+f.length());
        //文件的最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("文件的最后修改时间："+d);
        //文件重命名
        File f2 = new File("F:\\work\\11-11\\b.txt");
        f.renameTo(f2);
        System.out.println("重命名成功");
        //删除文件
        f.delete();
        System.out.println("将文件删除了");
    }
}
