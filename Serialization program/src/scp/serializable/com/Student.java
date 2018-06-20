package scp.serializable.com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
 transient int stud_id;
 private static String stud_name;
 
@Override
public String toString() {
	return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
}
public int getStud_id() {
	return stud_id;
}
public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}
public String getStud_name() {
	return stud_name;
}
public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}
private Student(int stud_id, String stud_name) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
}
 
      public static Student getInstance(){
   return new Student(10, "Monali");
       }

      
private void writeObject(ObjectOutputStream oos) throws IOException
{
	System.out.println("Enter in a Encrypted block");
	oos.defaultWriteObject();
	//int Stud_id=10+this.stud_id;
	String str=this.stud_id+"KIRAN";
	System.out.println(str);
	oos.writeObject(str);
}

private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
{
	System.out.println("Enter after Decrypted form");
	ois.defaultReadObject();
	String robj=(String) ois.readObject();
	String stud_id=robj.substring(5);
	System.out.println(stud_id);
}
 
}

