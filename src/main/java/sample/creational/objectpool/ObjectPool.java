package sample.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;

public class ObjectPool<T extends Poolable> {
    private final BlockingQueue<T> pool;

    public ObjectPool(Function<Integer, T> supplier, int poolSize) {
        pool = new LinkedBlockingQueue<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            pool.offer(supplier.apply(i));
        }
    }

    public T get() {
        try {
            return pool.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void release(T poolable) {
        poolable.reset();
        try {
            pool.put(poolable);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
