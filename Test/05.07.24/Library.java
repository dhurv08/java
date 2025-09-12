/*Design and implement a simple class hierarchy for a library system using arrays. 
The system should include the following classes: Book, LibraryMember, and Library. 
The implementation should support the functionalities to add a book to the library,
register a new member, borrow a book for a member, and return a book to the library.Requirements::
Book: Represents a book in the library.
Fields: title (String), author (String), isBorrowed (boolean)
Methods: Constructor, getters, and setters.

Library Member: Represents a member of the library.
Fields: name (String), memberId (int)
Methods: Constructor, getters, and setters.

Library: Manages books and members of the library using arrays.
Fields: books (Book[]), members (LibraryMember[]), bookCount (int), memberCount (int)
Methods:
addBook(Book book): Adds a book to the library.
registerMember(LibraryMember member): Registers a new member.
borrowBook(String title, int memberId): Allows a member to borrow a book.
returnBook(String title, int memberId): Allows a member to return a borrowed book.*/

import java.util.Scanner;

public class Library {
    int bookCount = 1000;
    int memberCount = 100;

            //Operations :- 
            public void addBook(Book book){
                if (bookCount < books.length) {
                    books[bookCount++] = book;
                    System.out.println("Book added successfully.");
                } else {
                    System.out.println("Library is full, cannot add more books.");
                }
            }
            public void registerMember(LibraryMember member){
    
            }
            public void borrowBook(String title , String memberID){
    
            }
            public void returnBook(String title , int memberID){
    
            }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Book [] book = new Book[1000];
        // LibraryMember [] members = new LibraryMember[100];


        System.out.println("__Choose The Operation__ ");
        System.out.println("1. Add a book to the library \n2. Register a New Member \n3. Allow a member to Borrow a book \n4. Allow a member to Return a book");
        System.out.print("User Input = ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter the title of book =");
                String title = scanner.next();
                System.out.print("Enter the Author Name = ");
                String author = scanner.next();
                Book book = new Book(title, author, false);
                // library.addBook(book);
            break;

            case 2:
                System.out.print("Enter the member ID = ");
                int memberId = scanner.nextInt();
                System.out.print("Enter name of member = ");
                String memberName = scanner.next();
                LibraryMember member = new LibraryMember(memberName, memberId);

                // library.register(member);
            break;

            case 3:
            System.out.print("Enter name of ID = ");
            int borrowID = scanner.nextInt();
            System.out.print("Enter the borrow Title = ");
            String borrowTitle = scanner.next();
            // library.borrowBook(borrowTitle , borrowID );
            break;

            case 4:
                System.out.print("Enter name of ID = ");
                int returnID = scanner.nextInt();
                System.out.print("Enter the borrow Title = ");
                String returnTitle = scanner.next();
                // library.returnBook(returnTitle , returnID);
            break;

            default:
            System.out.println("Invalid Input");
        }
    }
}
class Book{
    private String title;
    private String author;
    boolean isBorrowed;

    Book(String title , String author , boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
}
class LibraryMember{
    private String name;
    private int memberID;

    LibraryMember(String name , int memberID){
        this.name = name;
        this.memberID = memberID;
    }
    
    public String getName(){
        return name;
    }
    public int memberID(){
        return memberID;
    }
}