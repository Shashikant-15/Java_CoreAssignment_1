package assign_1;

public class Main
{


        public boolean popInTheString(String str1)
        {
            int len = str1.length();
            for (int i = 0; i < len - 2; i++)
            {
                if (str1.charAt(i) == 's' && str1.charAt(i+2) == 's')
                    return true;
            }
            return false;
        }
        public static void main (String[] args)
        {
            Main m= new Main();
            String str =  "Infosys";
            System.out.println("The given string is: "+str);
            System.out.println("Is s?s appear in the given string? "+m.popInTheString(str));
        }
    }

