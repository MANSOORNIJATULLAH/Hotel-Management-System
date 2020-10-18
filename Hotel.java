public class Hotel{

	static void features(int i){

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
}