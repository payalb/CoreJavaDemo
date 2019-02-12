package demo2;
//rt.jar

//delegating pattern to load the classes

//-verbose:class
public class LoadingDemo {
	public static void main(String[] args) {
		System.out.println(P1.x); 
	}
}

class P1{
	
	static int x; //0
}
