package scp.serializable.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {
		
		Student st1=Student.getInstance();
		//Student st2=Student.getInstance();
		st1.setStud_name("Kiran");
		System.out.println(st1);
		
		//System.out.println(st1==st2);
		
		Book b1=Book.getInstance();
		System.out.println(b1);
	   File f=new File("abc.txt");
	   
	   FileOutputStream fos=new FileOutputStream(f);
	   ObjectOutputStream oos=new ObjectOutputStream(fos);
	   oos.writeObject(st1);
	   
	   oos.writeObject(b1);
	   System.out.println(st1);
	   System.out.println(b1);
	   
	   /*FileInputStream fis=new FileInputStream(f);
	   ObjectInputStream ois=new ObjectInputStream(fis);
	   Student s1=(Student)ois.readObject();
	   System.out.println(s1);*/
	   
	   /*File f1=new File("abc1.txt");
	   FileOutputStream fos1=new FileOutputStream(f1);
	   ObjectOutputStream oos1=new ObjectOutputStream(fos1);
	   oos.writeObject(st1);
	   System.out.println(st1);*/
	   
	   
	   FileInputStream fis1=new FileInputStream(f);
	   ObjectInputStream ois1=new ObjectInputStream(fis1);
	   Student newSt=(Student) ois1.readObject();
	   System.out.println(newSt);
	 
	   System.out.println("----------------------");
	   Book newBok=(Book) ois1.readObject();
	   System.out.println(newBok);
	   
	   
		  
	}

}
