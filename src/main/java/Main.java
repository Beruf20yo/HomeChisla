import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkWithNumbers workWithNumbers = new WorkWithNumbers();
        workWithNumbers.setNumbers(List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        workWithNumbers.work();
    }
}
