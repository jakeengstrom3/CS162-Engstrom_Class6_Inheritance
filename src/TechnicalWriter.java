public class TechnicalWriter extends  Employee {

    public TechnicalWriter() {
        super();
    }

    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
        if (this.yearsAtCompany <= 1) {
            this.vacationDays = 7;
        } else {
            this.vacationDays = 14;
        }
    }
    @Override
    public String motto(){
        return "You can always edit a bad page. You can't edit a blank page.";
    }
    @Override
    public String toString(){
        return super.toString() + "\n";
    }

}
