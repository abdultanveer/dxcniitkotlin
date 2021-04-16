package namedarguments


class NamedArgs {
}
data class format(val userName: String,val domain: String)
fun main() {
    println(format("abdul","example.com"))
    println(format("mydomain.com","ansari"));
    println(format(userName = "ansari",domain = "domain.com"))
}