package assign_3;



public class remove_Specify_Char {

        public static void main(String[] args) {
            String str1 = "abcdefabcdeabcdaaa";
            char re_Char = 'a';
            String result = removeCharacter(str1, re_Char);
            System.out.println("\n original string:");
            System.out.println(str1);
            System.out.println("\n Second string:");
            System.out.println(result);
        }

        public static String removeCharacter(String str1, char re_Char) {
            if (str1 == null || str1.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            char[] chArray = str1.toCharArray();
            for (char c : chArray) {
                if (c != re_Char) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

