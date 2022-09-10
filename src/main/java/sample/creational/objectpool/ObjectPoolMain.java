package sample.creational.objectpool;

public class ObjectPoolMain {
    public static void main(String[] args) {
        var pool = new ObjectPool<>(n -> new DatabaseConnection("D-" + n), 2);

        for (int i = 0; i < 4; i++) {
            var connection = pool.get();
            connection.createStatement();
            pool.release(connection);
        }

    }
}
