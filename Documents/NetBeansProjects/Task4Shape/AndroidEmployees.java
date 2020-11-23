
package system.of.company;


public class AndroidEmployees extends Employee implements Employees{

    private static final int HourPrice = 50 ;
    public static final int numOfHoursOfAbsenceIsAllowed = 10 ;
    private static final int hourlyDiscountRate = 60 ;
     double TotalMoneyDeducted ;
   
    public AndroidEmployees(String name, String function, int numOfWorkingHours, int numOfHoursOfAbsence) {
        super(name, function, numOfWorkingHours, numOfHoursOfAbsence);
        this.setName(name);
        this.setFunction(function);
        this.setNumOfWorkingHours(numOfWorkingHours);
        this.setNumOfHoursOfAbsence(numOfHoursOfAbsence);
        
    }
 
    @Override
    public double getTotalMoneyDeductedFromSalary() {
      
       if(this.getNumOfHoursOfAbsence()> numOfHoursOfAbsenceIsAllowed )
            TotalMoneyDeducted = ((this.getNumOfHoursOfAbsence()) - numOfHoursOfAbsenceIsAllowed)*hourlyDiscountRate ;
       else  TotalMoneyDeducted = 0 ; 
         return TotalMoneyDeducted ;
     }

    @Override
     public double getSalary() {
      
        return (this.getNumOfWorkingHours()*HourPrice) - getTotalMoneyDeductedFromSalary();
       
    }
   

    
}
