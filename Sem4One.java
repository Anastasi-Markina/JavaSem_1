import java.util.*;

public class Sem4One {

	public Sem4One() {
		Deque<Integer> num1Deque = new ArrayDeque<>(Arrays.asList(new Integer[]{-7, -2, -3}));
		Deque<Integer> num2Deque = new ArrayDeque<>(Arrays.asList(new Integer[]{-9, -5, -2, -2}));
		
		
		//task 1
		sumTwoDeques(num1Deque, num2Deque);
		
		
		//task2

	}

	public static Deque<Integer> sumTwoDeques(Deque<Integer> deq1, Deque<Integer> deq2){
		Deque<Integer> result = new ArrayDeque<>();
		Integer digit1, digit2;
		int extraValue = 0;
		while(deq1.size() != 0 || deq2.size() != 0){
			digit1 = deq1.peekLast() instanceof Integer ? deq1.pollLast() : 0;
			digit2 = deq2.peekLast() instanceof Integer ? deq2.pollLast() : 0;

			result.addFirst((digit1 + digit2 + extraValue) % 10);
			extraValue = (digit1 + digit2 + extraValue) / 10;
		}
		if(extraValue != 0){result.addFirst(extraValue);}
		System.out.println(result);
		return result;
	}

		// public static int dequeToInt(Deque<Integer> deque){
	    // 	int result = 0;
	    // 	boolean pozitive = true;
	    // 	while(deque.size()!=0){
	    //     	int digit = deque.pop();
	    //     	result *= 10;
	    //     	result += pozitive ? digit : -digit;
	    //     	if(digit<0){
	    //         	pozitive = false;
	    //     	}
	    // 	}
	    // 	return result;
		// }
		
		
	

	
		// public static LinkedList<Integer> intToLinkedList(int val) {
		// 	boolean isFirstDigit = true;
		// 	boolean firstDigitIsPozitive = true;
		// 	char[] numsAsChars = Integer.toString(val).toCharArray();
		// 	LinkedList<Integer> digitsList = new LinkedList<>();
		// 	int digit;
		// 	for(char c : numsAsChars){
		// 		digit = (int) c - 48;
		// 		if(isFirstDigit){
		// 			if(c == '-'){
		// 				firstDigitIsPozitive = false;
		// 				continue;
		// 			}
		// 			if(!firstDigitIsPozitive){
		// 				digit *= -1;
		// 			}
		// 			isFirstDigit = false;
		// 		}
		// 		digitsList.add(digit);
		// 	}
		// 	return digitsList;
		// }
	}

