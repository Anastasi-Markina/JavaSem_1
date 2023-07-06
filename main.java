import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.*;
import java.io.*;
import java.util.logging.*;


public class main {


    public static void main(String[] args) {

        


        Sem4One sem4One = new Sem4One();
        Deque<Integer> num1Deque = new ArrayDeque<>(Arrays.asList(new Integer[]{1, 2, 3}));
		Deque<Integer> num2Deque = new ArrayDeque<>(Arrays.asList(new Integer[]{-3, 2, 2}));
		
		int num1 = dequeToInt(num1Deque);
		int num2 = dequeToInt(num2Deque);
		
		//task 1
		System.out.println(intToLinkedList(num1 + num2));
		
		//task2
		System.out.println(intToLinkedList(num1 * num2));







//           //task1
// 	    String jsonString = new Scanner(System.in).nextLine();
// 		String[] params = jsonString.replaceAll("[{} ]", "")
//  .replace(":", "=")
//  .split(",");
        

    // Logger logger = Logger.getLogger("Main");
	// String filePath = "./LogFile.log";
	// File newFile = new File(filePath);
	// newFile.createNewFile();
	// FileHandler fileHandler = new FileHandler(filePath);
    // logger.addHandler(fileHandler);
    // SimpleFormatter formatter = new SimpleFormatter();
    // fileHandler.setFormatter(formatter);

        // TaskOne taskOne = new TaskOne();
        // taskOne.triangularNumber();
        // taskOne.factorialNumber();


        // TaskTwo taskTwo = new TaskTwo();

        // TaskThree taskThree = new TaskThree();
        // taskThree.calculatorAB();
       


        // taskThree.additionAB();
        // taskThree.subtractionAB();
        // taskThree.multiplicationAB();
        // taskThree.divisionAB();

    }

}

