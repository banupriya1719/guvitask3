package guvitask3;
import java.util.Scanner;
// BookManagementSystem as class
public class BookManagementSystem {
	
	//main function has been created 
    public static void main(String[] args) {
        Library library = new Library();           // for library class an object has been created 
        Scanner scanner = new Scanner(System.in);    // scanner to get input from the user 
        while (true) {                           // using while loop
        	System.out.println("=============================");
            System.out.println("Library Management System");     // user options has been created 
            System.out.println("=============================");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");                   
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.println("=============================");
            System.out.println("Enter your choice: ");               // 5 options are there 
            System.out.println("=============================");
            int choice = scanner.nextInt();                      
            switch (choice) {                   //using switch case we doing a chosen operations 
                    // ADD BOOKS
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookID, title, author));
                    break;
                    // REPLACE BOOKS
                case 2:
                    System.out.print("Enter Book ID to replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    library.replaceBook(replaceID, newTitle, newAuthor);
                    break;
                    //SEARCH BOOK
                case 3:
                    System.out.print("Enter Book ID to SEARCH: ");
                    int searchID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String exitTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String exitAuthor = scanner.nextLine();
                    library.searchBook(searchID, exitTitle, exitAuthor);
                    break;
                    // DISPLAY ALL BOOKS IN LIBRARY
                case 4:
                    library.displayBooks();
                    break;
                    // EXITS
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
  	