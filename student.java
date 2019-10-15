
public class student {
String name;
int age;
boolean isvegetarian;

public student(String n, int a, boolean v) { // constructor with instruction to expect information
	this.name=n; //is the information 
	this.age=a;
	this.isvegetarian=v;
}
public student(int a, boolean v) { //()information not expected if empty and if information in () it expects information.
	this.name="james";
	this.age=a;
	this.isvegetarian=v;
}
public void getOlder(int a) { //behaviour "void" doesn't send information back,"int" sends information back,"boolean" send true or false information back.
	age++; //increases the value by 1
}
public int getOlder( ) {
	return age++; // sends the information back
}
public String changeName(String nn ) {
	this.name=nn;
	return name; //nothing happens after return
	System.out.println("name has been changed");
}
@Override //telling it to over ride the other toString method.
public String toSring() {
	return name;
}
}
