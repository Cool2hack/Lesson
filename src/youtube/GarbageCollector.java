package youtube;

public class GarbageCollector {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        method();
    }

    private static void method() {
        GarbageCollector garbageCollector = new GarbageCollector();
        garbageCollector = null;
        GarbageCollector garbageCollector1 = new GarbageCollector();
        garbageCollector1 = null;
        System.gc();



    }
    @Override
    public void finalize() {
        System.out.println("AAA");
    }
}
