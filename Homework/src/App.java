import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số ID Dev: ");
        int IDDev = Integer.valueOf(sc.nextLine());

        System.out.println("Nhập tên Dev: ");
        String tenDev = sc.nextLine();

        System.out.println("Nhập tuổi Dev: ");
        int tuoiDev = Integer.valueOf(sc.nextLine());

        System.out.println("Nhập SDT Dev: ");
        String sdtDev = sc.nextLine();

        System.out.println("Nhập email Dev: ");
        String emailDev = sc.nextLine();

        System.out.println("Nhập lương cứng Dev: ");
        int salaryDev = sc.nextInt();

        System.out.println("Nhập giờ overtime: ");
        int overtimeDev = sc.nextInt();

        // Phân cách

        System.out.println("Nhập số ID Tester: ");
        int IDtester = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập tên Tester: ");
        String tenTester = sc.nextLine();

        System.out.println("Nhập tuổi Tester: ");
        int tuoiTester = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập SDT Tester: ");
        String sdtTester = sc.nextLine();

        System.out.println("Nhập email Tester: ");
        String emailTester = sc.nextLine();

        System.out.println("Nhập lương cứng Tester: ");
        int salaryTester = sc.nextInt();

        System.out.println("Nhập số lỗi phát hiện được: ");
        int bugfoundTester = sc.nextInt();

        Developer developer = new Developer(IDDev, tenDev, tuoiDev, sdtDev, emailDev, salaryDev, overtimeDev);
        developer.setOvertime(overtimeDev);

        Tester tester = new Tester(IDtester, tenTester, tuoiTester, sdtTester, emailTester, salaryTester,
                bugfoundTester);
        tester.setBugfound(bugfoundTester);

        System.out.printf("\n%3s %15s %15s %12s %16s %16s %16s %16s\n", "ID Dev", "Ten Dev", "Tuoi", "SDT", "Email",
                "Luong cung", "Overtime", "Tong thu nhap");
        developer.display();
        System.out.printf("\n%3.6s %15.6s %15s %12s %16s %16s %16s %16s\n", "ID Tester", "Ten Tester", "Tuoi", "SDT", "Email",
                "Luong cung", "So loi phat hien", "Tong thu nhap");
        tester.display();

        sc.close();
    }
}
