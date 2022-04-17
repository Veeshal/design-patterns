package sample.creational.factory;

import sample.creational.factory.code.EnemyShipFactoryKt
import sample.creational.factory.code.EnemyShipKt

fun main() {
    val factor = EnemyShipFactoryKt()
    println(
        """
            Hello World
                        
            What type of ship? 
            U - UFO 
            R - Rocket
            B - Big UFO
        """.trimIndent()
    )
    readLine()?.let { input ->
        factor.makeEnemyShip(input)?.let { ship ->
            doEnemyStuff(ship)
        }
    }
}

fun doEnemyStuff(ship: EnemyShipKt) {
    ship.apply {
        displayEnemyShip()
        followHeroShip()
        enemyShipShoots()
    }
}