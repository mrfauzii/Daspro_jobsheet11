import java.util.Arrays;
import java.util.Scanner;
public class Individu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat array untuk setiap cabang olahraga
        String[] badmintonAtlet = new String[5];
        String[] tenisMejaAtlet = new String[5];
        String[] basketAtlet = new String[5];
        String[] bolaVolyAtlet = new String[5];

        // Memasukkan nama atlet untuk setiap cabang olahraga
        inputNamaAtlet(badmintonAtlet, "Badminton", sc);
        inputNamaAtlet(tenisMejaAtlet, "Tennis Meja", sc);
        inputNamaAtlet(basketAtlet, "Basket", sc);
        inputNamaAtlet(bolaVolyAtlet, "Bola Voly", sc);

        // Mengurutkan dan menampilkan nama atlet untuk setiap cabang olahraga secara ascending
        Arrays.sort(badmintonAtlet);
        Arrays.sort(tenisMejaAtlet);
        Arrays.sort(basketAtlet);
        Arrays.sort(bolaVolyAtlet);

        tampilkanAtlet("Badminton", badmintonAtlet);
        tampilkanAtlet("Tennis Meja", tenisMejaAtlet);
        tampilkanAtlet("Basket", basketAtlet);
        tampilkanAtlet("Bola Voly", bolaVolyAtlet);
    }
    // Cara untuk memasukkan nama atlet pada suatu cabang olahraga
    private static void inputNamaAtlet(String[] atletArray, String cabangOlahraga, Scanner scanner) {
        System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga + ":");
        for (int i = 0; i < atletArray.length; i++) {
            System.out.print("Atlet " + (i + 1) + ": ");
            atletArray[i] = scanner.nextLine();
        }
    }
    
    // Cara untuk menampilkan nama atlet pada suatu cabang olahraga
    private static void tampilkanAtlet(String cabangOlahraga, String[] atletArray) {
        System.out.println();
        System.out.println("Daftar Nama Atlet Cabang " + cabangOlahraga + ":");
        for (String atlet : atletArray) {
            System.out.println(atlet);
        }
        System.out.println();
    }
}
