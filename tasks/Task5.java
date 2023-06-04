package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB){
        List<T> streamAItems = streamA.collect(Collectors.toList());
        List<T> streamBItems = streamB.collect(Collectors.toList());
        int minSize = Math.min(streamAItems.size(), streamBItems.size());
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            resultList.add(streamAItems.get(i));
            resultList.add(streamBItems.get(i));
        }
        return resultList.stream();
    }
}
