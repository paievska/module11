package tasks;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public String printArray(String[] array){
        return Stream.of(array)
                .flatMap(it -> Arrays.stream(it.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
