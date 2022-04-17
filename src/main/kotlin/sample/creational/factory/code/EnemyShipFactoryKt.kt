package sample.creational.factory.code;

class EnemyShipFactoryKt {
    fun makeEnemyShip(shipType: String): EnemyShipKt? = when (shipType) {
        "U" -> UFOEnemyShipKt()
        "R" -> RocketEnemyShipKt()
        "B" -> BigUFOEnemyShipKt()
        else -> null // or throw exception
    }
}
