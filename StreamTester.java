import tasks.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        List<String> surname = List.of("Paievska", "Makarov", "Koval", "Astafieva", "Solomko", "Andrianchyk", "Bober", "Ostapenko");
        //Task1
        Task1 task1 = new Task1();
        System.out.println(task1.addOrder(surname));
        //Task2
        Task2 task2 = new Task2();
        System.out.println(task2.sortedList(surname));
        //Task3
        Task3 task3 = new Task3();
        System.out.println(task3.printArray(new String[]{"1, 2, 0", "4, 5", "8, 9, 10"}));
        //Task4
        Task4 task4 = new Task4(2521490391L, 11L, (long)Math.pow(2,48));
        task4.randomNumbers(2).limit(10).peek(System.out::println).collect(Collectors.toList());
        //Task5
        Stream<String> streamA = Stream.of("Alfa", "Beta", "Gama");
        Stream<String> streamB = Stream.of("1", "2", "3");
        Stream<String> result = Task5.zip(streamA, streamB);
        System.out.println(result.collect(Collectors.toList()));
    }
}
