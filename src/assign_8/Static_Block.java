package assign_8;

public class Static_Block {


    static String Name;
    static String surName;
    static int age;

    // Change the value of static variable in the static initialization block.
    static {
        Name = "Shubham";
        System.out.println(" Firstname " +Name);
    }
    // Initialize the value of static variable in the S.B.
    static {
        surName = "Sharma";
        System.out.println(" Lastname " +surName);
    }
    static {
        age = 23;
        System.out.println(" Age: " + age);
    }
// If you don't assign the value of static variable then it will print default value.
// Here I am assigning any value to the age.
// So it will print default value 'zero' on the console. Zero is the default value of an integer.


    public static void main(String[] args) {

    }
}
