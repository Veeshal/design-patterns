package sample.creational.factory;

import sample.creational.factory.code.EnemyShip;
import sample.creational.factory.code.EnemyShipFactory;

import java.util.Scanner;

public class FactoryApplication {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var factory = new EnemyShipFactory();
        System.out.println("""
                        Hello World
                        """
        );
        System.out.println(
                """
                        What type of ship?
                        U - UFO
                        R - Rocket
                        B - Big UFO
                        """);
        String line = scan.nextLine();
        if (line != null) {
            var enemyShip = factory.makeEnemyShip(line);
            if (enemyShip != null) {
                doEnemyStuff(enemyShip);
            }
        }
    }

    public static void doEnemyStuff(EnemyShip ship) {
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();
    }
}
