public class PeerLeader extends Student{

    private int employeeID;
    private double salary;
    

    public PeerLeader(){
        super();
        employeeID = 0;
        salary = 0.0;
    }

    public PeerLeader(String name, int id, int employeeID, double salary){
    
        super(name, id);
        this.employeeID=employeeID;
        this.salary=salary;
    
    }

    public int getEmployeeID(){
    
    return this.employeeID;
    
    }

    public double getSalary(){
    
    return this.salary;
    
    }

    public void setEmployeeID(int employeeID){
    
    this.employeeID=employeeID;
    
    }

    public void setSalary(double salary){
    
    this.salary=salary;

    }

    public String toString(){
    
      return "Student " + super.toString() + ", and employee ID and salary are " + 
        getEmployeeID() + " & " + getSalary();
    
    }
}