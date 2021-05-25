package only_alphabets;


public class Main {


	public static boolean isLetter(String c) {
	        return c != null && c.chars().allMatch(Character::isLetter);
	    }
	 
	    public static void main(String[] args)
	    {
	        String s = "Mohab Soliman";
	        String m = "Mohab";
	        String n = " ";
	        String v = "/0";	
	        System.out.println("isLetter!! : " + isLetter(s));
	        System.out.println("isLetter!! : " + isLetter(m));
	        System.out.println("isLetter!! : " + isLetter(n));
	        System.out.println("isLetter!! : " + isLetter(v));
	    }
	}
