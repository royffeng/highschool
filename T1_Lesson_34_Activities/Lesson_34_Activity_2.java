class Lesson_34_Activity_Two{
    public static int sum(int... values){
        int result = 0;
        for (int value : values){
            result += value;
        }
        return result;
    }

    public static double average(int... a){
        return (double) sum(a) / a.length;
    }

    public static void main(String[] args){
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
