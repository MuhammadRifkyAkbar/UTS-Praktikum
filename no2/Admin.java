package no2;

import java.util.Scanner;

public class Admin extends Pengguna {

    public Admin(String username) {
        super(username);
    }

    public void addBook(String title) {
        new Book(title);
        System.out.println("Buku Berhasil ditambahkan.");
    }

    public void removeBook(String title) {
        Book[] currentBooks = Book.getAllBooks();
        for (int i = 0; i < currentBooks.length; i++) {
            if (currentBooks[i].getTitle().equals(title)) {
                Book[] newBooks = new Book[currentBooks.length - 1];
                System.arraycopy(currentBooks, 0, newBooks, 0, i);
                System.arraycopy(currentBooks, i + 1, newBooks, i, currentBooks.length - i - 1);
                Book.books = newBooks;
                System.out.println("Buku Berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void manageLibrary() {
        Scanner inputAdmin = new Scanner(System.in);

        System.out.println("Anda login sebagai admin");
        System.out.println("\n1. Tambahkan Buku\n2. Hapus Buku");
        System.out.print("Silakan pilih menu di atas : ");
        int choice = inputAdmin.nextInt();

        if (choice == 1) {
            System.out.print("Masukkan judul buku : ");
            inputAdmin.nextLine(); // Consume the newline character
            String bookTitle = inputAdmin.nextLine();

            addBook(bookTitle);
            displayAllBooks();
        } else if (choice == 2) {
            System.out.print("Masukkan judul buku yang ingin dihapus : ");
            inputAdmin.nextLine(); // Consume the newline character
            String bookTitle = inputAdmin.nextLine();

            removeBook(bookTitle);
            displayAllBooks();
        } else {
            System.out.println("Pilihan tidak tersedia !");
        }

        inputAdmin.close();
    }
}
