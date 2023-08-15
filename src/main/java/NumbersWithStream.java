import java.util.Comparator;
public class NumbersWithStream implements Numbers{

    public void work() {
        numbers.stream().filter(x -> x > 0 && x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}
