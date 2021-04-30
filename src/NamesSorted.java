import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Comparator.reverseOrder;
public class NamesSorted {
    public static void main(String[] args) {
        List<String> reversed =
                        Arrays.asList("Artem", "Jane", "Kolya", "Borys", "Oksana", "Ivan")
                                .stream()
                                .map(String::toUpperCase)
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
                System.out.println(reversed);
            }
        }


