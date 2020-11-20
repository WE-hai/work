import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    //F:\work\11-11\a.txt
    public static void main(String[] args) {
        File f = new File("F:\\work\\11-11\\a.txt");
        try {
            //创建文件字符流
            FileReader fr = new FileReader(f);
            //创建缓存字符流
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine();    //一次读一行
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
