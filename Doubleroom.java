import java.io.Serializable;
public class Doubleroom extends Singleroom implements Serializable{   //Lab7 The concept of Inheritance is implemented here

	String name2;
	String contact2;
	String gender2;


	// Lab3 : the concept of constructor overloading implemented 
	Doubleroom(){
		this.name = "";
		this.name2 = "";
	}

	Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2){
		this.name = name;
		this.contact=contact;
		this.gender=gender;
		this.name2=name2;
		this.contact2=contact2;
		this.gender2=gender2;
	}

}