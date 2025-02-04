class RabitəBank : BankOperation {
    override fun pay(amount: Double) {
        println("RabitəBank ilə $amount AZN ödəniş edilir....")
    }

    override fun voidTransaction(rrn: String) {
        println("RabitəBank ilə ödənilmiş $rrn ləğv edilir.....")
    }

    override fun refund(rrn: String) {
        println("RabitəBank müştəriyə $rrn geri ödəniş edir....")
    }
}
