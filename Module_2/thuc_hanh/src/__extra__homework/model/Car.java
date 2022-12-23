package __extra__homework.model;

import __extra__homework.service.iOtoService;

public class Car extends Vehicle {

    public Car(String bangKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bangKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
    }



    enum KieuXe {
        DuLich,
        XeKhach
    }

    public Car() {
    }
    private int soCho;
    private KieuXe kieuXe;

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public KieuXe getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(KieuXe kieuXe) {
        this.kieuXe = kieuXe;
    }
}
