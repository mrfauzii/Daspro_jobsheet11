public class Individu1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Cetak spasi untuk bagian kosong di sebelah kiri
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int Number = 1;  // Inisialisasi nilai awal angka yang akan dicetak

            // Cetak angka untuk pola angka
            for (int j = 0; j <= i; j++) {
                System.out.print(Number);
                Number++;  // Tingkatkan nilai untuk mencetak angka berikutnya
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris selesai
        }
    }
}

