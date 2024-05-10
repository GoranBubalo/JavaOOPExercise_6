public class Main {

    public static void main(String[] args) {
        /*6. Write a Java program to create a class called "Employee" with a name,
         job title, and salary attributes, and methods to calculate and update salary.
        * */

        Employee employee1 = new Employee("Jon","Programmer", 1200);
        Employee employee2 = new Employee("Ivan","Digital Marketing" , 1100);
        System.out.println("\nEmployee Details: ");
        employee1.printEmployeeDetails();;
        employee2.printEmployeeDetails();

        System.out.println("Employees new Salary: \n");


        employee1.calculateNewSalary(20);
        employee2.calculateNewSalary(20);
        System.out.println("Jon salary has risen for 20%");
        employee1.printEmployeeDetails();
        System.out.println("Ivan salary has risen for 20%");
        employee2.printEmployeeDetails();



    }
}