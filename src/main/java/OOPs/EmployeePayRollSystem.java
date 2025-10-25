import java.util.ArrayList; 
import java.util.List; 
abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    abstract double calculateSalary();
    
    @Override
    public String toString(){
        return "Employee Name="+name+ " ,id="+id+" , Salary="+calculateSalary();
    }
}
class FullTimeEmployee extends Employee{
    
    private double monthlySalary;
    
    public FullTimeEmployee(String name, int id,double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    
    @Override
    public double calculateSalary(){
        return monthlySalary;
        
    }
}
class PartimeEmployee extends Employee{
    
    private int hoursWorked;
    private double hourlyRate;
    
    public PartimeEmployee(String name, int id,int hoursWorked,int hourlyRate){
        super(name,id);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}

class PayRollSystem{
    private ArrayList<Employee> employeeList;
    
    public PayRollSystem(){
        employeeList=new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for(Employee employee:employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
        else{
            System.out.println("id given doesn't exist");
        }
        
    }
    
    public void displayEmployee(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}

public class EmployeePayRollSystem{
	public static void main(String[] args) {
	    PayRollSystem payrollSystem= new PayRollSystem();
	    FullTimeEmployee emp1=new FullTimeEmployee("Vikas",001,70000.0);
		PartimeEmployee emp2=new PartimeEmployee("Aman",002,40,100);
		
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		
		System.out.println("Employee details");
		payrollSystem.displayEmployee();
		
		System.out.println("Remove Employee");
		payrollSystem.removeEmployee(emp2.getId());
		
		System.out.println("Remaining Employee details");
		payrollSystem.displayEmployee();
		
	}
}
