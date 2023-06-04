package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> sortedList(List<String> surname){
        return surname
                .stream()
                .map(it -> it.toUpperCase())
                .sorted((it1, it2) -> it2.compareToIgnoreCase(it1))
                .collect(Collectors.toList());
    }
}
