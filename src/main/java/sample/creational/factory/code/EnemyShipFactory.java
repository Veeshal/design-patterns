package sample.creational.factory.code;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType) {
        return switch (shipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null; // or throw exception
        };
    }
}
