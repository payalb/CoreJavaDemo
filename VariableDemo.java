package demo2;

public class VariableDemo {
	/*
	 * 1) Local variable: Scope is within the block/method. 
	 * They must be initialized
	 * before they are used. They are not initialized by default.
	 */
	public static void main(String[] args) {
		int x ; // Local variable
	//	System.out.println(x);
		//x++;
		x= 5;
		System.out.println(x);
		if(x>3) {
			int z= 6; //Local Variable
		}
	//	System.out.println(z);
	}

	{
		int z = 3;// Local variable
	}

	
	void print() {
		//System.out.println(x);
		//System.out.println(z);
	}
}
