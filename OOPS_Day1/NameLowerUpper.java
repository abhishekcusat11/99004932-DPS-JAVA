
import java.util.Scanner;

public class NameLowerUpper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fname, lname, fullName;
        System.out.println("Enter first-name:");
        fname = sc.next();
        System.out.println("Enter second-name:");
        lname = sc.next();

        fname = fname.toLowerCase();
        fname = fname.substring(0, 1).toUpperCase() + fname.substring(1);
        lname = lname.toUpperCase();
        fullName = fname + " " + lname;
        System.out.println(fullName);
        sc.close();

    }

}
