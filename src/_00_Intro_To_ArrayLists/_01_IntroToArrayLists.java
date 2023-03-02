package _00_Intro_To_ArrayLists;
import java.util.ArrayList;
public class _01_IntroToArrayLists {
	
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList <String> stringList = new ArrayList<String>();
        // 2. Add five Strings to your list
    	stringList.add("one");
    	stringList.add("two");
    	stringList.add("three");
    	stringList.add("four");
    	stringList.add("five");
        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i < 5; i++) {
    		System.out.println(stringList.get(i));
    	}
        // 4. Print all the Strings using a for-each loop
    	for(String word: stringList) {
    		System.out.println(word);
    	}
        // 5. Print only the even numbered elements in the list.
    	for(int i = 0; i < 5; i+=2) {
    		System.out.println(stringList.get(i));
    	}
        // 6. Print all the Strings in reverse order.
    	for(int i = 4; i >= 0; i--) {
    		System.out.println(stringList.get(i));
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
        for(int i = 0; i < 5; i++) {
        	if(stringList.get(i).contains("e")) {
        		System.out.println(stringList.get(i));
        	}
        }
    }
}
