package q3;
import java.util.LinkedList;

/**
 A class that calculates the min, max, and average
 of a series of numbers.
 */
public class DataAnalyzer {
    LinkedList<Integer> numbers;
    /**
     Constructs a DataAnalyzer object that can calculate the
     min, max, and average of a series of numbers.
     @param numList the series of numbers to be used.
     */
    public DataAnalyzer(LinkedList<Integer> numList) {
        numbers = numList;
    }

    /**
     Determine minimum number within list of numbers.
     @return the minimum number of the list.
     */
    public int min() {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < min){
                min = numbers.get(i);
            }
        }
        return min;
    }

    /**
     Determine maximum number within list of numbers.
     @return the maximum number of the list.
     */
    public int max() {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }

    /**
     Calculates the average of all the numbers within
     list of numbers.
     @return the average of the numbers in the list.
     */
    public double average() {
        double avg = 0.0;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        avg = (double) sum/numbers.size();
        return avg;
    }
}
