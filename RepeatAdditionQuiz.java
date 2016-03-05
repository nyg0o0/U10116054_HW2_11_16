/* 
---- 11.16 java Assignment ----
  Strudent ID: U10116054
  Strudent Name: Yu-Hsin Chen
  Assign Date: 3/5
  Content:This is a program for repeat addition quiz with arraylist.
*/

// import java api
import java.util.Scanner;
import java.util.ArrayList;


// RepeatAdditionQuiz class
public class RepeatAdditionQuiz {
  
  //main method
  public static void main(String[] args){
    
    // creat array list
    ArrayList<Integer> answerList = new ArrayList<>();
    
    // generate two random integer
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    // scanner
    Scanner input = new Scanner(System.in);

    // prompt the user to enter the answer
    System.out.print(
     "What is " + number1 + " + " + number2 + "? ");
     int answer = input.nextInt();


    // if answer is wrong
    while (number1 + number2 != answer){
      // if input answer is not in arraylist
      if (!answerList.contains(answer)){
        // add to the arraylist
        answerList.add(answer);
      }
      else{
        // the input answer is already be entered once 
        System.out.println("You already entered " + answer);
      }
      
      // prompt user to enter a answer agin
      System.out.print("Wrong answer. Try again. What is "
       + number1 + " + " + number2 + "? ");
       // scanner the input answer
       answer = input.nextInt();
    } // end of while
    
    // right answer
    System.out.println("You got it!");
    
  } // end main method

}  // end class
