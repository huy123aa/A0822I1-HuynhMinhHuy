package __extra__homework.model;

public class Vehicle {
    protected String bangKiemSoat;
    protected HangSanXuat hangSanXuat;
    protected int namSanXuat;
    protected String chuSoHuu;

    public Vehicle(String bangKiemSoat, HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bangKiemSoat = bangKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBangKiemSoat() {
        return bangKiemSoat;
    }

    public void setBangKiemSoat(String bangKiemSoat) {
        this.bangKiemSoat = bangKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "bangKiemSoat='" + bangKiemSoat + '\'' +
                ", hangSanXuat=" + hangSanXuat +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
