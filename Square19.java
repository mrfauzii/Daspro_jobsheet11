import java.util.Scanner;
public class Square19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N ="); //pesan untuk memasukan nilai N
        int N =sc.nextInt(); //membaca input yg dimasukkan dan disimpan di variabel N
        
        for(int iOuter = 1; iOuter <= N; iOuter++) { //perulangan for baris, i=1 inisialisasi, i<=N sebagai kondisi, i++ increment
            for (int j = 1; j <= N; j++) { // perulangan kedua untuk kolom
                System.out.print("*"); //mencetak * setiap loop dijalankan
            }
            System.out.println(); //membuat baris baru setiap perulangan
        }
    }
}