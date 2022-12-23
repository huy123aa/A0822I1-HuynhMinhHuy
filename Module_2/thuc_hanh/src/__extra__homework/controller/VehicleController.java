package __extra__homework.controller;

import java.util.Scanner;

public class VehicleController {
    public static void displayVehicleMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println(
                    "Chương trình quản lý phương tiện giao thông"+
                            "\n\tChọn chức năng: "+
                            "\n\t1. Thêm mới phương tiện."+
                            "\n\t2. Hiển thị phương tiện."+
                            "\n\t3. Xóa phương tiện."+
                            "\n\t4. Tìm kiếm theo biển kiểm soát."+
                            "\n\t5. Thoát"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 ->{
                    boolean flagCase1 = true;
                    do{
                        System.out.println(
                                "Thêm mới phương tiện"+
                                        "\n\t1. Thêm xe tải."+
                                        "\n\t2. Thêm ô tô."+
                                        "\n\t3. Thêm xe máy"+
                                        "\n\t4. Thoát."
                        );
                        int chooseCase1 = Integer.parseInt(scanner.nextLine());
                        switch (chooseCase1) {
                            case 1 -> {
                            }
                            default -> {
                                flagCase1 = false;
                                break;
                            }
                        }
                    }while (flagCase1);
                }
                case 2 ->{

                }
                case 3 ->{

                }
                case 4 ->{

                }
                case 5 ->{

                }
            }
        }while(flag);
    }
}
