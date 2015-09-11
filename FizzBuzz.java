
public class FizzBuzz {
	public static void main(String[] args){
		int i = 0;
		int limit = 0;

		//parse input
		if( args != null && args.length > 0 ){
			limit = Integer.parseInt(args[0]);
		}

		if(limit <= 0) {
			System.out.println("You need to enter a number while running this command. \n Usage javac [number] ... ");
		}else{
			limit = Integer.parseInt(args[0]);
		}

		for(i = 1; i <= limit ; i++ ){
			if( i % 3 == 0 && i % 5 == 0){
				System.out.print("FizzBuzz");
			}else if( i % 3 == 0){
				System.out.print("Fizz");
			}else if( i % 5 == 0){
				System.out.print("Buzz");
			}else{
				System.out.print(i);
			}

			System.out.print('\n');
		}

	}
}