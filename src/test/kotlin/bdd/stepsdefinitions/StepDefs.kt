package bdd.stepsdefinitions

import io.cucumber.java8.En
import io.cucumber.java8.PendingException

class StepDefs : En {
    init {
        Given("I have {int} cukes in my belly") { quantity: Int? ->
            throw PendingException()
        }

        When("I wait {int} hour") { time: Int? ->
            throw PendingException()
        }

        Then("my belly should growl") {
            throw PendingException()
        }
    }
}

