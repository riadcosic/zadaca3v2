import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);


        // Zadatak 1

       System.out.println("Koliki niz želite ?");
            int arraySize = reader.nextInt();
            int[] taskArray = new int[arraySize];

            for ( int i = 0; i<=taskArray.length -1; i++) {

                System.out.println("Unesite broj : ");
                int arrayNumber = reader.nextInt();
                taskArray[i]=arrayNumber;

            } reader.nextLine();

            for (int i = arraySize-1; i>=0; i--) {

                System.out.println(taskArray[i]);

                if (taskArray[i] % 2 == 0)
                {
                    System.out.println("Number is even");
                }
                else
                {
                    System.out.println("Number is odd");
                }

                if (taskArray[i]>10)
                {
                    System.out.println("Number is larger than 10");
                }
                else
                {
                    System.out.println("Number is smaller than 10");
                }
            }


        //Zadatak 2


       int[] taskTwoArray = {1,2,3,4,5,6,7,8,9,10,1,1,1,1,1};
        if (taskTwoArray.length<=15)
        {
            for (int i=0; i<=taskTwoArray.length; i++)
            {
                System.out.println("First number in array: " + taskTwoArray[0]);
                System.out.println("Second number in array: " + taskTwoArray[1]);
                System.out.println("Third number in array: " + taskTwoArray[2]);
                System.out.println("Fourth number in array: " + taskTwoArray[3]);
                System.out.println("Fifth number in array: " + taskTwoArray[4]);
                System.out.println("Sixth number in array: " + taskTwoArray[5]);
                System.out.println("Seventh number in array: " + taskTwoArray[6]);
                System.out.println("Eight number in array: " + taskTwoArray[7]);
                System.out.println("Nineth number in array: " + taskTwoArray[8]);
                System.out.println("Tenth number in array: " + taskTwoArray[9]);
                System.out.println("Eleventh number in array: " + taskTwoArray[10]);
                System.out.println("Twelfth number in array: " + taskTwoArray[11]);
                System.out.println("Thirteenth number in array: " + taskTwoArray[12]);
                System.out.println("Fourtheenth number in array: " + taskTwoArray[13]);
                System.out.println("Fiftheenth number in array: " + taskTwoArray[14]);
            }

        }else
        {
            System.out.println("Your array is too long.");
        }


        //Zadatak 3


                int[] thirdTaskArray = {1,2,3,4,5,6,7};

                int [] revertedOrderArray = new int[thirdTaskArray.length];
                System.out.println("Original array: " );
                for (int i=0; i<thirdTaskArray.length; i++ )
                {
                    System.out.print( thirdTaskArray[i] + " ");
                }

                System.out.println("Reversed array: " );

                for (int i=thirdTaskArray.length-1; i>=0 ; i--)
                {
                    revertedOrderArray[i] = thirdTaskArray[i];
                    System.out.print( revertedOrderArray[i] + " ");
                }


        //Zadatak 4



               System.out.println("Enter a word to check if it's a palindrome ");
                String wordToCheck = reader.nextLine();

                char[]  palindromeCheck = wordToCheck.toLowerCase().toCharArray();

                int arrayMiddle = (palindromeCheck.length / 2) - 1;
                int toCheckPalindrome = 0;

                for (int i = 0; i <= arrayMiddle; i++)
                {
                if (palindromeCheck[i] == palindromeCheck[(palindromeCheck.length - 1) - i]) {
                toCheckPalindrome = toCheckPalindrome + 1;
                }
                }

                if (toCheckPalindrome == (arrayMiddle + 1))
                {
                System.out.println("Your word " + wordToCheck + " is a palindrome.");
                }
                else
                {
                System.out.println("Your  word " + wordToCheck + " is not a palindrome.");
                }


             */

        //Zadatak 5


          System.out.println("Please enter lower number in range: ");
            int lowerNumberInRange = reader.nextInt();

            System.out.println("Please enter higher number in range: ");
            int higherNumberInRange = reader.nextInt();





            if (lowerNumberInRange<=higherNumberInRange)
            {
                System.out.println("Even numbers for range " + lowerNumberInRange + " to " + higherNumberInRange + " are: ");
                for (int i = lowerNumberInRange + 1; i < higherNumberInRange; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                    }

                }
            } else
            {
                System.out.println("Lower range number cannot be greater than higher range number.");
            }



        //Zadatak 6


         String[] firstArrayTaskSix = {"One", "Two", "Three"};
            String[] secondArrayTaskSix = {"Four", "Five"};
            String[] thirArrayTaskSix = {"Six"};

            int resultArrayLengthTaskSix = firstArrayTaskSix.length + secondArrayTaskSix.length + thirArrayTaskSix.length;
            String[] resultArrayTaskSix = new String[resultArrayLengthTaskSix];

            for (int i = 0; i < firstArrayTaskSix.length; i++)
            {
            resultArrayTaskSix[i] = firstArrayTaskSix[i];
            }

            for (int i = firstArrayTaskSix.length; i < firstArrayTaskSix.length + secondArrayTaskSix.length; i++)
            {
            resultArrayTaskSix[i] = secondArrayTaskSix[i - firstArrayTaskSix.length];
            }

            for (int i = firstArrayTaskSix.length + secondArrayTaskSix.length; i < resultArrayTaskSix.length; i++)
             {
            resultArrayTaskSix[i] = thirArrayTaskSix[i - firstArrayTaskSix.length - secondArrayTaskSix.length];
            }

            for (int i = 0; i < resultArrayTaskSix.length; i++)
            {
            System.out.print(resultArrayTaskSix[i] + " ");
            }



        //  Zadatak 7.


        int[] firstArray = {1,3,5,6};

        int[] secondArray = {1,1,1,1,1,1,1};

        int resultArrayLength = max(firstArray.length,secondArray.length);

        int minimalLength = min(firstArray.length, secondArray.length);

        int[] resultArray = new int[resultArrayLength];

        for (int i = 0; i < minimalLength ; i++)
        {
            resultArray[i] = firstArray[i] + secondArray[i];
        }
        if (firstArray.length > secondArray.length)
        {
            for (int i = secondArray.length; i < resultArray.length ; i++)
            {
                resultArray[i] = firstArray[i];
            }
        }
        else
        {
            for (int i = firstArray.length; i <= resultArray.length - 1; i++)
            {
                resultArray[i] = secondArray[i];
            }
        }
        for (int i = 0; i <= resultArray.length - 1; i++)
        {
            System.out.println(resultArray[i]);
        }



        //Zadatak 8


        String[] wordsTaskEight = {"hello", "hi", "WORD", "cmp", "why"};

        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for (int i = 0; i < wordsTaskEight.length; i++)
        {
            boolean withVowel = false;
            for (int j = 0; j < vowels.length; j++)
            {
                if (wordsTaskEight[i].contains(vowels[j]))
                {
                    withVowel = true;
                }
            }
            if (!withVowel) {
                System.out.println(wordsTaskEight[i]);
            }
        }




        //Zadatak 9


        int[] firstArray = {1, 2, 3};

        int[] secondArray = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                sum+= firstArray[i] + secondArray[j];
            }
        }

        System.out.println("Total sum is: " + sum);













    }
}

