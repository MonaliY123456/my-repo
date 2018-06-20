package scp.serializable.com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Book implements Serializable{
 public Book(int bookid,String booknm) {
		super();
		this.bookid=bookid;
		this.booknm = booknm;
	}



private static int bookid;
 private  String booknm;

 
 
public static Book getInstance(){
	return new Book(101, "Java Programming");
}
 private void writeObject(ObjectOutputStream oos) throws IOException
 {
	 System.out.println("Enter in Encryptted format");
	 oos.defaultWriteObject();
	 String k= "12345678"+this.booknm;
	 System.out.println(k);
	 oos.writeObject(k);
 }
 
 
 
 

@Override
public String toString() {
	return "Book [book_id=" + bookid + ", booknm=" + booknm + "]";
}
private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
 {
	 System.out.println("In Decrypted format");
	 ois.defaultReadObject();
	 String robj=(String) ois.readObject();
	// System.out.println(robj);
	 String k=robj.substring(8);
	 System.out.println(k);
 }
 
 
}
