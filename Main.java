

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);

        String hexString = in.nextLine();

        System.out.println(toDecimal(hexString));

    }

    public static long toDecimal(String hexString){

        hexString.toLowerCase();
        hexString = hexString.substring(1);

        long decimal = 0L;

        for(int i = 0; i < hexString.length(); ++i){
            decimal *= 16;
            char hexChar = hexString.charAt(i);
            decimal += (hexChar >= 'a' && hexChar <= 'z') ? hexChar - 'a' + 10 : hexChar - '0';
        }

        return decimal;
    }
}