package test;

public class student extends univirsty {
	
	 String firstname;
	 String lastname;
	 
	 student(String firstname , String lastname){
		 
		this.firstname=firstname;
		this.lastname=lastname;
		
		 
	 }
	 
	 String getstudentinfo() {
		 
		 return (firstname + " "+ lastname+ " Student in :"+Uname);
		 
	 }

}
