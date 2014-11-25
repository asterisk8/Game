
	

	import java.util.HashMap;
	import java.util.Map;

	
	public class GameQA extends Game {

		String[] values = {"rock", "paper", "scissors"};
		Map<String, String> result = new HashMap<String, String>();
		
		public GameQA() {
			result.put("rock+rock", "The result is tie");
			result.put("paper+paper", "The result is tie");
			result.put("scissors+scissors", "The result is tie");
			
			result.put("rock+paper", "You lost and computer won!");
			result.put("rock+scissors", "You won and computer lost!");

			result.put("paper+scissors", "You lost and computer won!");
			result.put("paper+rock", "You won and computer lost!");
			
			result.put("scissors+paper", "You won computer lost!");
			result.put("scissors+rock", "You lost and computer won!");
		}
		
		void generateComputerChoice() {
			int x = (int) (Math.random() * 3);
			computerChoice = values[x];
		}

		// TODO: needs improvements
		void promptUserChoice() {
			super.promptUserChoice();
		}
		
		
		String compare() {
			String msg = "";
			String key = userChoice + "+" + computerChoice;
			msg = result.get(key);
			return msg;
		}
	}


