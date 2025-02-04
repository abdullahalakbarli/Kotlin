interface BankOperation {
    fun pay(amount: Double)
    fun voidTransaction(rrn: String)
    fun refund(rrn: String)
}
