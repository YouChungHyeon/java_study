import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOTest2 {
    public static void main(String[] args) {
        Reader reader = null;

        try {
            reader = new FileReader("D:\\TestText.txt");
            //생성자에 파일의 절대경로를 넣어줍니다.
            char[] ch_buffer = new char[20];
            //reader 로 읽어들일 문자열을 저장할 배열을 생성
            int readerCounter = reader.read(ch_buffer, 0, ch_buffer.length);
            //ch_buffer 배열에 처음부터(0) ch_buffer의 길이(length)까지의 내용을 저장하고 그 길이를 readerCounter 에 저장
            String s = new String(ch_buffer);
            System.out.println(s);
        } catch (FileNotFoundException fnfe) {
            // FileNotFoundException은 FileReader 생성자에서 파일을 찾을 수 없을때 나오는 예외입니다.
            System.out.println("파일을 찾을 수 없음");
        } catch (IOException ioe) {
            // IOException은 reader에 대한 전반적인 예외입니다.
            System.out.println("파일 입출력 오류");
        } finally {
            System.out.println("프로그램 종료");
            try {
                reader.close();            // 스트림을 종료합니다.
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
