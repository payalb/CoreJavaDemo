package day2;

public class ObjectMethodsDemo {
	public static void main(String[] args) {
/*		int x=9;
		System.out.println(x);*/
		Paper obj1= new Paper(7,8); //0, 0
		System.out.println(obj1); //toString()
		Paper obj2= new Paper(7,8);
		System.out.println(obj1.equals(obj2)); //false
		System.out.println(obj1==obj2); //false
		//== 
	}
	
}


class Paper{
	Paper(int height, int width){
		setHeight(height);
		setWidth(width);
	}
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height>4) {
		this.height = height;
		}else {
			throw new RuntimeException("Invalid height!");
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width>4) {
		this.width = width;
		}else {
			throw new RuntimeException("Invalid width!");
		}
	}
	@Override
	public String toString() {
		return "[ height is "+ height + " , width is " + width+ "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Paper p= (Paper) o;
		return this.getHeight()== p.getHeight() && this.getWidth()== p.getWidth();
	}
}