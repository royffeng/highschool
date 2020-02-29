import java.util.Scanner;

public class Lesson_1011_Activity{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.print("Enter a number in base 8:\n");
        userInput = scan.nextLine();

        if(userInput.length() > 8){
            System.out.println("ERROR: Incorrect Octal Format");
        }else{
            int octalIndex = 0;
            int[] octalInput = new int[8];
            for(int i = userInput.length() - 1; i >= 0; i--, octalIndex++){
                try{
                    char c = userInput.charAt(i);
                    if(c >= '0' && c < '8'){
                        octalInput[octalIndex] = Integer.parseInt(String.valueOf(c));
                    }else{
                        throw new NumberFormatException();
                    }
                }catch(NumberFormatException e){
                    System.out.println("ERROR: Incorrect Octal Format");
                    return;
                }
            }
            int result = 0;
            for (int i = 0; i < octalInput.length; i++){
                result += octalInput[i] * (int)Math.pow(8, i);
            }
            System.out.println(result);
        }
    }
}
