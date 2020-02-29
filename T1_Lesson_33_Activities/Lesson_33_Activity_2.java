class Lesson_33_Activity_Two{
    public static void randomize(int... integers){
        for (int i = 0; i < integers.length; i++){
            integers[i] = (int) (Math.random() * 90) + 10;
        }
    }

    private static void print(int... integers){
        for (int i = 0 ; i < integers.length; i++){
            System.out.print(integers[i] + (i == integers.length - 1 ? "\n" : " "));
        }
    }

    private static void test(int sizeOfArray){
        int[] integers = new int[sizeOfArray];
        print(integers);
        randomize(integers);
        print(integers);
    }

    public static void main(String... args){
        test(1);
        test(5);
        test(30);
    }
}
