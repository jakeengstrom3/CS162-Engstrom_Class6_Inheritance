/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    protected String name;
    protected double baseSalary;
    protected int yearsOfExperience;
    protected int yearsAtCompany;
    protected int vacationDays;

    /**
     * Parameterless constructor
     */
    public Employee(){
        this("", 0.0, 0, 0);
    }

    /**
     * Parameterless constructor
     *@param name  A variable of type String
     *@param baseSalary A variable of type double
     *@param yearsOfExperience  A variable of type int
     *@param yearsAtCompany  A variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }
    //Add needed getters and setters

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    @Override
    public String toString(){
        return "Name: " + name + "\nBase Salary: " + baseSalary + "\nYears Of Experience: " + yearsOfExperience + "\nYears at Company: " + yearsAtCompany;
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}