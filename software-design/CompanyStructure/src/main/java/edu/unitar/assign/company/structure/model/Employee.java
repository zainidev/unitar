package edu.unitar.assign.company.structure.model;

public abstract class Employee {

	//static , so it can accumulate the number of  employees
    private static int countID;  

    public String name;
    public int employeeID;
    public double baseSalary;
    public double bonus;
    public int headcount=0;
    public double bonusBudget;

    public Employee manager;
    public Accountant accountantSupport;



    public Employee(String name, double baseSalary){
    	
        //Should construct a new employee object and take in two parameters,
        // one for the name of the user and one for their base salary.
        this.name=name;
        this.baseSalary=baseSalary;
        countID++;
        this.employeeID=countID;
    }

    public int getEmployeeID(){
    	
        //Should return the employee's ID.
        // The ID should be issued on behalf of the employee at the time they are constructed.
        // The first ever employee should have an ID of "1", the second "2" and so on
        return this.employeeID;
    }
    
    public String getName(){
    	
    	//Should return the employee's current name
        return this.name;   
    }

    public double getBaseSalary(){
    	
    	//Should return the employee's current salary
        return this.baseSalary; 
    }

    public Employee getManager(){
    	
    	//Should return a reference to the Employee object that represents this employee's manager
        return manager; 
    }

    public Accountant getAccountantSupport() {
        return accountantSupport;
    }

    public void setManager(Employee manager){
        this.manager=manager;
    }

    public boolean equals(Employee other){
    	
        //Should return true if the two employee IDs are the same, false otherwise
        return this.getEmployeeID()==other.getEmployeeID();
    }

    public String toString(){
    	
        //Should return a String representation of the employee that is 
    	// a combination of their id followed by their name.
        // Example: "1 Kasey"
        return getEmployeeID()+" "+getName();
    }

    public abstract String employeeStatus();

    public void getBonus(){

    }
    
    
    
}
