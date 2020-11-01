public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int count = 200;
        int bonus = count / 100 + count;
        int total;
        if (count > 1000) {
            total = bonus + amount;
        } else {
            total = amount + count;
        }
        System.out.println(total);
    }
}


