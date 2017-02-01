// Janelynn Camingue
// 2/1/17
// This program is a spelling quiz for the user that consists of 5 questions. The game counts how many 
// questions the user gets wrong and right and then gives the result at the end.


import java.util.Scanner;


class Spelling_Quiz{
   
   public static void main(String[] args){
	 // Scanner sc = new Scanner(System.in);
	  // variables
	  int user_answer1, user_answer2, user_answer3, user_answer4, user_answer5, start, wrong, right;
	  int correct1, correct2, correct3, correct4, correct5;
	  String name;
	   Scanner sc = new Scanner(System.in);
	  // asks the user for his/her name
	  System.out.println("What is your name?");
	  name=sc.next();
	  // tells the user to type 8 to start the game
	  System.out.println("Hello,"+name+". Let's start.");
	  System.out.println(""+name+", please type 8 and then enter to start.");
	  start=sc.nextInt();
	  // begin game here
	  
	  // question 1
	  System.out.println("");
	  System.out.println("Which of these has a correct spelling?");
	  System.out.println("Type 1, 2, or 3 for your answer.");
	  System.out.println("");
	  System.out.println("1. opthalmologist");
	  System.out.println("2. Febuary");
	  System.out.println("3. capricious");
	  System.out.println("");
	  user_answer1=sc.nextInt();
	  correct1=3;
	  // initialize how many questions the player has gotten right and wrong. (Start at 0)
	  wrong=0;
	  right=0;
	  
	  if(user_answer1 != correct1){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Incorrect.");
		  wrong++;
	  }
	  else if(user_answer1==correct1){
		  System.out.println("");
		  System.out.println("Correct. Next question.");
		  System.out.println("");
		  System.out.println("");
		  right++;
	  }
	  
	  // question 2
	  System.out.println("");
	  System.out.println("Which of these has an incorrect spelling?");
	  System.out.println("Type 1, 2, or 3 for your answer.");
	  System.out.println("");
	  System.out.println("1. handkerchief");
	  System.out.println("2. weird");
	  System.out.println("3. cemetary" );
	  System.out.println("");
	  user_answer2=sc.nextInt();
	  correct2=3;
	  
	  if(user_answer2 !=  correct2){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Incorrect");
		  wrong++;
	  }
	  else if(user_answer2 == correct2){
		  System.out.println("");
		  System.out.println("Correct. Next question.");
		  System.out.println("");
		  System.out.println("");
		  right++;
	  }
	  
	  // question 3
	   System.out.println("Which of these has a correct spelling?");
	  System.out.println("Type 1, 2, or 3 for your answer.");
	  System.out.println("");
	  System.out.println("1. propaganda");
	  System.out.println("2. curicculum");
	  System.out.println("3. persception" );
	  System.out.println("");
	  user_answer3=sc.nextInt();
	  correct3=1;
	  
	  if(user_answer3 != correct3){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Incorrect.");
		  wrong++;
	  }
	  else if(user_answer3 == correct3){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Correct. Next question.");
		  System.out.println("");
		  System.out.println("");
		  right++;
	  }
	  
	  // question 4
	  System.out.println("");
	  System.out.println("Which of these has an incorrect spelling?");
	  System.out.println("Type 1, 2, or 3 for your answer.");
	  System.out.println("");
	  System.out.println("1. charades");
	  System.out.println("2. blasfemmy");
	  System.out.println("3. porridge" );
	  System.out.println("");
	  user_answer4=sc.nextInt();
	  correct4=2;
	  
	  if( user_answer4 != correct4){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Incorrect.");
		  wrong++;
	  }
	  else if(user_answer4 == correct4){
		  System.out.println("");
		  System.out.println("Correct. Final question.");
		  System.out.println("");
		  System.out.println("");
		  right++;
	  }
	  
	  // question 5
	  System.out.println("");
	  System.out.println("Which of these has a correct spelling?");
	  System.out.println("Type 1, 2, or 3 for your answer.");
	  System.out.println("");
	  System.out.println("1. brocolli ");
	  System.out.println("2. glimphs");
	  System.out.println("3. alternative" );
	  System.out.println("");
	  user_answer5=sc.nextInt();
	  correct5=3;
	  
	  if(user_answer5 != correct5){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Incorrect.");
		  wrong++;
	  }
	  else if(user_answer5 == correct5){
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Correct.");
		  System.out.println("");
		  System.out.println("");
		  right++;
	  }
	  
	  // final evaluation here
	  System.out.println("---------------------------------------------");
	  System.out.println("Congrats! You finished the quiz, "+name+".");
	  System.out.println(" ");
	  System.out.println("--------------------------------------------");
	  System.out.println("");
	  System.out.println("Results: ");
	  System.out.println("You got "+wrong+" incorrect answers.");
	  System.out.println("You got "+right+" correct answers.");
	  
	  if(wrong==0){
		  System.out.println("Wow! You didn't miss any!");
	  }
	  if (wrong==1){
		  System.out.println("You got an 80%.");
	  }
	  if (wrong==2){
		  System.out.println("You got a 60%. You should probably study more.");
	  }
	  if(wrong>=2){
		  System.out.println("You have failed this quiz.");
	  }
   }
}
	  