
package system.of.company;


public class Employee {
    private String name ; 
    private String function ;
    private int numOfWorkingHours ;
    private int  numOfHoursOfAbsence ;
    private double TotalMoneyDeducted ; 
    
   public Employee(String name, String function, int numOfWorkingHours, int numOfHoursOfAbsence) {
        this.name = name;
        this.function = function;
        this.numOfWorkingHours = numOfWorkingHours;
        this.numOfHoursOfAbsence = numOfHoursOfAbsence;
       
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setNumOfWorkingHours(int numOfWorkingHours) {
        this.numOfWorkingHours = numOfWorkingHours;
    }

    public void setNumOfHoursOfAbsence(int numOfHoursOfAbsence) {
        this.numOfHoursOfAbsence = numOfHoursOfAbsence;
    }

    public void setTotalMoneyDeducted(double TotalMoneyDeducted) {
        this.TotalMoneyDeducted = TotalMoneyDeducted;
    }

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public int getNumOfWorkingHours() {
        return numOfWorkingHours;
    }

    public int getNumOfHoursOfAbsence() {
        return numOfHoursOfAbsence;
    }

    public double getTotalMoneyDeducted() {
        return TotalMoneyDeducted;
    }

    
}
