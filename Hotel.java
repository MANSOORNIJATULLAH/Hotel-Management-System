public class Hotel{

	static Holder hotel_ob = new Holder();

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
	}





	static void availability(int i){   //Lab2 the concept of member function is implemented here

			int j, count = 0 ;

			switch(i) {

				case 1:
					for (j=0; j<10; j++){

					}
			}

	}
}