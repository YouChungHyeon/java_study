import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest8 {
    public static void main(String[]  args) {
        //InputStreamReader 와 OutputStreamWriter 를 선언합니다.
        InputStreamReader in = null;
        OutputStreamWriter out = null;

        try{
            String path = "D:\\study\\Test.txt";

            in = new InputStreamReader(new FileInputStream(path));
            out = new OutputStreamWriter(System.out);

            int res;

            while((res = in.read()) != -1) {
                out.write((char)res);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            }catch (IOException ioe2) {
                ioe2.printStackTrace();
            }
        }
    }
}
