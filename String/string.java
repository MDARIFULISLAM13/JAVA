package String;

import java.util.Scanner;

public class string {

    public static void main(String[] args) {
        String a = "Arif";
        String b = "ul";
        String c = " Islma";
        // Add 3 string in java
        String Name = a + b + c;
        System.out.println(Name);

        // at index 0 which char avaiable
        System.out.println(Name.charAt(0));
        // string length
        int len = Name.length();
        System.out.println(len);
        // replace char from string
        String replace_name = Name.replace('i', 'R');
        System.out.println(replace_name);

        // Substring form string
        String Sort_name = Name.substring(0, 4);
        System.out.println(Sort_name);
        
         // input string
        Scanner scn = new Scanner(System.in);
        String new_s = scn.nextLine();
        System.out.println(new_s);

    }
}
