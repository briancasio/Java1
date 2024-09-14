import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ArraysAndMethodsTest {

    @Test
    void main() {
        // Arrange
        Scanner input = new Scanner(System.in);
        String[] args = {"10"};
        int[] expectedArr = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        // Act
        ArraysAndMethods.main(args);

        // Assert
        assertArrayEquals(expectedArr, ArraysAndMethods.arr);
    }

    @Test
    void printArr() {
        // Arrange
        int[] arr = {1, 2, 3, 4, 5};
        String expected = "1 2 3 4 5";

        // Act
        ArraysAndMethods.printArr(arr);

        // Assert
        assertEquals(expected, outContent.toString());
    }

    @Test
    void getAVG() {
        // Arrange
        int[] arr = {10, 20, 30, 40, 50};
        double expected = 300.0;

        // Act
        double actual = ArraysAndMethods.getAVG(arr);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void getGradeByAVG() {
        // Arrange
        double avg = 85.0;
        char expected = 'B';

        // Act
        char actual = ArraysAndMethods.getGradeByAVG(avg);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void findMaxGrade() {
        // Arrange
        int[] arr = {90, 80, 70, 60, 50};
        int expected = 90;

        // Act
        int actual = ArraysAndMethods.findMaxGrade(arr);

        // Assert
        assertEquals(expected, actual);
    }
}