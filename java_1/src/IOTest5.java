import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest5 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            //파일을 연결하는데 FIleReader를 이용하게 됩니다.
            br = new BufferedReader(new FileReader("D:\\TestText.txt"));
            //임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수
            String line;

            //파일의 끝에 도달할때까지 한 문장씩 line 에 저장하여 출렵합니다.
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("파일 입출력 오류!!");

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
