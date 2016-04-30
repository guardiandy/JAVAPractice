package practice;

public class Person {
public int c;
private String name;
private int age;
protected void setName(String name){
	this.name=name;
}
protected void setAge(int age){
	this.age=age;
}
protected void print(){
	System.out.println("Name="+name+"Age="+age);
}
public class DemoSuper extends Person{
	public void print(){
		System.out.println("DemoSuper:");
		super.print();
	}
}
}
