package assign_16;

import java.util.HashMap;
import java.util.Map;

public class Object_Clonning {

        public static class Employee implements Cloneable {

            private int id;
            private String name;
            private Map<String, String> props;


            public Employee(int id, String name, String empDestination) {

            }

             Employee() {         // Default constructor

            }

            public int getId() { return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() { return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Map<String, String> getProps() {
                return props;
            }

            public void setProps(Map<String, String> p) {
                this.props = p;
            }

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

        }

        public static void main(String[] args) throws CloneNotSupportedException {

            Employee emp = new Employee();

            emp.setId(1);
            emp.setName("Praveen");

            System.out.println(" ID :" + emp.getId());

            Map<String, String> props = new HashMap<>();
            props.put("salary", "25000");
            props.put("city", "Noida");
            emp.setProps(props);

            Employee clonedEmp = (Employee) emp.clone();


            // Check whether the emp and clonedEmp attributes are same or different
            System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));

            System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));


            // Let's see the effect of using default cloning
            // change emp props

            emp.getProps().put("title", "Developer");
            emp.getProps().put("city", "New Delhi");
            System.out.println("clonedEmp props:" + clonedEmp.getProps());


            // change emp name
            emp.setName("new");
            System.out.println("clonedEmp name:" + clonedEmp.getName());

        }

    }


