import java.io.File;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2Two {
    
//task2 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
	public Sem2Two (){

        
       Logger logger = Logger.getLogger("Main");
	    String filePath = "LogFile.txt";
		File newFile = new File(filePath);
		newFile.createNewFile();
		FileHandler fileHandler = new FileHandler(filePath);
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        //task2-bubble sort
        int[] nums = new int[]{1, 6, 123, -6, 32, -77};
        int temp;
        boolean lastIteration;
        logger.info("start condition: " + Arrays.toString(nums));
        for(int i = 0; i < nums.length - 1; i++){
            lastIteration = true;
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    lastIteration = false;
                }
            }
            logger.info(i+1 + " iteration result: " + Arrays.toString(nums));
            if(lastIteration){
                break;
            };
        }
        logger.info("sorted successfully");
        System.out.println("\ntask2 result:\n" + Arrays.toString(nums) 
 +"\ntask2 logging at " + filePath);
	}
}