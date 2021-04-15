package collections

class Lists {
}

fun addSysUser(newUser: Int,list: MutableList<Int>) {
    list.add(newUser)
}

fun main() {
    val sysUsers: MutableList<Int> = mutableListOf(1, 2, 3)//mutable = changeable
    addSysUser(5,sysUsers)
    val otherList: List<Int> = sysUsers
    //addSysUser(6,otherList)
    println(sysUsers)

}