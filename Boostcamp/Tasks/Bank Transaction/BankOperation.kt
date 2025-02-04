fun main() {
    val abb = ABB()
    val birBank = BirBank()
    val rabiteBank = RabitəBank()

    abb.pay(100.0)
    birBank.voidTransaction("12345")
    rabiteBank.refund("67890")
}
