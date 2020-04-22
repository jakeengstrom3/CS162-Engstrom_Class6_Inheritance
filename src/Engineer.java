public class Engineer extends Employee{
    private int signOnBonus;
    public Engineer() {
        super();
    }

    public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary * 1.5, yearsOfExperience, yearsAtCompany);
        if(this.yearsAtCompany < 1){this.vacationDays = 7;}
        else if(this.yearsAtCompany < 2){this.vacationDays = 14;}
        else{this.vacationDays = 21;}
        if(this.yearsOfExperience < 5){this.signOnBonus = 5000;}
        else{this.signOnBonus = 10000;}
    }
    @Override
    public String motto(){
        return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be";
    }
    @Override
    public String toString(){
        return super.toString() + "\nSign on Bonus: " + this.signOnBonus + "\n";
    }
}
