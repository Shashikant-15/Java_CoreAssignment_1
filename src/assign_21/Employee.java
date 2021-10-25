package assign_21;


import java.util.*;

public class Employee {

    private String Id;
    private String Name;
    private String designation;

    Employee() {                         // default constructor

    }

    public Employee(String Id, String name, String designation ) {
        this.Id = Id;
        this.Name = name;
        this.designation = designation;
    }


    public String getId () {
        return Id;
    }
    public void setId (String id){
        Id = id;
    }
    public String getName () {
        return Name;
    }
    public void setName (String name){
        Name = name;
    }
    public String getDesignation () {
        return designation;
    }
    public void setDesignation(String designation){
        designation = designation;
    }



    public String toString()
    {
        return this.Id+"\t"+this.Name+"\t\t"+this.designation+"\t\t\t";
    }



    public static  void main(String[] args)
    {

        try {

            Map< String, List<Employee>> m=new HashMap< String, List<Employee> >();
            List<Employee> ListForFinance=new ArrayList<Employee>();
            Scanner scn1=new Scanner(System.in);
            String Id;
            String Name;
            String designation;


            while(true)
            {
                System.out.print("\nThe Choices:\n1>add\n2>modification\n3>remove\n4>display\n\n");
                System.out.println("Enter the choice: ");
                System.out.println("To quit type -1");
                int num=scn1.nextInt();
                if(num == -1)
                {
                    break;
                }

                switch(num)
                {
                    case 1:
                    {
                        System.out.print("\n Id: ");
                        Id=scn1.next();

                        System.out.print("\n Name: ");
                        Name=scn1.next();

                        System.out.print("\n Designation: " );
                        designation=scn1.next();


                       Employee employee1 = new Employee();
                       employee1.setId(Id);
                       employee1.setName(Name);
                       employee1.setDesignation(designation);

                        System.out.println(" \n Id is :" + employee1.getId());
                        System.out.println(" \n Name : " + employee1.getName());
                        System.out.println(" \n Designation:" + employee1.getDesignation());

                        ListForFinance.add(employee1);
                        m.put(designation, ListForFinance);

                        break;
                    }

                    case 2:
                    {
                        System.out.println("Type Designation to be modified");
                        designation=scn1.next();
                        System.out.println("Modification values");
                        System.out.print("\n Id: ");
                        Id=scn1.next();
                        System.out.print("\n Name: ");
                        Name=scn1.next();

                        Set<String> s=m.keySet();
                        Iterator<String> i=s.iterator();

                        Employee employee1 = new Employee();

                        ListForFinance.add(employee1);
                        m.put(designation, ListForFinance);

                        while(i.hasNext())
                        {
                            System.out.println(i.next());
                        }

                        break;
                    }



                    case 3:
                    {
                        System.out.println("=========================================================");
                        System.out.println("ID"+"\t"+"NAME"+"\t\t"+"DESIGNATION");
                        System.out.println("=========================================================");
                        Set<String> s=m.keySet();

                        for (String dept : s) {
                            List<Employee> employees = m.get(dept);
                            for (Employee employee : employees) {
                                System.out.print("\n" + employee + "\n\n");
                            }
                        }
                        break;
                    }
                    default:

                        System.out.println("=============================================================");
                        System.out.println("Wrong key Pressed,please enter the correct key \n");
                        System.out.println("Try again...!!!");
                        System.out.println("=============================================================");

                }
            }
        }

        catch(Exception e) {
            System.out.println("NOTE: \n" + "Please enter specified key format..!!!");
            System.out.println("======================================");
            System.out.println("Now you are Signing out");
            System.out.println("Thank You,Login Again");
            System.out.println("======================================");

        }


    }
}





