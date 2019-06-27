import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number a,b: ");
            int devidend = scanner.nextInt();
            int divisor = scanner.nextInt();
            int result = devidend / divisor;
            System.out.println("Result= " + result);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");

        } finally {
            System.out.println("Finish");
        }


    }
}
