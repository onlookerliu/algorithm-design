import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actualDate = sc.nextLine();
        String expectedDate = sc.nextLine();
        sc.close();
        int fine = 0;
        String[] dateDetail = actualDate.split(" ");
        String[] eDetail = expectedDate.split(" ");
        
        int aDate = Integer.parseInt(dateDetail[0]);
        int aMonth = Integer.parseInt(dateDetail[1]);
        int aYear = Integer.parseInt(dateDetail[2]);

        int eDate = Integer.parseInt(eDetail[0]);
        int eMonth = Integer.parseInt(eDetail[1]);
        int eYear = Integer.parseInt(eDetail[2]);
        
        if (aYear > eYear) {
            fine = 10000;
        } else if (aYear == eYear && aMonth > eMonth) {
            fine = 500 * (aMonth - eMonth);
        } else if (aYear == eYear && aMonth == eMonth && aDate > eDate) {
            fine = 15 * (aDate - eDate);
        }
        System.out.println(fine);
    }
}