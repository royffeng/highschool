class Lesson_33_Activity_Four{
    public static void reverse(int... ints){
        for (int i = 0; i < ints.length / 2; i++) {
            int j = ints.length - i - 1;
            int tmp = ints[i];
            ints[i] = ints[j];
            ints[j] = tmp;
        }
    }
    
    public static void print(int... ints){
        for (int i = 0; i < ints.length; i++){
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    public static void test(int... ints){
        print(ints);
        reverse(ints);
        print(ints);
    }

    public static void main(String... args){
        test();
        test(1);
        test(1, 2);
        test(1, 2, 3);
        test(1, 2, 3, 4);
        test(1, 2, 3, 4, 5);
        test(1, 2, 3, 4, 5, 6);
    }
}
