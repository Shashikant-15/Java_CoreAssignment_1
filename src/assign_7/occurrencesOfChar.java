package assign_7;

public class occurrencesOfChar {

        public static void main(String[] args) {

            String str = "count character in a string";                     // taken input as a sentence to count char

            int totalCount = str.length();                                               // total length 3

            int totalCount_afterRemove = str.replace("t","").length();  // total len after removing

            int count = totalCount - totalCount_afterRemove ;
            System.out.println(" total no. of occurrence of t is: " +count);
        }
    }


