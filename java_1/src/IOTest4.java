import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest4 {


    public static void main(String[] args) {
        Writer writer = null;

        try {
            writer = new FileWriter("D:\\Outputtest22.txt", false);
            String str1 = "안녕하세요";
            String str2 = "벌써 내일이 토요일이라니";
            char[] ch_arr = str2.toCharArray();

            writer.write(str1);
            writer.write(str2);
        } catch (FileNotFoundException fnfe) {
            // FileNotFoundException은 FileReader 생성자에서 파일을 찾을 수 없을때 나오는 예외입니다.
            System.out.println("파일을 찾을 수 없음");
        } catch (IOException ioe) {
            // IOException은 reader에 대한 전반적인 예외입니다.
            System.out.println("파일 입출력 오류");
        } finally {
            System.out.println("프로그램 종료");
            try {
                writer.close();     // 스트림을 종료합니다.
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
