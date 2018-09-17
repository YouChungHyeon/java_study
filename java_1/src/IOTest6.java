import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest6 {

    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            //파일을 연결하는데 FileWriter를 이용하게 됩니다.
            bw = new BufferedWriter(new FileWriter("D:\\bufferdwriterTest.txt"));
            //임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수
            final String line[] = {"첫번째라인", "두번째라인", "세번째 라인"};

            //배열에 들어있는 내용을 파일에 입력
            for(String str: line) {
                bw.write(str);
                bw.newLine();
            }

        } catch (FileNotFoundException fefe) {
            System.out.println("파일을 찾을 수 없음");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("프로그램 종료");
            try {
                bw.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
