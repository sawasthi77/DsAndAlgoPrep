import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAvgGrade {
    public static void main(String[] args) {

        Map<String, List<Integer>> studentScores = new HashMap<>();

        double bestAvg = studentScores.entrySet().stream()
                .mapToDouble(entry -> entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0))
                .max().orElse(0);
        System.out.println(bestAvg);
    }
}
