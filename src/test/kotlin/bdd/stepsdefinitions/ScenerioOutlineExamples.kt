package bdd.stepsdefinitions

import bdd.Customer
import io.cucumber.java8.En
import io.cucumber.java8.PendingException
import kotlin.test.assertEquals

class ScenerioOutlineExamples : En {
    private lateinit var customer: Customer

    init {
        Given("I have a custumer") { customer = Customer() }

        Given("user enters initial bill ammount as {double}") { billAmmount: Double ->
            customer.billAmount = billAmmount
        }

        Given("sales tax rate is {double} percent") { percent: Double ->
            customer.percent = percent / 100
        }

        Then("final bill ammount calculated is {double}") { ammountCalculated: Double ->
            assertEquals(ammountCalculated, customer.ammountCalculated)
        }
    }
}