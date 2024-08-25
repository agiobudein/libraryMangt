import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BookServiceInterface bookServiceInterface = new BookServiceImpl();

        do {
            System.out.println("Welcome to Book Management System!");
            System.out.println("1. Add Book\n "+
                    "2. Show all Books\n" +
                    "3. Show Available Books\n "+
                    "4. Borrow Book\n "+
                    "5. Return Book\n" +
                    "6. Exit\n");

            System.out.println("Enter your choice!");
            int output = input.nextInt();

            switch (output) {
                case 1:
                    bookServiceInterface.addBook();
                    break;
                case 2:
                    bookServiceInterface.showAllBooks();
                    break;
                case 3:
                    bookServiceInterface.showAllAvailableBooks();
                    break;
                case 4:
                    bookServiceInterface.borrowBook();
                    break;
                case 5:
                    bookServiceInterface.returnBook();
                    break;
            }
        }while (){

        }
    }
}
