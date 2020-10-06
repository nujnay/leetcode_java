package javastudy

fun main() {
    for (i in iterator<Int> {
        print(1)
        this.yield(2)
        print(3)
        this.yield(4)
    }) {
        print(i)
    }
}