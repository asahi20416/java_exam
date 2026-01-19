public class Exam5 {
    public static void main(String[] args) {
        int addTotal = addition(5,3);
        int subTotal = subtraction(5,3);
        int multiTotal = multiplication(5,3);
        int divTotal = division(5,3);
        int remTotal = remainder(5,3);

        System.out.println("足し算結果:" + addTotal);
        System.out.println("引き算結果:" + subTotal);
        System.out.println("掛け算結果:" + multiTotal);
        System.out.println("割り算結果:" + divTotal);
        System.out.println("剰余算結果:" + remTotal);
    }

    static int addition(int num1, int num2) {
        int addTotal = num1 + num2;
        return addTotal;
    } 

    static int subtraction(int num1, int num2) {
        int subTotal = num1 - num2;
        return subTotal;
    } 

    static int multiplication(int num1, int num2) {
        int multiTotal = num1 * num2;
        return multiTotal;
    } 

    static int division(int num1, int num2) {
        int divTotal = num1 / num2;
        return divTotal;
    } 

    static int remainder(int num1, int num2) {
        int remTotal = num1 % num2;
        return remTotal;
    } 
}
