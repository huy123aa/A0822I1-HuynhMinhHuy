package __extra__homework.model;

public class Motorbike extends Vehicle{
    public Motorbike(String bangKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bangKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
    }

    public Motorbike() {
    }
    private int congSuat;

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
