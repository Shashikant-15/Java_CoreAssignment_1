package assign_2;

import java.util.Arrays;

public class Binary_Array_sort {


        public static void sortBinaryNumber(int[] b_Num)
        {
            int c = 0;

            for (int i = 0; i < b_Num.length; i++)
            {
                if (b_Num[i] == 0) {
                    b_Num[c++] = 0;
                }
            }

            for (int i = c; i < b_Num.length; i++) {
                b_Num[c++] = 1;
            }
        }

        public static void main (String[] args)
        {
            int[] b_Num = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
            System.out.println("Initial array : "+ Arrays.toString(b_Num));
            sortBinaryNumber(b_Num);
            System.out.println("After sorting: "+Arrays.toString(b_Num));

        }
    }

