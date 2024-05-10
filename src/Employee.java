public class Employee {

      /*6. Write a Java program to create a class called "Employee" with a name,
         job title, and salary attributes, and methods to calculate and update salary.
        * */

    private String name;
    private String jobTitle;
    private double salary;


    //Constructor
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Getter - - > This method will return the value, it also protects your data and makes your code more secure.
    public String getName(){
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    //Setters = = > sets or updates the value
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //method to calculate the salary
    public void calculateNewSalary(double percetage){
        salary = salary + salary * percetage / 100;
    }
    public void printEmployeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println();
    }


}
