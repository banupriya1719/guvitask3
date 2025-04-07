package guvitask3;
//library class is created  
class Library {
    private Book[] books;             //arrays to store books
    private int count;                //to count the number of books stored

    public Library() {                  //default constructor 
        this.books = new Book[5];       //array of books with the max size of 5
        this.count = 0;                 //count starts from 0 initially there is no books to access 
    }
// creating methods for library functions
    //ADDing books to the library
    public void addBook(Book book) { 
        if (count < books.length) {                //count is limited to the array length
            books[count++] = book;                 //count gets incremented
            System.out.println("Book added successfully.");  //upto 5 books can be stored 
        } else {
            System.out.println("Library is full."); //if the limit exceed then it will indicates
        }
    }

    //to Replace the books inn library
    public void replaceBook(int bookID, String newTitle, String newAuthor) {          
        for (int i = 0; i < count; i++) {                      //using for loops to iterate the array upto the count
            if (books[i].getBookID() == bookID) {            //if the user given ID is present 
                books[i] = new Book(bookID, newTitle, newAuthor);   //then he can change the bookID ,title, author name 
                System.out.println("Book replaced successfully.");  //once it has been done it shows
                return;
            }
        }
        System.out.println("Book not found.");              //if ID is not found 
    }
// method to SEARCH BOOKS IN LIBRARY
    public void searchBook(int bookID, String exitTitle, String exitAuthor) {
        for (int i = 0; i < count; i++) {                           //USING FOR LOOP
            if (books[i].getBookID() == bookID) {                   //IF USER SEARCHING ID is present are not
                System.out.println("Yes ,Book is Available in Library"); //if it is present 
                return;
            }
        }
        System.out.println("Book not found.");                 //if it is not present
    }
// to DISPLAY ALL THE BOOKS IN LIBRARY
    public void displayBooks() {
        if (count == 0) {                               //IF THE COUNT IS 
            System.out.println("No books in the library.");     //0 MEANS NO BOOKS 
        } else { 
            for (int i = 0; i < count; i++) {            //ELSE using for loop we can iterate all the books in library
                System.out.println(books[i]);              //let it to be print
            }
        }
    }
}