
package system.of.company;


public class FlutterEmployees  extends Employee implements Employees{
    private static final int HourPrice = 100 ;
    public static final int numOfHoursOfAbsenceIsAllowed = 5 ;
    private static final int hourlyDiscountRate = 120 ;
    double TotalMoneyDeducted  ;
   
    

    public FlutterEmployees(String name , String function, int numOfWorkingHours, int numOfHoursOfAbsence) {
        super(name, function, numOfWorkingHours, numOfHoursOfAbsence);
        this.setName(name);
        this.setFunction(function);
        this.setNumOfWorkingHours(numOfWorkingHours);
        this.setNumOfHoursOfAbsence(numOfHoursOfAbsence);
            }
    
 @Override
    public double getTotalMoneyDeductedFromSalary() {
    if(this.getNumOfHoursOfAbsence()> numOfHoursOfAbsenceIsAllowed )
            TotalMoneyDeducted = (this.getNumOfHoursOfAbsence() - numOfHoursOfAbsenceIsAllowed)*hourlyDiscountRate ;
       else  TotalMoneyDeducted = 0 ; 
        
         return TotalMoneyDeducted ;      
    }

    @Override
     public double getSalary() {
      
        return (this.getNumOfWorkingHours()*HourPrice) - getTotalMoneyDeductedFromSalary();
       
    }

   
    
   
   
   

   
    
}
