import java.util.*;

public class HotelManagement{   //Lab2 the concept of access sprcifier, class implemented here 

	public static void main(String[] args) {
		
		//Hotel hotel = new Hotel();
		Scanner sc = new Scanner(System.in);
		
		char wish;
		int ch,ch2;

		//Lab1:  The control statment concept implemented here 
		do{

			System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
			ch = sc.nextInt();
			switch(ch){

				case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Delux Single Room\n");
				ch2 = sc.nextInt();
				Hotel.features(ch2);
				break;

				case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
				ch2 = sc.nextInt();
                Hotel.availability(ch2);
				break;

				case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
				ch2 = sc.nextInt();
                Hotel.bookroom(ch2);
				break;

				case 4: 
					System.out.print("Room Number -");
					ch2 = sc.nextInt();
					if (ch2 > 60)
						System.out.println("Room doesn't exist");
					else if(ch2>40)
						Hotel.order(ch2-41,4);
					else
						System.out.println("Room doesn't exist");
				break;
				
				default : System.out.println("Wrong selection!");
				break;
			}

			System.out.println("\nContinue : (y/n)");
            wish=sc.next().charAt(0); 
            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0); 
            }
		}while(wish=='y'||wish=='Y');
	}
}