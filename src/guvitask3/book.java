package guvitask3;
//book class is created
class Book {
    private int bookID;           //Unique identifier for BOOK
    private String title;          //TITLE of the book
    private String author;              //name of the Author
    private boolean isAvailable;        // to check if the Book is available to take

    public Book(int bookID, String title, String author) {   // parameterized constructor 
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;              // by default the Book is available 
    }
// getter and setter methods 
    // getter to access the private attributes 
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
// setter to update the status of books are available or not
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    //formatted string show the book object
    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}



