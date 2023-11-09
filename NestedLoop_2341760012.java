import java.util.Scanner;
public class NestedLoop_2341760012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[][] temps = new Double[5][7]; //array 2 dimensi untuk 5 kota dan selama 7 hari

        for (int i = 0; i < temps.length; i++) { //loop pertama untuk mengakses kota
            System.out.println("Kota ke-" + i); 
            for (int j = 0; j < temps[0].length; j++) {  //loop kedua untuk mengakses hari tiap kota
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = sc.nextDouble(); //menginput suhu setiap hari pada setiap kota
            } 
            System.out.println();

        } //menampilkan data suhu menggunakan foreach
        for (int i = 0; i < temps.length; i++) {  
            System.out.print("Kota ke-" + (i + 1) + ": "); //untuk mengakses kota
            for (Double suhu : temps[i]) { 
                System.out.print(suhu + " "); //menampilkan suhu tiap hari di setiap kota
            } 
            // Menghitung dan Menampilkan Rata-rata
            double rataRataKota = hitungRataRata(temps[i]);
            System.out.println("\nRata-rata kota ke-" + (i + 1) + ": " + rataRataKota);
        }              
    }
    private static double hitungRataRata(Double[] temps) { //menerima array suhu untuk satu kota dan mengembalikan nilai rata-ratanya
        int total = 0;
        for (Double nilai : temps) {
            total += nilai;
        }
        return (double) total / temps.length;
    }
}
