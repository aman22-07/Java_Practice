import java.util.ArrayList;
import java.util.List;

// --- 1. TEAM CLASS (The Owner of Employees List) ---
class Team {
    private String teamName;
    private int teamId;
    private String department;
    // Aggregation: Team has a list of Employees (The 'whole' manages the 'parts')
    private List<Employee> members; 
    
    // Constructor
    public Team(String teamName, int teamId, String department) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.department = department;
        this.members = new ArrayList<>(); // Initialize the collection
    }

    // Behavior: Method to add an employee to the team (called during hiring)
    public void addMember(Employee emp) {
        if (emp != null) {
            this.members.add(emp);
        }
    }
    
    // Getters (Required by other classes for association)
    public String getTeamName() {
        return teamName;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public void displayDetails() {
        System.out.println("Team: " + teamName + ", Dept: " + department + ", Members: " + members.size());
    }
}

// --- 2. EMPLOYEE CLASS (The Parts) ---
class Employee {
    private int employeeId; // Fixed spelling typo
    private String empName;
    private Team team; // Association: Employee has a Team
    private Company employer; // Association: Employee has a Company

    // Constructor: Takes references to the Company and Team objects
    public Employee(int employeeId, String empName, Company employer, Team team) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.employer = employer;
        // FIX: Initializes the Association with the Team object
        this.team = team; 
    }
    
    // Getter (Required by Company and Team)
    public String getName() {
        return empName;
    }
    
    public void displayDetails() {
        System.out.println("  - ID: " + employeeId + ", Name: " + empName + 
                           ", Works at: " + employer.getCompanyName() + 
                           ", Team: " + team.getTeamName());
    }
}

// --- 3. COMPANY CLASS (The Owner of the Employee Pool) ---
class Company {
	private String companyName;
	private int taxId;
	// Aggregation: Company has a list of Employees
	private List<Employee> empList; // Used List interface

	// FIX: Constructor fixes typo and removes unnecessary list parameter
	public Company(String name, int taxId) {
		this.companyName = name; // FIX: Corrected capitalization error
		this.taxId = taxId;
		this.empList = new ArrayList<>(); // FIX: Correctly initializes the list
	}
	
	public void hireEmployee(Employee emp, Team team) {
        if (emp != null) {
            this.empList.add(emp); // Add to Company's list
            team.addMember(emp); // CRITICAL: Add to Team's list (Bi-Directional Link)
            System.out.println("\n✅ " + emp.getName() + " hired by " + this.companyName + " and assigned to " + team.getTeamName());
        }
    }
    
    // Getter
    public String getCompanyName() {
        return companyName;
    }
    
    public List<Employee> getAllEmployees() {
        return this.empList;
    }

    public void displayDetails() {
        System.out.println("\n--- Company Details ---");
        System.out.println("Name: " + this.companyName);
        System.out.println("Tax ID: " + this.taxId);
        System.out.println("Total Employees: " + this.empList.size());
    }
}

// --- 4. Main Class for Testing ---
public class Main {
    public static void main(String[] args) {
        // 1. Create the Company
        Company uberCorp = new Company("Uber Global", 987654);
        
        // 2. Create the Teams
        Team backendTeam = new Team("Backend Services", 101, "Engineering");
        Team fraudTeam = new Team("Fraud Analytics", 102, "Data Science");

        // 3. Create Employees and Hire Them (Establishing the Bi-Directional Links)
        // Employee(id, name, employer, team)
        Employee emp1 = new Employee(1001, "Alice Smith", uberCorp, backendTeam);
        Employee emp2 = new Employee(1002, "Bob Johnson", uberCorp, backendTeam);
        Employee emp3 = new Employee(1003, "Charlie Day", uberCorp, fraudTeam);

        // Hire employees using the Company method, which links them to the Team
        uberCorp.hireEmployee(emp1, backendTeam);
        uberCorp.hireEmployee(emp2, backendTeam);
        uberCorp.hireEmployee(emp3, fraudTeam);

        // 4. Demonstrate Relationships
        uberCorp.displayDetails();
        backendTeam.displayDetails();
        fraudTeam.displayDetails();
        emp1.displayDetails();
        
        // Demonstrate Aggregation: Checking team list reflects hiring
        System.out.println("\nBackend Team Members:");
        for (Employee emp : backendTeam.getMembers()) {
            System.out.println(" - " + emp.getName());
        }
    }
}
