public class Exam3 {
    public static void main(String[] args) {
        
        int item1TotalPrice = 200 * 3;
        int item2TotalPrice = 250 * 4;

        int subTotal = item1TotalPrice + item2TotalPrice;

        System.out.println("⼩計");
        System.out.println(subTotal + "円");

        int tax = (int)(subTotal * 0.1);

        System.out.println("消費税(10%)");
        System.out.println(tax + "円");

        int total = subTotal + tax;

        System.out.println("合計⾦額");
        System.out.println(total + "円");
    }
}
