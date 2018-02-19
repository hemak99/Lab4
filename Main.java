import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("Enter a hexadecimal number: ");
        Scanner scnr = new Scanner(System.in);

        String s = scnr.next();

        //git change




        char num = s.charAt(0);

        int value = 0;
        long result = 0;
        long pow = 1;

        if (s.length() > 2) {
            if (s.charAt(1) == 'x'){
                s= s.substring(2);

            }
        }

        int index = s.length() -1;

        s= s.toUpperCase();


        while (index >= 0) {

            num = s.charAt(index);

            if (num >= 'A' && num <= 'F') {
                value = num - 'A' + 10;
            }

            if (num >= '0' && num <= '9') {
                value = num - '0';
            }


            result += value * pow;
            pow = pow * 16;

            index--;

        }


        System.out.print("Your number is " +result + " in decimal");

    }
}

