
/**
 * ArrayCalculation 
 *
 * @author (Milan)
 * @version (12/13/17)
 */
public class ArrayCalculation
{
    public static void
    
    public double averageArray(int[][] nums) {
        int sum = 0;
        for(int row = 0; row; nums.length; row++) {
            for(int col = =; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
        }
        int total = nums.length * nums[0].length;
        return(double) sum/total;
    }
 

    public double averageArray(int[][] nums);
    
    public int[][] squareArray(int[][] nums) {
        int[][] result = new int[nums.length][nus[0].length];
        
        for(int row =0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                int value = nums[row][col];
                result[row][col] value*value
        
        return result;
    }
}
