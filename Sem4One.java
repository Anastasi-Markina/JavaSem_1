import java.util.*;

public class Sem4One {

	
	public static int dequeToInt(Deque<Integer> deque){
	    int result = 0;
	    boolean pozitive = true;
	    while(deque.size()!=0){
	        int digit = deque.pop();
	        result *= 10;
	        result += pozitive ? digit : -digit;
	        if(digit<0){
	            pozitive = false;
	        }
	    }
	    return result;
	}
	
	public static LinkedList<Integer> intToLinkedList(int val){
	    boolean isFirstDigit = true;
	    boolean firstDigitIsPozitive = true;
	    char[] numsAsChars = Integer.toString(val).toCharArray();
	    LinkedList<Integer> digitsList = new LinkedList<>();
	    int digit;
	    for(char c : numsAsChars){
	        digit = (int) c - 48;
	        if(isFirstDigit){
	            if(c == '-'){
	                firstDigitIsPozitive = false;
	                continue;
	            }
	            if(!firstDigitIsPozitive){
    	            digit *= -1;
	            }
	            isFirstDigit = false;
	        }
	        digitsList.add(digit);
	    }
	    return digitsList;
	}
}
