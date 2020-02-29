class Lesson_33_Activity_Five{
    public static void insertValue(int[] ints, int value, int index){
        for (int i = ints.length - 1; i > index; i--) {
            ints[i] = ints[i - 1];
        }
        ints[index] = value;
    }

    public static void print(int... ints){
        for (int i = 0; i < ints.length; ++i){
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    public static void test(int value, int index, int...ints){
        print(ints);
        insertValue(ints, value, index);
        print(ints);
    }

    public static void main(String[] args){
        test(100, 0, 1, 2, 3, 4, 5);
        test(100, 1, 1, 2, 3, 4, 5);
        test(100, 2, 1, 2, 3, 4, 5);
        test(100, 3, 1, 2, 3, 4, 5);
        test(100, 4, 1, 2, 3, 4, 5);
    }
}
