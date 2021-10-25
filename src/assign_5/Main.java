package assign_5;

import java.util.Scanner;

public class Main {


        // Method to find factorial of the given number

        static int factorial(int num)
        {
            if(num == 0)
                return 1;
            int i = num, factorial = 1;

            while (num / i != num) {
                factorial = factorial * i;
                i--;
            }
            return factorial;
        }

        // Driver method

        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);                           //System.in is a standard input stream
            System.out.print("Enter a number to check their factorial- ");
            int num = sc.nextInt();
            System.out.println(
                    "Factorial of " + num
                            + " is " + factorial(num));
        }
    }


