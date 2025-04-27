public class KhachHang {
    //Biến miêu tả
    String TenKH;
    String MaKH;
    //Date NgaySinh;
    String Sodienthoai;
    String Diachi;
    String Email;


    //Phương thức hoat động đối tượng sản phẩm
    public String HienThiKhachHang(String MaKH){
        return TenKH;
    }
    public KhachHang(String TenKH, String MaKH, String Sodienthoai, String Diachi, String Email){
        this.TenKH = TenKH;
        this.MaKH = MaKH;
        this.Sodienthoai = Sodienthoai;
        this.Diachi = Diachi;
        this.Email = Email;
    }
}
