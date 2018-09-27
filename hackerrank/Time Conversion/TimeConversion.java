import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String start = input.substring(0, 2);
        String end = input.substring(input.length() - 2);
        if (end.equals("PM") && !start.equals("12")) {
            sart = Integer.parseInt(start) + 12 + "";
            if (start.equals("24")) {
                start = "00";
            }
        }

        if (end.equals("AM") && start.equals("12")) {
            start = "00";
        }
        System.out.println(start + input.substring(2, input.length() - 2));
    }
}