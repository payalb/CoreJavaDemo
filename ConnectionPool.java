package day2;

import java.util.ArrayList;
import java.util.List;
//ConnectionPool object created at the start of my app
//Only 1 object of this class

//Eager initialization
public class ConnectionPool {
	//When the class is loaded, this would be instantiated
	 public static ConnectionPool instance = new ConnectionPool(10);
	 
	List<Connection> connections = new ArrayList<>();
	//Noone else would be able to call it from outside the class
	private ConnectionPool(int noOfConnections){
		for(int i=0; i< noOfConnections; i++) {
			Connection connection= new Connection(i+1);
			connections.add(connection);
		}
	}
	
}

class Connection {

	int id;
	
	Connection(int id){
		this.id= id;
	}
}


class Demo7{
	public static void main(String[] args) {
	/*	ConnectionPool obj= new ConnectionPool(10);
		ConnectionPool obj1= new ConnectionPool(10);*/
	}
}