package Encapsulation;

 class Teststudent{  
	 
	private String name; 
	private String Clgname;
	private int studentid;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int Studentid) {
		this.studentid =Studentid ;
	}

	public String getClgname() {
		return Clgname;
	}

	public void setClgname(String clgname) {
		this.Clgname = clgname;
	}

	public String getName(){  
	return name;  
	}  
	
	public void setName(String name){  
	this.name=name;  
	}  

public class Student {
	public static void main(String[] args){  
		  
		Teststudent stu=new Teststudent();  
		
		stu.setName("Sahil");  
		stu.setClgname("St.Mary College");
		stu.setStudentid(101);
		stu.setAge(21);
		 
		System.out.println(stu.getName());
		System.out.println(stu.getClgname());
		System.out.println(stu.getStudentid());
		System.out.println(stu.getAge());

}
 }


 }
