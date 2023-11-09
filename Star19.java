import java.util.Scanner;
public class Star19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N ="); //pesan untuk memasukan nilai N
        int N =sc.nextInt(); //membaca input yg dimasukkan dan disimpan di variabel N
        
        for(int i=1; i<= N; i++) { //perulangan for baris, i=1 inisialisasi, i<=N sebagai kondisi, i++ increment
            System.out.println(); //membuat baris baru setiap perulangan
        }
    }
}