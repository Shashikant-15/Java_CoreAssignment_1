package assign_22;

public class creditCardVallidation {


    // using Luhn algorithm


    static boolean creditCheck (String cardNo)
    {
        int no_of_Digits = cardNo.length();

        int digitSum = 0;
        boolean isSecond = false;
        for (int i = no_of_Digits - 1; i >= 0; i--)
        {

            int digit = cardNo.charAt(i) - '0';

            if (isSecond)
                digit = digit * 2;

            // We add two digits to handle
            // cases that make two digits
            // after doubling
            digitSum += digit / 10;
            digitSum += digit % 10;

            isSecond = !isSecond;
        }
        return (digitSum % 10 == 0);
    }

    // Driver code
    static public void main (String[] args)
    {
        String cardNo = "89927398712";
        if (creditCheck(cardNo))
            System.out.println("Okay : This is a valid card");
        else
            System.out.println("Not okay : This is not a valid card");

    }
}




