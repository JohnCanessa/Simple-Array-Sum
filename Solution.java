import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/*
 * 
 */
public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {

    	int sum	= 0;
    	
    	// **** sum the values ****
//    	for (int i = 0; i < ar.length; i++)
//    		sum += ar[i];
    	for (int val : ar)
    		sum += val;
    	
    	// **** ****
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    // **** ****
    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        // **** ****
        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
