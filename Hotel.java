import java.util.Scanner;
public class Hotel{

	static Holder hotel_ob = new Holder();     //Lab4 the concept of static variable is completed 


	static Scanner sc = new Scanner(System.in);
	public static void CustDetails(int i, int rn){

		String name, contact, gender;
		String name2 = null, contact2 = null;
		String gender2 = "";

		System.out.print("Enter customer name: ");
		name = sc.next();

		System.out.print("Enter contact number: ");
		contact = sc.next();

		System.out.print("Enter gender: ");
		gender = sc.next();

		if (i < 3){

			System.out.print("Enter second customer name: ");
			name2 = sc.next();

			System.out.print("Enter contact number: ");
			contact2 = sc.next();

			System.out.println("Enter gender: ");
			gender2 = sc.next();

		}

		switch(i){

			case 1:
				hotel_ob.luxury_doubleroom[rn] = new Doubleroom(name, contact, gender,name2,contact2,gender2);
				break;

			case 2:
				hotel_ob.deluxe_doubleroom[rn] = new Doubleroom(name, contact, gender,name2,contact2,gender2);
				break;

			case 3:
				hotel_ob.luxury_singleroom[rn] = new Singleroom(name, contact,gender);
				break;

			case 4:
				hotel_ob.deluxe_singleroom[rn] = new Singleroom(name, contact,gender);
				break;
			default:
				System.out.println("Wrong option");

		}
	}   //CustDetails() 





//////////////////////////////////////////////////////////////////////////////////////////////////


static void bookroom(int i){

	int j;
	int rn;

	System.out.println("\nChoose room number from : ");
	switch(i) {
		case 1:
			for (j=0; j<hotel_ob.luxury_doubleroom.length ;j++) {
				
				if (hotel_ob.luxury_doubleroom[j] == null){
					System.out.print(j+1+",");
				}
			}

			System.out.print("\nEnter room number: ");
			try {
				rn = sc.nextInt();
				rn--;
				if (hotel_ob.luxury_doubleroom[rn]!=null)
					throw new NotAvailable();
				CustDetails(i,rn);
			}catch(Exception e){
				System.out.println("Invalid option");
				return;
			}
			break;

		case 2:
			for (j=0; j<hotel_ob.deluxe_doubleroom.length;j++){

				if (hotel_ob.deluxe_doubleroom[j] == null){

					System.out.print(j+11+",");
				}
			}

			System.out.print("\nEnter room number: ");
			try{

				rn = sc.nextInt();
				rn = rn-11;

				if (hotel_ob.deluxe_doubleroom[rn] != null)
					throw new NotAvailable();
				CustDetails(1,rn);
			}catch(Exception e){
				System.out.println("Invalid option");
				return;
			}
			break;

		case 3:
                  for(j=0;j<hotel_ob.luxury_singleroom.length;j++)
                {
                    if(hotel_ob.luxury_singleroom[j]==null)
                    {
                        System.out.print(j+31+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                rn=sc.nextInt();
                rn=rn-31;
                if(hotel_ob.luxury_singleroom[rn]!=null)
                    throw new NotAvailable();
                CustDetails(i,rn);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
        case 4:
                  for(j=0;j<hotel_ob.deluxe_singleroom.length;j++)
                {
                    if(hotel_ob.deluxe_singleroom[j]==null)
                    {
                        System.out.print(j+41+",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try{
                rn=sc.nextInt();
                rn=rn-41;
                if(hotel_ob.deluxe_singleroom[rn]!=null)
                    throw new NotAvailable();
                CustDetails(i,rn);
                }
                catch(Exception e)
                {
                   System.out.println("Invalid Option");
                    return;
                }
                break;
        default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked");
	} //bookroom() 



	static void features(int i){     //Lab4 The static Keyword 
									//the concept of static function is implemented 

		switch(i){
			case 1:
				System.out.println("Number of double beds: 1\n Ac : Yes\nFree breakfast : Yes\nCharge per day:4000");
				break;
			case 2:
				System.out.println("Number of double beds: 1\n Ac : No\nFree breakfast : Yes\nCharge per day:3000");
				break;
			case 3:
				System.out.println("Number of double beds: 1\n Ac : Yes\nFree breakfast : Yes\nCharge per day:22000");
				break;

			case 4:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
		}
	}  //features() function 





	static void availability(int i){   //Lab2 the concept of member function is implemented here

			int j, count = 0 ;

			switch(i) {

				case 1:
					for(j=0;j<hotel_ob.luxury_doubleroom.length;j++)
               		{
                    	if(hotel_ob.luxury_doubleroom[j]==null)
                        count++;
                	}
               		 break;
            	case 2:
	                for(j=0;j<hotel_ob.deluxe_doubleroom.length;j++)
	                {
	                    if(hotel_ob.deluxe_doubleroom[j]==null)
	                        count++;
	                }
               		 break;
           		 case 3:
	                for(j=0;j<hotel_ob.luxury_singleroom.length;j++)
	                {
	                    if(hotel_ob.luxury_singleroom[j]==null)
	                        count++;
	                }
	                break;
	            case 4:
	                for(j=0;j<hotel_ob.deluxe_singleroom.length;j++)
	                {
	                    if(hotel_ob.deluxe_singleroom[j]==null)
	                        count++;
	                }
	                break;
	            default:
	                System.out.println("Enter valid option");
	                break;
       		}
                 System.out.println("Number of rooms available : "+count);


			}   //availability() 


	static void order(int rn, int rtype){
		int i, q;
		char wish;

		try{
			System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
        do{

        	i = s.nextInt();
        	System.out.print("Quantity- ");
        	q=sc.nextInt();

        	switch(rtype){
        		case 1:
        			hotel_ob.luxury_doubleroom[rn].food.add(new Food(i,q));
        			break;
        		case 2:
        			hotel_ob.deluxe_doubleroom[rn].food.add(new Food(i,q));
        			break;
        		case 3:
        			hotel_ob.luxury_singleroom[rn].food.add(new Food(i,q));
        			break;
        		case 4:
        			hotel_ob.deluxe_singleroom[rn].food.add(new Food(i,q));
        			break;

        	}

        	System.out.println("Do you want to order anything else? (y/n)");
        	wish = sc.next().charAt(0);
        }while(wish=='Y' || wish =='y');
        	

		}
		catch(NullPointerException e){
			System.out.println("\nRoom not booked");
		}

		catch(Exception e)
		{
			System.out.println("Cannot be done");
		}
	}


	}
