public class Main {
    public static void main(String[] args) {
        NumbersWithStream numbersWithStream = new NumbersWithStream();
        NumbersWithoutStream numbersWithoutStream = new NumbersWithoutStream();
        System.out.println("Со Stream: ");
        numbersWithStream.work();
        System.out.println("Без Stream: ");
        numbersWithoutStream.work();
    }
}
