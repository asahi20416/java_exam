public class Exam6 {
    public static void main(String[] args) {
        calc(3, 8, '@');
    } 
    
    static void calc(int num1, int num2, char i) {
        if (i == '+') {
            System.out.println(num1 + num2);
        } else if (i == '-') {
            System.out.println(num1 - num2);
        } else if (i == '*') {
            System.out.println(num1 * num2);
        } else if  (i == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println(-1);
        }

         System.out.println("第1引数:" + num1 + "、第2引数:" + num2 + "、第3引数:\"’" + i + "\"’");
    }
}
