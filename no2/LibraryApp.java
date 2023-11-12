package no2;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Pengguna pengguna;


        new Book("The Outsider");
        new Book("Malin Kundang");
        new Book("Naruto");

        System.out.println("SELAMAT DATANG DI APLIKASI PERPUSTAKAAN ! ");
        System.out.println("==========================================");
        System.out.println("\nSilakan Login !");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.nextLine().toLowerCase();

        if (username.equals("admin123")) {
            pengguna = new Admin(username);
            ((Admin) pengguna).manageLibrary();
        } else {
            pengguna = new User(username);
            ((User) pengguna).displayMenu();
        }

        input.close();
    }
}
