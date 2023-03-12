package Task4;

public class MyRandom {
    private final long a, c, m;
    private long seed;

    public MyRandom seed(long seed) {
        this.seed = seed;
        return this;
    }

    public MyRandom(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public long nextLong(long seed){
         return (a * seed + c) % m;
    }
}
