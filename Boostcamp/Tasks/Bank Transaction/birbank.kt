class BirBank : BankOperation {
    override fun pay(amount: Double) {
        println("BirBank ilə $amount AZN ödəniş edilir....")
    }

    override fun voidTransaction(rrn: String) {
        println("BirBank ilə ödənilmiş $rrn ləğv edilir.....")
    }

    override fun refund(rrn: String) {
        println("BirBank müştəriyə $rrn geri ödəniş edir....")
    }
}
