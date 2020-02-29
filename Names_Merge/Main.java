import java.util.Scanner;

class Main{
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    
    String [] array1 = new String [10000];
    String [] array2 = new String [10000];
    String [] array3 = new String [20000];
    int End1 = 0;
    int End2 = 0;
    int flag = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    
    
    //Making Array 1 and Checking Alphebetical Order
    System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
    for (int i = 0; i < 10000; i++){
     String word = scan.nextLine();
     array1[i] = (word.substring(0,1).toUpperCase()) + (word.substring(1).toLowerCase()); //puts title case on name
      if (array1[i].equals ("End")){
        End1 = i; 
        break;
      }
    }
    for(int i = 0; i < End1 - 1; i++)
        if((array1[i].compareTo (array1[i+1] ) > 0))
          flag = 1;
          
    //Making Array 2 and Checking Alphebetical Order
    System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
    for (int i = 0; i < 10000; i++){
     String word = scan.nextLine();
     array2[i] = (word.substring(0,1).toUpperCase()) + (word.substring(1).toLowerCase()); 
     if (array2[i].equals ("End")){
       End2 = i;
       break;
     }
    }
    for(int i = 0; i < End2 - 1; i++)
        if((array2[i].compareTo (array2[i+1] ) > 0))
          flag = 1;
        
    
    if(flag == 1){
      System.out.println("First Array");
      for (int i = 0; i < End1; i++){
        System.out.print(array1[i] + " ");
      }
      System.out.println();
      System.out.println("Second Array");
      for (int i = 0; i < End2; i++){
        System.out.print(array2[i] + " ");
      }
      System.out.println();
      System.out.println("Error: Arrays not in correct order");
      
    }
    
    else if (flag == 0){
      System.out.println(End1 + " " + End2);
      int mergedEnd = (End1 + End2) - 1;
      while (i1 != End1 || i2 != End2){
        if((array2[i2].equals("End")) || (!(array1[i1].equals("End")) && (array1[i1].compareTo(array2[i2]) < 0))){
              array3[i3] = array1[i1];
              i1++;
              i3++;
          }
          else{
            array3[i3] = array2[i2];
            i2++;
            i3++;
          }
        }
      
      System.out.println("First Array");
      for (int i = 0; i < End1; i++){
        System.out.print(array1[i] + " ");
      }
      System.out.println();
      System.out.println("Second Array");
      for (int i = 0; i < End2; i++){
        System.out.print(array2[i] + " ");
      }
      System.out.println();
      System.out.println("Merged Array");
      for (int i = 0; i <= mergedEnd; i++)
        System.out.print(array3[i] + " ");
    }
    
  }
}
