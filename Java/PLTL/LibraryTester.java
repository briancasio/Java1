import java.io.IOException;

public class LibraryTester {
    public static void main(String[] args) throws IOException{

        // Create a Library object with the 2D array field
        Library library = new Library(2, 3);

        library.getLibraryAuthorsInfo();;
        System.out.println();
        library.getLibraryBooksInfo();
        System.out.println();
        //library.getLibraryBooksInfo();

        // Read authors and book titles from the libraryInfo.txt file and populate the array
        //library.readLibraryInfoFromFile("libraryInfo.txt");

        // Print the authors and their corresponding book titles
        //System.out.println("Authors and their Books:");
        //for (int i = 0; i < cols; i++) {
            // Print each author and their corresponding book
          //  System.out.println("Author: " + library.getLibraryInfo(0, i) + ", Book: " + library.getLibraryInfo(2, i));
        //}
    }
}
