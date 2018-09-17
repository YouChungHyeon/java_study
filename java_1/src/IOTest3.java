import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest3 {

    public static void main(String[] args) {

        OutputStream outputStream = null;


        try {
            outputStream = new FileOutputStream("D:\\Outputtest.txt", false);
            //생성자에 파일의 절대경로를 넣어줍니다.
            //만약에 이미 파일이 존재한다면 두번째 인자값이 true라면 파일 끝에 추가하고 false 라면 파일 내용에 덮어 씁니다.
            byte[] bytes = new byte[3];
            //outputStream에 넣을 바이트배열을 만듭니다.
            for (byte i = 0; i < 3; i++) {
                bytes[i] = (byte) (65 + i);
                //바이트 배열에 65~67 까지 값을 저장합니다 (A~C)
            }
            outputStream.write(bytes);
            //생성된 바이트 배열을 스트림에 넣습니다.
        } catch (FileNotFoundException fnfe) {
            // FileNotFoundException은 FileReader 생성자에서 파일을 찾을 수 없을때 나오는 예외입니다.
            System.out.println("파일을 찾을 수 없음");
        } catch (IOException ioe) {
            // IOException은 reader에 대한 전반적인 예외입니다.
            System.out.println("파일 입출력 오류");
        } finally {
            System.out.println("프로그램 종료");
            try {
                outputStream.close();   // 스트림을 종료합니다.
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
