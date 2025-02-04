data class Teacher(
    override var name: String,
    var salary: Int,
    override var surname: String,
    override var email: String,
    override var password: String,
    var subject: String
) : Person(name, surname, email, password) {

    override fun info() {
        println("Teacher Info:")
        println("Name: $name $surname")
        println("Email: $email")
        println("Subject: $subject")
        println("Salary: $$salary")
    }
}
