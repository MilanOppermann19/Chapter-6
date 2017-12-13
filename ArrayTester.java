
public class ArrayTester
{
    
    public ArrayTester()
  

   ArrayCalculation ac = new ArrayCalculation();
   double avg = ac.averageArray(arr1);
   System.out.println("Average is " + avg);
   
   int[] result = ac.sumColumns(arr1);
   
   for(int thing : result {
       
    }
    System.out.print(thing ' , );

    int[][] squared = ac.squareArray(arr2);
    System.out.println();
    for(int[] row : squared) {
    for(int num : row) {
        System.out.print(num + ", ");
        }
        system.out.println();
    }
}
