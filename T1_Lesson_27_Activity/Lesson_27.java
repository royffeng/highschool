import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int[] randomNumbers = new int[30];
    int valueFound = 0;
    int userInput = 1;
    int permanentFirst = -1;
    int numberOfFinds = 0;

    //Populate and print out the array of 30 values
    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = (int) (Math.random() * (20) + 80);
      System.out.print(randomNumbers[i] + " ");
    }

    System.out.println("\n\nEnter a value to search or enter, -1 to exit the search.");

    userInput = scan.nextInt();

    while (userInput != -1){
      valueFound = 0;
      for (int i = 0; i < randomNumbers.length; i++){
        if (randomNumbers[i] == userInput){
          numberOfFinds++;
          valueFound = 1;
          if(numberOfFinds == 1 && valueFound == 1){
            permanentFirst = i;
          }
        }
      }
      if (valueFound == 1){
        System.out.println("\nValue of " + userInput + " was found.");
        System.out.println(userInput + " occurred " + numberOfFinds + " time(s).");
        System.out.println("The first instance of " + userInput + " occurred at index " + permanentFirst);
        System.out.println("Enter a value to search or enter, -1 to exit the search.");

        userInput = scan.nextInt();
      }else{
        System.out.println("Value was not found.");
        System.out.println("Enter a value to search or enter, -1 to exit the search.");

        userInput = scan.nextInt();
      }
    }
  }
}
