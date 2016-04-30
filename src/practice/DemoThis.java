package practice;

public class DemoThis {
	
	private String name;
	private int age;
	DemoThis(String name, int age){
		setName(name);
		setAge(age);
		this.print();
	}
public void setName(String name){
	this.name=name;
}
public void setAge(int age){
	this.age=age;
}
public void print(){
	System.out.println("Name="+name+"Age="+age);
}
public static void main(String[] args){
	DemoThis dt = new DemoThis("Kevin","22");
}
}
