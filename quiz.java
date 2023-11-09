import java.util.Scanner;
import java.util.Random;
public class quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        char menu='y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10):");
                int answer = sc.nextInt();
                sc.nextLine();
                success=(answer==number);
                if (answer < number) {
                    System.out.println("Lebih besar! Coba lagi.");
                } else if (answer > number) {
                    System.out.println("Lebih kecil! Coba lagi.");
                } else {
                    System.out.println("Selamat! Tebakan benar.");
                    success = true;
                }
            }while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)");
            menu = sc.nextLine().charAt(0);

        }while(menu=='y' || menu=='Y');
    }    
}
