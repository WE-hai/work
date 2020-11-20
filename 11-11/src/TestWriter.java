import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWriter {
    //F:\work\11-11\a.txt
    public static void main(String[] args) {
        File f = new File("F:\\work\\11-11\\a.txt");
        try {
            //创建文件字符流
            //缓存流必须建立在一个存在的流的基础上
            FileWriter fr = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fr);
            pw.println("abcdefg");  //自动添加换行符
            //强制吧缓存中的数据写入文件，无论缓存是否已满
            pw.flush();
            pw.println("hijklmn");
            pw.flush();
            pw.println("opqrst");
            fr.close();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
