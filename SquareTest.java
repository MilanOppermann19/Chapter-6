// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("magicData"));
       //Scanner scan = new Scanner(new File("C:\Users\........\2011 2 February\Arrays"));
        int count = 1;                 //count which square we're on
        int size = scan.nextInt();     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {

            //create a new Square of the given size
            Square mySquare = new Square (size);

            //call its read method to read the values of the square
            System.out.println("\n******** Square " + count + " ********");

            //print the square
            mySquare.printSquare(); 
            //you do not need to surround this method with S.o.p(); because in Square class, the printSquare method already calls the S.o.p() method.

            //print the sums of its rows
            //System.out.println("The sum of the rows in this square: " + mySquare.sumRow());
            for (int row = 0; row < size; row++) 
            {
                System.out.println("The sum of the rows in row " + row + "is: " + mySquare.sumRow(row));
            }
            System.out.println();

            //print the sums of its columns
            //System.out.println("The sum of the columns in this square: " + mySquare.sumCol());
            for (int col = 0; col < size; col++) 
            {
                System.out.println("The sum of the columns in column " + col + "is: " + mySquare.sumCol(col));
            }
            System.out.println();

            //print the sum of the main diagonal
            System.out.println("The sum of the main diagonal in this square: " + mySquare.sumMainDiag());
            //print the sum of the other diagonal
            System.out.println("The sum of the main diagonal in this square: " + mySquare.sumOtherDiag());
            //determine and print whether it is a magic square
            System.out.println("Is this a magic square? " + mySquare.magic());

            //get size of next square
            size = scan.nextInt();
            count++;

        }

    }
}
