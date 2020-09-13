package bdd

class RestaurantMenu {
    val menuItems = ArrayList<RestaurantMenuItem>()

    fun add(newMenuItem: RestaurantMenuItem) {
        menuItems.add(newMenuItem)
    }
}
