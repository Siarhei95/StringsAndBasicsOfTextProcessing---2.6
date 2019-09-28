package Question_6; //Из заданной строки получить новую, повторив каждый символ дважды.

public class question_6 {

    public static void main(String[] args) {
        String str = "abcdegnfdn";
        int n = 2;
        System.out.println("Original string: " + str);
        repeatLetters(str,n);
    }

       public static void repeatLetters(String str, int n){ {
            StringBuilder repeat = new  StringBuilder();

            for (int i = 0; i < str.length() ; i++) {

                for (int j = 0; j < n; j++) {
                    repeat.append(str.charAt(i));
                }
            }
            System.out.println("Repeat each character twice: " + repeat);
        }
    }
}