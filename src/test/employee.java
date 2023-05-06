package test;

public class employee {
	
	private String name;
	private int  ID;
	private String department;	
	private String position;

	public void setname (String namegiven) {
		
	name=namegiven;
	
	}
	public void setId (int IDgiven) {
		
		ID= IDgiven;
		
		}
	public void setid ( String IDgiven) {
		
		ID= Integer.parseInt(IDgiven);
		
		}
	public void setdepartment (String departmentgiven) {
		
		department=departmentgiven;
		
		}
	public void setposition (String positiongiven) {
		
		position=positiongiven;
		}
	public String getname() {
		
		return name;
		
	}
	public int getID() {
		
		return ID;
		
	}
	public String getdepartment() {
		
		return department;
		
	}
	public String getposition() {
		
		return position;
		
	}
	public employee( String employeename,int employeeIDnumber ,String employeedepartment, String employeeposition) {
		
		name = employeename;
		ID   = employeeIDnumber;
		department = employeedepartment;
		position= employeeposition;
		
	}
public employee( String employeename,int employeeidnumber) {
		
		name = employeename;
		ID   = employeeidnumber;
		department = "";
		position= "";
		
}
	
public employee() {
	
	name ="";
	ID  = 0;
	department = "";
	position= "";


}
}