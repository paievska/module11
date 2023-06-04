package tasks;

import java.util.stream.Stream;

public class Task4 {
    private long a, c, m;
    public Task4(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public Stream<Long> randomNumbers(long seed){
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
