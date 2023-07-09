// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sem3One {

	public Sem3One() {

		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(new Integer []{1, 41, -2, -23, 5, 77, -65, 30, 1}));
		System.out.println(nums);

		//task1
		deleteEvens(nums);
		System.out.println(nums);

		//task2
		int minNum = findMin(nums);
		System.out.println(minNum);

		//task3
		int maxNum = findMax(nums);
		System.out.println(maxNum);

		//task4
		double avgValue = findAvg(nums);
		System.out.printf("%.4f\n", avgValue);

	
	}

	
	public static void deleteEvens(List<Integer> numArray){
	    numArray.removeIf(num -> num % 2 == 0);
	}
	
	
	public static int findMin(List<Integer> numArray){
	    int minValue = Integer.MAX_VALUE;
	    for(int i=0; i<numArray.size(); i++){
	        if(numArray.get(i) < minValue){
	            minValue = numArray.get(i);
	        }
	    }
	    return minValue;
	}
	
	public static int findMax(List<Integer> numArray){
	    int maxValue = Integer.MIN_VALUE;
	    for(int i=0; i<numArray.size(); i++){
	        if(numArray.get(i) > maxValue){
	            maxValue = numArray.get(i);
	        }
	    }
	    return maxValue;
	}
	
	public static double findAvg(List<Integer> numArray){
	    int numsSum = 0;
	    for(int i=0; i<numArray.size(); numsSum+=numArray.get(i), i++);
	    double avg = (double) numsSum/numArray.size();
	    return avg;
	}
}