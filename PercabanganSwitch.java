import java.util.Scanner; // Import kelas Scanner untuk menerima input dari pengguna

public class PercabanganSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        // Menampilkan daftar motor yang tersedia
        System.out.println("Daftar Motor yang Tersedia:");
        System.out.println("1. Ninja");
        System.out.println("2. CBR");
        System.out.println("3. R15");
        System.out.println("4. GSX");
        System.out.println("5. F1ZR");
        System.out.print("Masukkan pilihan motor (1-5): ");
        int pilihan = scanner.nextInt(); // Membaca pilihan pengguna

        // Menggunakan percabangan switch untuk menentukan motor yang dipilih
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih motor Ninja");
                break;
            case 2:
                System.out.println("Anda memilih motor CBR");
                break;
            case 3:
                System.out.println("Anda memilih motor R15");
                break;
            case 4:
                System.out.println("Anda memilih motor GSX");
                break;
            case 5:
                System.out.println("Anda memilih motor F1ZR");
                break;
            default:
                // Jika pilihan tidak valid, tampilkan pesan kesalahan
                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("Pilihan tidak valid");
                }
        }

        scanner.close(); // Menutup objek Scanner setelah digunakan
    }
}
