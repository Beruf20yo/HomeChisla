import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NumbersWithoutStream implements Numbers{

    public void work(){
        List<Integer> nums = new ArrayList<>();
        for(int value: numbers){
            if(value > 0 && value % 2 == 0){
                nums.add(value);
            }
        }
        nums.sort(Comparator.naturalOrder());
        for(int num: nums){
            System.out.println(num);
        }
    }
}
