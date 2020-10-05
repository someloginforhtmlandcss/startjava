import java.util.Scanner;

public class GuessTheNumber {

	
	public GuessTheNumber(){
		
		int playerNumber = -1;
		String answer;
		boolean run = true;

		Scanner inData = new Scanner(System.in);
		
		System.out.print("Enter the first player name: ");
		Player firstPlayer = new Player(inData.next());
			
		System.out.print("Enter the second player name: ");
		Player secondPlayer = new Player(inData.next());

		String player = firstPlayer.getName();

		while(run){
		
			int guessNumber = guessNumber();
		
			while (playerNumber != guessNumber) {
				
				System.out.print(player + ", enter the number: ");
				
				if (player == firstPlayer.getName()){
					firstPlayer.setNumber(inData.nextInt());
					playerNumber = firstPlayer.getNumber();
				} else {
					secondPlayer.setNumber(inData.nextInt());
					playerNumber = secondPlayer.getNumber();
				}
				
				if (playerNumber == guessNumber){
					System.out.println(player + ", you win!");
					playerNumber = guessNumber();
					do {
						System.out.println("Would you like to continue?");
						answer = inData.next();
						if (answer.equals("no")){
							System.out.println("Game stopped!");
							run = false;
						break;
					}	
				} while (!answer.equals("yes"));					
					break;				
				} else if (playerNumber < guessNumber){
					System.out.println(playerNumber + " is less than guess number!");
				} else if (playerNumber > guessNumber){
					System.out.println(playerNumber + " is bigger than guess number!");
				}

				if (player == firstPlayer.getName()){
					player = secondPlayer.getName();	
				} else {
					player = firstPlayer.getName();	
				}				
			} 								
		}				

	}

	private int guessNumber(){

		int minValue = 0;
		int maxValue = 100;
		int guessNumber = (int) (Math.random() * (maxValue - minValue) ) + minValue;

		return guessNumber;

	}


}