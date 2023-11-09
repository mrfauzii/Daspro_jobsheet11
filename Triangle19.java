import java.util.Scanner;
public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = "); //print pesan untuk meminta input nilai N
        int N = sc.nextInt(); //membaca input N yg dimasukkan
        int i = 0; //inisialisasi variabel i

        while (i <= N) { //memulai loop while yg berjalan selama i kurang dari sama dgn N
            int j = 0;
            while (j < i) { //inner nested loop
                System.out.print("*");
                j++;
            }
            //System.out.println(); // Tambahkan baris baru setelah setiap baris selesai
            i++;
        }
    }
}
