package assign_8;



        // A java program to demonstrate use of
        // static keyword with methods and variables

public class Student {

        String name;
        static String lastName;                     // static variable
        int age;

        // static counter to set unique roll no

        static int counter = 100;

        public Student(String name)
        {
            this.name = name;

            this.age = setRollNo();
        }

        // getting unique rollNo
        // through static variable(counter)
        static int setRollNo()
        {
            counter++;
            return counter;
        }

        // static method
        static void setLastName(){
            lastName = "Cameron";
        }

        // instance method
        void getStudentInfo()
        {
            System.out.println("FirstName : " + this.name);
            System.out.println("lastName : " + lastName);     // accessing static variable
            System.out.println(" age : " + this.age);
        }


        //Driver class

        public static void main(String[] args)
        {
            // calling static method
            // without instantiating Student class

            Student.setLastName();
            Student s1 = new Student("Alex");
            Student s2 = new Student("Lucy");

            s1.getStudentInfo();
            s2.getStudentInfo();

        }
    }


