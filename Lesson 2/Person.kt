open class Person(
    open val name: String,
    open val surname: String,
    open val email: String,
    open val password: String
) {
    open fun info() {
        println("Name: $name $surname")
        println("Email: $email")
    }
}
