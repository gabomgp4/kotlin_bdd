package bdd.stepsdefinitions

import bdd.RestaurantMenu
import bdd.RestaurantMenuItem
import io.cucumber.java8.En
import io.cucumber.java8.PendingException
import kotlin.test.assertTrue

class MenuManagementStep : En {
    private lateinit var restaurantMenu: RestaurantMenu
    private lateinit var newMenuItem: RestaurantMenuItem

    init {
        Given(
            "I have a menu item with name {string} and price \${int} dollars"
        ) { name: String, price: Int ->
            newMenuItem = RestaurantMenuItem(name, "", price)
        }

        When("I add that menu item") {
            restaurantMenu = RestaurantMenu()
            restaurantMenu.add(newMenuItem)
        }

        Then(
            "the menu item with name {string} should be added"
        ) { name: String ->
            assertTrue { restaurantMenu.menuItems.any { it.name == name } }
        }
    }
}