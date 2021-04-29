import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixingStream {
    public static <A> Stream<A> zip(Stream<A> first, Stream<A> second) {
        Iterator<A> i1 = first.iterator();
        Iterator<A> i2 = second.iterator();
        Stream<A> mixingStream = Stream.empty();
        while (i1.hasNext() & ((Iterator<?>) i2).hasNext()){
            mixingStream = Stream.concat(mixingStream, Stream.of(i1.next(),
                    i2.next()));
        }
        return mixingStream;
    }
    public static void main(String[] args) {
        System.out.println(MixingStream.zip(Arrays.stream(new String[]{"Hi", " have" ,"good"}),
                Arrays.stream(new String[]{"everyone,", "a", "day"}))
                .collect(Collectors.joining(" ")));
    }
}

