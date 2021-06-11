package isalpha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  IsAllLetters("HelloWorld");
	      IsAllLetters("HelloWorld2");
	}

	public static void IsAllLetters ( String _str) {
        System.out.println(_str +" : "+ 
                           _str.chars().allMatch(Character::isLetter)); //Caracter is a rapperclass
    }	
	
}
