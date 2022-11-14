package _01_introduction_java.practice.display_system_time;

import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date(); //Lấy ra thời gian hiện tại
        System.out.println("Bây giờ là: "+now);
    }
}
