 class Employee_Detail{
    String name;
    int salary;
    int Employee_ID;
    String designation;
 
 public void setEmployeeDetail(int Employee_ID,String name,String designation,int salary){
    this.Employee_ID=Employee_ID;
    this.name=name;
    this.salary=salary;
    this.designation=designation;

 }
public void displayEmployeeDetail(){
    System.out.println("Employee ID : "+Employee_ID);
    System.out.println("Employee Name : "+name);
    System.out.println("Employee Salary :"+salary);
    System.out.println("Employee designation :" +designation);
}
 }

 public class p34 {
 
    public static void main(String[] args) {
        Employee_Detail e=new Employee_Detail();
        e.setEmployeeDetail(212,"Hemali","Software Engineer",950000);
        e.displayEmployeeDetail();
    
 }
}