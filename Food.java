import java.io.Serializable;

public class Food implements Serializable{

	//Lab2 : implement the concept of data member 
	int itemno;
	int quantity;
	float price;

	//Lab3 : implement of the concept of constractor overloading 

	//public Food(){}

	public Food(int itemno, int quantity){

		this.itemno=itemno;
		this.quantity=quantity;

		switch(itemno){

			case 1:
				price = quantity*50;
				break;
			case 2:
				price = quantity*60;
				break;
			case 3:
				price = quantity*70;
				break;
			case 4:
				price = quantity*30;
				break;
			default:
				System.out.println("Oh sorry!");
		}
	}

}