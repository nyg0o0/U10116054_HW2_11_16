/* 
---- 11.16 java Assignment ----
  Strudent ID: U10116054
  Strudent Name: Yu-Hsin Chen
  Assign Date: 3/7

  Content:This is a program for bank account, it can show some informations of your account.
  
-->  RepeatAdditionQuiz.java  ----- main program
  
*/

// import java api
import java.util.Scanner;
import java.util.ArrayList;


// RepeatAdditionQuiz class
public class RepeatAdditionQuiz {
  //main method
  public static void main(String[] args){
    ArrayList<Integer> answerList = new ArrayList<>();
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    Scanner input = new Scanner(System.in);

    System.out.print(
     "What is " + number1 + " + " + number2 + "? ");
     int answer = input.nextInt();

    while (number1 + number2 != answer){
      if (!answerList.contains(answer)){
        answerList.add(answer);
      }
      else{
        System.out.println("You already entered " + answer);
      }
      System.out.print("Wrong answer. Try again. What is "
       + number1 + " + " + number2 + "? ");
       answer = input.nextInt();
    }
    System.out.println("You got it!");
  }
}
