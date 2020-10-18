import java.io.Serializable;
import java.util.ArrayList;

public class Singleroom implements Serializable{

	String name;
	String contact;
	String gender;

	ArrayList<Food> food = new ArrayList<>();   //Lab1 : implementaion of array in java

	public Singleroom(){

		this.name="";

	}

	public Singleroom(String name, String contact, String gender){

		// Lab6 : Implementaion of this keyword 
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}



}