import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Book Information----");
        System.out.print("Title: ");
        String textbookTitle = scanner.nextLine();
        System.out.print("Author: ");
        String textbookAuthor = scanner.nextLine();
        System.out.print("Year: ");
        int textbookYear = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Borrowed: ");
        String textbookSubject = scanner.nextLine();

        TextBook textbook = new TextBook(textbookTitle, textbookAuthor, textbookYear, textbookSubject);

        scanner.nextLine(); 
        System.out.print("Title: ");
        String novelTitle = scanner.nextLine();
        System.out.print("Author: ");
        String novelAuthor = scanner.nextLine();
        System.out.print("Year: ");
        int novelYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Borrowed: ");
        String novelGenre = scanner.nextLine();

        Novel novel = new Novel(novelTitle, novelAuthor, novelYear, novelGenre);

        scanner.nextLine(); 
        System.out.print("Title: ");
        String magazineTitle = scanner.nextLine();
        System.out.print("Author: ");
        String magazineAuthor = scanner.nextLine();
        System.out.print("Year: ");
        int magazineYear = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Borrowed: ");
        String magazineCategory = scanner.nextLine();

        Magazine magazine = new Magazine(magazineTitle, magazineAuthor, magazineYear, magazineCategory);

        scanner.nextLine(); 
        System.out.println("---- Borrowing and Returning Books ----");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook(); 
    }
}