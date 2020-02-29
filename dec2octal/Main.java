import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    //Declaring the variables, array, and scan that will be used throughout the program
    Scanner scan = new Scanner(System.in);
    int userInput;
    int inputMod;
    int i = 0;            //Index i for the octal array
    int inputValueLength; //Stores the length of the user input to declare the exact length for the array
    
    //Prompting the user for input
    System.out.print("Enter a decimal value up to 3 digits:\n");
    
    //Assigning the user input to its storage variable
    userInput = scan.nextInt();
    
    //Finding the length of the user input
    inputValueLength = (int)(Math.log10(userInput) + 1);
    
    int[] octal = new int[inputValueLength + 1];
    
    inputMod = userInput;
    
    while(userInput != 0){
      //Assinging inputMod to its new remainder value after modding the original input value
      inputMod = inputMod % 8;
      
      userInput /= 8;
      
      //Saturating the array with the remainder value
      octal[i] = inputMod;
      
      inputMod = userInput;
      
      //Incrementing the array index counter
      i++;
    }
    
    //Resetting the counter to octal length and printing out the entirety of the array
    for(i = octal.length - 1; i >= 0; i--){
      System.out.print(octal[i]);
    }
    
  }
}
