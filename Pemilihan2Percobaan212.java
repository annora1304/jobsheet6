import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float diskon = 0;
        float harga = 0;
        float total_bayar; 

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl (Harga: 14.000)");
        System.out.println("2. Ice Tea (Harga: 3.000)");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea) (Harga: 15.000)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");

        int pilihan_menu = input.nextInt();  
        input.nextLine();  
        System.out.print("Apakah punya member (y/n) = ");
        String member = input.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10f;
            System.out.println("Besar diskon = 10%");
        }

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
        
    }
}
