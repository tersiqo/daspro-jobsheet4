import java.util.Scanner;

public class umur22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan input angka");
            scanner.next();
        }
        int umur = scanner.nextInt();

        if (umur < 0) {
            System.out.println("Masukkan input angka yang positif");
        } else {
            if (umur <= 12) {
                System.out.println("---------------------------------");
                System.out.println("Anda termasuk dalam kategori Anak");
            } else if (umur <= 19) {
                System.out.println("---------------------------------");
                System.out.println("Anda termasuk dalam kategori Remaja");
            } else if (umur <= 64) {
                System.out.println("---------------------------------");
                System.out.println("Anda termasuk dalam kategori Dewasa");
            } else {
                System.out.println("---------------------------------");
                System.out.println("Anda termasuk dalam kategori Lansia");
            }
        }
    }
}