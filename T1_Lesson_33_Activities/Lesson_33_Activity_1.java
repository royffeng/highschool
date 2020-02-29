class Lesson_33_Activity_One{
    public static void upper(String[] words){
        for (int i = 0 ; i < words.length; i++){
            words[i] = words[i].toUpperCase();
        }
    }

    private static void print(String[] words){
        for (int i = 0 ; i < words.length; i++){
            System.out.print(words[i] + (i == words.length - 1 ? '\n' : ' '));
        }
    }

    private static void test(String... words){
        print(words);
        upper(words);
        print(words);
    }

    public static void main(String[] args){
        test("hello", "world!", "goodnight", "sweet", "prince");
    }
}
