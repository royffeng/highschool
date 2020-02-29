import java.lang.Math;
import java.util.*;


class Main{
  //Calculates the distances between each of the four sets of coordinates
  public static double distanceCalculation(int x1, int y1, int x2, int y2){
    return (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));
  }
  
  //Calculates the perimeter by summing the four distances
  public static double perimeterCalculation(double perimeter1, double perimeter2, double perimeter3, double perimeter4){
    return (perimeter1 + perimeter2 + perimeter3 + perimeter4);
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);                        //Scanner class declaration
    boolean run = true;                                           //Determines if the program runs or continues running or not
    boolean runAgain = false;                                     //Determines the if statement for adding two newlines for formatting purposes
    String userInputRunAgain;                                     //Stores the user's input of a valid yes or no response
    boolean invalidResponse = false;                              //Whether the user input a valid yes or no response, determines loop conditions
    int x1, y1, x2, y2, x3, y3, x4, y4;                           //Stores the coordinates of the quadrilateral
    double distance1, distance2, distance3, distance4, perimeter; //Stores the calculated distances between coordinate points
    
    //This loop runs as long as user input indicates so
    while(run){
      //This conditional adds two newlines for formatting for user's sake
      if(runAgain){
        System.out.print("\n\n");
      }
      
      //Getting user input for the first set of coordinates
      System.out.print("Enter the x and y coordinates for points (A, B, C, D) to find the perimeter of a quadrilateral\n");
      System.out.print("Point A:\n");
      x1 = scan.nextInt();
      y1 = scan.nextInt();
    
      //Getting user input for the second set of coordinates
      System.out.print("Point B:\n");
      x2 = scan.nextInt();
      y2 = scan.nextInt();
    
      //Getting user input for the third set of coordinates
      System.out.print("Point C:\n");
      x3 = scan.nextInt();
      y3 = scan.nextInt();
    
      //Getting user input for the final set of coordinates
      System.out.print("Point D:\n");
      x4 = scan.nextInt();
      y4 = scan.nextInt();
    
      //Calculating the distances between the sets of coordinates by calling upon the distanceCalculation method
      distance1 = distanceCalculation(x1, y1, x2, y2);
      distance2 = distanceCalculation(x2, y2, x3, y3);
      distance3 = distanceCalculation(x3, y3, x4, y4);
      distance4 = distanceCalculation(x4, y4, x1, y1);
    
      //Calculating the perimeter by calling upon the perimeterCalculation method
      perimeter = perimeterCalculation(distance1, distance2, distance3, distance4);
    
      //Outputting the perimeter
      System.out.print("The perimeter is: " + perimeter + "\n\n");
      
      //Asking user if they would like to run program again and receiving input
      System.out.print("Would you like to find the perimeter of another quadrilateral? (Y or N)\n");
      userInputRunAgain = scan.next();
      
      //Converting the user's input to uppercase so both Y/y and N/n will work
      userInputRunAgain = userInputRunAgain.toUpperCase();
      
      //Determining if the program should run again and add two newlines or user input is invalid and they should try again
      if(userInputRunAgain.equals("Y")){
          run = true;
          runAgain = true;
        }else if(userInputRunAgain.equals("N")){
          run = false;
          runAgain = false;
        }else{
          invalidResponse = true;
          System.out.print("That's not a yes or no response. Would you like to find the perimeter of another quadrilateral? (Y or N)");
          userInputRunAgain = scan.next();
        }
      
      //If the user's input was invalid, this loop will run until the user inputs a valid response
      while(invalidResponse){
        if(userInputRunAgain.equals("Y")){
          run = true;
          runAgain = true;
          invalidResponse = false;
        }else if(userInputRunAgain.equals("N")){
          run = false;
          runAgain = false;
          invalidResponse = false;
        }else{
          invalidResponse = true;
          System.out.print("That's not a yes or no response. Would you like to find the perimeter of another quadrilateral? (Y or N)");
          userInputRunAgain = scan.next();
        }
      }
    }
  }
}
