class Lesson_34_Activity_One{
    public static int sum(int... values){
        int result = 0;
        for (int value : values){
            result += value;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
