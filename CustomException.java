package Assinment2;
class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
		
	}
}

public class CustomException {

	public static void main(String[] args) throws InvalidAgeException {
		int age=16;
		if(age>=18) {
			System.out.println("you are eligible for vote");
		}
		else {
			throw new InvalidAgeException("you are not eligible for vote");
		}

	}

}
