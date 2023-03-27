package kategoriuang;

import java.util.Scanner;

public class kategoripengeluaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nominal = { 100_000, 50_000, 20_000, 10_000, 5_000, 2_000, 1_000 };
        int[] jumlah = new int[7];

        System.out.print("Masukkan pengeluaran: ");
        int pengeluaran = input.nextInt();

        for (int i = 0; i < nominal.length; i++) {
            while (pengeluaran >= nominal[i]) {
                pengeluaran -= nominal[i];
                jumlah[i]++;
            }
        }

        System.out.println("Nominal uang yang diperlukan:");
        for (int i = 0; i < nominal.length; i++) {
            if (jumlah[i] > 0) {
                System.out.println(nominal[i] + " x" + jumlah[i] + " lembar");
            }
        }
    }

}
