import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Library{

private String[][] libraryInfo;

    public Library(int rows, int cols) throws IOException{

        Scanner input = new Scanner(new File("BookShelf.txt"));

            libraryInfo = new String[rows][cols];
            for (int i = 0; i < libraryInfo.length; i++) {
                for (int j = 0; j < libraryInfo[i].length; j++) {
                    if (input.hasNext()) {
                        libraryInfo[i][j] = input.next();
                }
            }
        }
    }



    public void getLibraryAuthorsInfo(){
    for (int i = 0; i < libraryInfo[0].length; i++) {
        System.out.print(libraryInfo[0][i] + " ");
    }
    
    }

        public void getLibraryBooksInfo(){
            for (int i = 0; i < libraryInfo.length; i++) {
                for (int j = 1; j < libraryInfo[i].length; j++) { 
                    System.out.print(libraryInfo[i][j] + " ");
                }
    }
}

}




