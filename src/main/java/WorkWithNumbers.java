import java.util.Comparator;
import java.util.List;

public class WorkWithNumbers {
    private List<Integer> numbers ;

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void work() {
        numbers.stream().filter(x -> x > 0 && x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

}
