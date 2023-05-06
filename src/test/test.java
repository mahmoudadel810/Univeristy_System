package test;


public class test {

	public static void main(String[] args) {
		
	employee employee1 = new employee ();
	employee employee2 = new employee ("Mark jones",39119);
	employee employee3 = new employee ("JOY ROJERS",81774,"Manufacturing","Engineer");	
		
	employee1.setname("Susan Mayers");
	employee1.setId(47899);
	employee1.setdepartment("Accounting");
	employee1.setposition("Visc president");
	employee2.setdepartment("IT");
	employee2.setposition("Programmer");
	
	System.out.println("name \t\t ID\t\t Department \t\tPosition ");
	System.out.println(employee1.getname()+  "\t" + employee1.getID()  + "\t\t" + employee1.getdepartment()   + "\t\t"  +    employee1.getposition());
	System.out.println(employee2.getname()+  "\t" + employee2.getID()  + "\t\t" + employee2.getdepartment()   + "\t\t\t"  +    employee2.getposition());
	System.out.println(employee3.getname()+  "\t" + employee3.getID()  + "\t\t" + employee3.getdepartment()   + "\t\t"  +    employee3.getposition());
	}

}
