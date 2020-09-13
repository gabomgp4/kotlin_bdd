package bdd.stepsdefinitions

import io.cucumber.datatable.DataTable
import io.cucumber.java8.En
import io.cucumber.java8.PendingException

class DataTables : En {
    init {
        Given(
            "I placed an order for the following items"
        ) { dataTable: DataTable ->
            val buildData = dataTable.asMaps()
            val data = buildData.map { Item(
                it.getValue("ItemName"),
                it.getValue("Units").toInt(),
                it.getValue("UnitPrice").toFloat()) }
            println(data)
        }

        When("I generate the bill") {}

        Then("a bill for \${int} should be generated") { int1: Int? -> }

    }

    data class Item(val productName: String, val quantity: Int, val unitPrice: Float)
}