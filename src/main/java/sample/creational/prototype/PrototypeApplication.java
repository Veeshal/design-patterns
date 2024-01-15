package sample.creational.prototype;

public class PrototypeApplication {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=====================================");
        var u = new User();
        u.setFirstName("Vishal");
        u.setLastName("Moorthy");
        u.setAge(35);

        System.out.println("u = " + u.hashCode());
        System.out.println("u = " + u);

        var uClone = u.clone();

        System.out.println("uClone = " + uClone.hashCode());
        System.out.println("uClone = " + uClone);
        System.out.println("=====================================");

    }
}
