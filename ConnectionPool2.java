package day2;

import java.util.ArrayList;
import java.util.List;
//ConnectionPool object created at the start of my app
//Only 1 object of this class

//Lazy initialization
public class ConnectionPool2 implements Cloneable{
	//When the class is loaded, this would not be instantiated
	 public static ConnectionPool2 instance ;
	 
	List<Connection> connections = new ArrayList<>();
	//Noone else would be able to call it from outside the class
	private ConnectionPool2(int noOfConnections){
		for(int i=0; i< noOfConnections; i++) {
			Connection connection= new Connection(i+1);
			connections.add(connection);
		}
	}
	
	//When somone will call the getInstanec method,
	public static ConnectionPool2 getInstance() {
		if(instance == null) {
			instance= new ConnectionPool2(10);
		}
			return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
}

class Demo8{
	public static void main(String[] args) {
		ConnectionPool2 obj1= ConnectionPool2.getInstance();
		ConnectionPool2 obj2=ConnectionPool2.getInstance();
		System.out.println(obj1==obj2);//true
	}
}
