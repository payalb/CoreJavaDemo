package day3;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Object: byte
		Manager e = new Manager();
		e.budget= 434334.43f;
	e.project="rjt";
	//	System.out.println(e.gender.hashCode());
		// java object -> byte stream : serialization
		try (ObjectOutputStream stream1 = new ObjectOutputStream(new FileOutputStream(new File("abc.txt")));
				// Byte stream -> java object : deserialization
				ObjectInputStream stream = new ObjectInputStream(new FileInputStream("abc.txt"))) {

			stream1.writeObject(e);
			stream1.flush();

			/*
			 * Employee obj= new Employee(); obj.count=32;
			 */
			Manager e1 = (Manager) stream.readObject();
		/*	System.out.println(e1.id);
			System.out.println(e1.name);*/
			//System.out.println(e1.gender);
			System.out.println(e1.budget);
			System.out.println(e1.project);
			//System.out.println(e1.gender.hashCode());
			System.out.println(e == e1);
		}
	}
}

/*class Employee  implements Externalizable{


	String name;
	int id;
//	Gender gender;
	// Address address;
	static int count;

	public String toString() {
		return name + "," + id;
	}


	public Object readResolve() {
		return e;
	}

	private void readObject(ObjectInputStream stream) throws IOException {
		int id = stream.readInt();
		System.out.println(id);
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.writeInt(id);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		int id=in.readInt();
		
	}
}

class Address  {
	String hNo;
	String city;
}
*/

   class Manager  implements Externalizable{ 
	   
	   public Manager() {
		   System.out.println("Called!");
	   }
	  String project; float budget;
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			out.writeUTF(project);
			
		}

		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			String id=in.readUTF();
			
		}

  }
 