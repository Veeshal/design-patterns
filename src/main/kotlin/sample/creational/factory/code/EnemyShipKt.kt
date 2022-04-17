package sample.creational.factory.code;

abstract class EnemyShipKt(
    var name: String,
    var amtDamage: Double
) {

    fun followHeroShip() {
        println("$name is following the hero");
    }

    fun displayEnemyShip() {
        println("$name is on the screen");
    }

    fun enemyShipShoots() {
        println("$name attacks and does $amtDamage damage to hero");
    }
}
