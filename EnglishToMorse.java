import java.util.*;
import java.lang.String;

class EnglishToMorse{
	void convertToMorse(String text){
		System.out.println("\nYour morse code:");
		char c;
		HashMap<String,String> morseCodes = new HashMap<String,String>(){
			{
				put("a",".-"); put("b","-..."); put("c","-.-."); put("d","-.."); put("e","."); put("f","..-."); put("g","--.");
				 put("h","...."); put("i",".."); put("j",".---"); put("k","-.-"); put("l",".-.."); put("m","--"); put("n","-.");
				 put("o","---"); put("p",".--."); put("q","--.-"); put("r",".-."); put("s","..."); put("t","-"); put("u","..-");
				 put("v","...-"); put("w",".--"); put("x","-..-"); put("y","-.--"); put("z","--..");
				 put("0","-----"); put("1",".----"); put("2","..---"); put("3","...--"); put("4","....-"); put("5",".....");
				 put("6","-...."); put("7","--..."); put("8","---.."); put("9","----.");
				 put(" ",""); put(".",".-.-.-"); put(",","--..--"); put(";","-.-.-"); put(":","---..."); put("?","..--..");
				 put("'",".----."); put("-","-....-"); put("\"",".-..-."); put("/","-..-."); put("(","-.--.");
				 put(")","-.--.-"); put("!","-.-.--"); 
			}
			};
		/*morseCodes.put("a",".-");*/
		for(int i=0;i<text.length();i++){
			System.out.print(/*"/" +*/ morseCodes.get(Character.toString(text.charAt(i)).toLowerCase()) + " "); 
		}
		System.out.print("\n");
	}
	public static void main(String[] args){
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		EnglishToMorse obj = new EnglishToMorse();
		obj.convertToMorse(text);
	}
}