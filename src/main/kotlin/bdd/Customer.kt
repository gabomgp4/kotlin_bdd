package bdd

class Customer {
    var percent: Double = 0.0
    var billAmount: Double = 0.0
    val ammountCalculated: Double
        get() = (percent + 1) * billAmount
}
