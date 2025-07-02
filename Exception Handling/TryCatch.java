import java.io.*;

public class TryCatch {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            // 1) ArithmeticException (divide by zero)
            int result = 42 / 0;

            // 2) ArrayIndexOutOfBoundsException
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);

            // 3) NullPointerException
            String text = null;
            System.out.println(text.length());

            // 4) FileNotFoundException (checked)
            fis = new FileInputStream("missing.txt");

        } catch (ArithmeticException e) {
            System.err.println("Math error: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Bad array index: " + e);

        } catch (NullPointerException e) {
            System.err.println("Null reference: " + e);

        } catch (FileNotFoundException e) {
            System.err.println("File issue: " + e);

        } finally {
         System.out.println("finally: cleaning up resources...");

            try {
                if (fis != null) fis.close();
            } catch (IOException ioe) {
                System.err.println("Could not close file: " + ioe);
            }
            System.out.println("cleanup done.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
