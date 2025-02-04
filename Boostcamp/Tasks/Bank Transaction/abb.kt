class ABB : BankOperation {
    override fun pay(amount: Double) {
        println("ABB bank ilə $amount AZN ödəniş edilir....")
    }

    override fun voidTransaction(rrn: String) {
        println("ABB bank ilə ödənilmiş $rrn ləğv edilir.....")
    }

    override fun refund(rrn: String) {
        println("ABB bank müştəriyə $rrn geri ödəniş edir....")
    }
}
