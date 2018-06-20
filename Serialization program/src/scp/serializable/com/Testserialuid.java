package scp.serializable.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Testserialuid {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	//	Employee obj=new Employee(100000,10,"EMPLOYEE1",9730252799l);
		 File f=new File("DEMO.txt");
		   
//		  FileOutputStream fos=new FileOutputStream(f);
//		   ObjectOutputStream oos=new ObjectOutputStream(fos);
//		   oos.writeObject(obj);
//		   System.out.println(obj);
//		  
		   
		 FileInputStream fis=new FileInputStream(f);
		   ObjectInputStream ois=new ObjectInputStream(fis);
		   Employee e1=(Employee)ois.readObject();
		   System.out.println(e1);
		   

	}

}



class Employee implements Serializable
{
	long mobileno;
	int empsalary;
	int empid;
	String empnm;
	 
	
	private static final long serialVersionUID = 1L;
	public Employee(int empsalary, int empid, String empnm,long mobileno) {
		super();
		this.empsalary = empsalary;
		this.empid = empid;
		this.empnm = empnm;
		this.mobileno=mobileno;
	}
	@Override
	public String toString() {
		return "Employee [mobileno=" + mobileno + ", empsalary=" + empsalary + ", empid=" + empid + ", empnm=" + empnm
				+ "]";
	}
	



	
	
}