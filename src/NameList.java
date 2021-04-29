import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 public class NameList {
    private static List<IndexName> names = Arrays.asList(new IndexName(1, "Galyna"),
            new IndexName(2, "Denys"), new IndexName(3, "Ivan"),
            new IndexName(4, "Oleg"), new IndexName(5, "Alla"));


    public static void main(String[] args) {
        String filtered = names.stream()
                .filter(name -> name.getIndex()% 2 != 0)
                .map(IndexName::toString)
                .collect(Collectors.joining(", "));
        System.out.println(filtered);
    }
}