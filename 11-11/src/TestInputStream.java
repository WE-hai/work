import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
    //F:\work\11-11\a.txt
    public static void main(String[] args) {
        try {
            //准备文件
            File f = new File("F:\\work\\11-11\\a.txt");
            //创建基于文件的输入字节流
            FileInputStream fis = new FileInputStream(f);
            //创建字节数组，其长度就是文件长度
            byte[] all = new byte[(int)f.length()];
            //以字节流形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            //每次使用完流，都应该进行关闭
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
