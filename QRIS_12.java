import java.util.Scanner;
public class QRIS_12 { 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float diskon = 0;
    float harga = 0;
    float total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl (14000)");
        System.out.println("2. Ice Tea (3000)");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea) (15000)");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");

        int pilihan_menu = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Apakah punya member (y/n) ? ");
        String member = sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Apakah Menggunakan QRIS (y/n) ?");
        String pembayaran = sc.nextLine();

    if (member.equalsIgnoreCase("y")) { //menggunakan equalsignorecas untuk membandingkan string
        diskon = 0.10f;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
            
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
       if (pembayaran.equalsIgnoreCase("y")) {
        harga -= 1000;
        System.out.println("Potongan QRIS = 1000");
       }
            System.out.println("=============================================");
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar anda setelah diskon = " + total_bayar);
        
    }
    else if (member.equalsIgnoreCase("n")) {
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
       if (pembayaran.equalsIgnoreCase("y")) {
        harga -= 1000;
        System.out.println("Potongan QRIS = 1000");
       }
        System.out.println("-----------------------------------");
        total_bayar = harga - (harga * diskon);
        System.out.println(("Total bayar anda adalah = " + total_bayar));

    } else {
        System.out.println("Member tidak valid");
    }
    }
}