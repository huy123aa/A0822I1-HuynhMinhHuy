package __extra__homework.model;

public class Truck extends Vehicle{
    public Truck(String bangKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        super(bangKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
    }

    public Truck() {
    }
    protected int trongTai;

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
