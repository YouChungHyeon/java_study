import java.io.*;
import java.util.Date;

public class IOTest7 {
    public static void main(String[] args){
        //시간 측정을 위한 long형 변수들
        long timer_start_buffered = 0L, timer_end_buffered = 0L;
        long timer_start_normal = 0L, timer_end_normal = 0L;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        InputStream is = null;
        OutputStream os = null;

        try {
            //경로가 길어서 문자열에 따로 저장하였습니다.
            //path_load : 복사 대상의 파일
            //path_save_bos : 파일을 버퍼링을 이용하여 자장할 경로
            //path_save_os : 파일을 일반적인 방법으로 저장할 경로
            String path_load = "D:\\Study\\Test.txt";
            String path_save_bos = "D:\\Study\\BufferedOutputStream.txt";
            String path_save_os = "D:\\Study\\OutputStream.txt";

            //버퍼링 기능이 첨가된 InputStream과 OutputStream
            //경로에는 각각 FileInputStream과 FileOutputStream이 사용됩니다.
            bis = new BufferedInputStream(new FileInputStream(path_load));
            bos = new BufferedOutputStream(new FileOutputStream(path_save_bos));
            //BufferedInputStream 과의 성능테스트를 위한 InputStream과 OutputStream
            is = new FileInputStream(path_load);
            os = new FileOutputStream(path_save_os);

            //시간 측정에 쓰일 것
            Date timer;

            //파일을 하나하나 불러와서 임시적으로 저장할 변수
            int res;

            timer = new Date(); //시간 초기화
            timer_start_buffered = timer.getTime(); //현재 시간을 저장
            //버퍼링 기능을 이용하여 파일을 복사
            while((res = bis.read()) != -1) {
                bos.write(res);
            }

            timer = new Date(); //시간 초기화
            timer_end_buffered = timer.getTime(); //현재 시간을 저장

            timer = new Date();
            timer_start_normal = timer.getTime();
            //일반적인 방법으로 파일을 복사
            while((res = is.read()) != -1) {
                os.write(res);
            }

            timer = new Date();
            timer_end_normal = timer.getTime();


        }catch (IOException ie) {
           ie.printStackTrace();
        }finally {
            System.out.println("프로그램 종료");
            try {
                bis.close();
                bos.close();
                is.close();
                os.close();
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println("Buffered 복사시간 : " + (timer_end_buffered - timer_start_buffered));
            System.out.println("일반 복사 시간 : " + (timer_end_normal - timer_start_normal));
        }
    }
}
