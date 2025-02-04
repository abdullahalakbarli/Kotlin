data class Student(
    override var name: String,
    override var surname: String,
    override var email: String,
    override var password: String,
    var grade: Int
) : Person(name, surname, email, password) {

    override fun info() {
        println("I am a Student")
        println("Student Info:")
        println("Name: $name $surname")
        println("Email: $email")
        println("Grade: $grade")
    }
}
