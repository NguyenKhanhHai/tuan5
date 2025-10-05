import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập thông tin sách từ bàn phím
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();
        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();
        // Tạo đối tượng sách
        Book sach = new Book(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        // Hiển thị thông tin sách
        System.out.println("\n--- Thông tin cuốn sách ---");
        sach.hienThiThongTin();
        sc.close();
    }
}