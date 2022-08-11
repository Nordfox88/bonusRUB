public class Main {
    public static void main(String[] args) {

        int capital = 100;
        int buy = 1500;


        if (buy > 1000) {
            int gift = buy / 100;
            int total = capital + gift + buy;
            System.out.println("Итоговый счет " + total);
            System.out.println("Бонусный счет " + gift);
        } else {
            int total = capital + buy;
            System.out.println("Итоговый счет " + total + "р");
            System.out.println("Бонусный счет 0 р");
        }

    }
}