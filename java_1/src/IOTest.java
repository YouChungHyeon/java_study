import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\TestText.txt"); //생성자에 파일의 절대 경로를 넣어줍니다.`1
            while(inputStream.available() > 0) {
                //available 은 읽을 수 있는 바이트 수를 반환합니다. 만약 읽을 수 있는 바이트 수가 없다면 0을 반환합니다.
                byte[] bytes = new byte[inputStream.available()]; //inputstream은 바이트 단위이기 때문에 바이트 배열로 생성합니다.
                int res = inputStream.read(bytes);
                //read 메소드는 매개변수의 크기만큼 데이터를 읽어서 반환합니다.
                //이때 파일의 끝에 도달하면 -1을 반환합니다.
                if(res == -1) {
                    //파일의 끝에 도달하여 -1에 도달하면 while문을 탈출합니다.
                    break;
                }
                String s = new String(bytes);
                //파일을 읽어서 나온 데이터를 String으로 만듭니다.
                System.out.println(s);
            }
        } catch (FileNotFoundException fnfe) {
            // FileNotFoundException은 FileInputStream 생성자에서 파일을 찾을 수 없을때 나오는 예외입니다.
            System.out.println("파일을 찾을 수 없습니다. ");
            fnfe.printStackTrace();

        } catch (IOException ioe) {
            // IOException은 inputStream에 대한 전반적인 예외입니다.
            System.out.println("파일 입출력 오류!");
            ioe.printStackTrace();
        }finally {
            System.out.println("프로그램 종료");
        }
    }
}
