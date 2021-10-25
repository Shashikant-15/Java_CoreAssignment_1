package assign_4;

import java.util.Scanner;

public class Main {

        public static void main(String[] args)
        {
            String str;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String: ");

            str=sc.nextLine();                                    // reading string from user
            System.out.print("After reverse string is: ");

            for(int l=str.length(); l>0; --l)                     // l is the length of the string
            {
                System.out.print(str.charAt(l-1));               // printing the character at index l-1
            }
        }
    }

