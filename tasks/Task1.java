package tasks;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public List<String> addOrder(List<String> surname){
        AtomicInteger order = new AtomicInteger(1);
        return surname
                .stream()
                .filter(it -> order.getAndIncrement() % 2 != 0)
                .map(it -> order.get()- 1 + ". " + it)
                .collect(Collectors.toList());
    }
}
