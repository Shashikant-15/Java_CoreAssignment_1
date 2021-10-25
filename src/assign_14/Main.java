package assign_14;


// For  ClassNotFoundException

public class Main {


        public static void main(String[] args) {
            try {
                Class.forName("https://wordpress.com/post/blog.knoldus.com/106514");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }


