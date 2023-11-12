package no1;

// ProgramUtama.java
import java.util.Scanner;

public class ProgramUtama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        System.out.print("Hewan ini bersuara: ");
        hewan.bersuara();

        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
}
