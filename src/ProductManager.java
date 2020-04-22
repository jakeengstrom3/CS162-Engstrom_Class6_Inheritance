public class ProductManager extends Employee {
    int stock;

    public ProductManager(){
        super();
    }

    public ProductManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary * 2, yearsOfExperience, yearsAtCompany);
        this.stock = 100 * yearsAtCompany;
        if(yearsAtCompany < 2) this.vacationDays = 21;
        else this.vacationDays = 28;
    }
    @Override
    public String motto(){
        return "There is nothing so useless as doing efficiently that which should not be done at all";
    }
    @Override
    public String toString(){
        return super.toString() + "\nStock Options: " + stock + "\n";
    }
}
