import java.util.*

fun main() {
    // строчный комментарий
    /*
    Многострочные комментарии
     */
    println("Hello World!")
    val a = 100 // value - immutable variable
    println(a::class)
    a = 200
    var b = 200 // variable - mutable
    b = 300

    val a1: Byte = -10
    val a2: Short = 45
    var c1: Int = - 250
    val d1: Long = 3000L

    val h: Double = 4.5
    val f: Float = 4.5F

    val flag: Boolean = true
    val ch: Char = 'A'

    val name = "Ivan"
    val sec_name = "Ivanov"

    c1 = d1.toInt()
    println("$name $sec_name")

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    val x2 = 11
    val y2 = 5.0
    val z2 = x2/y2 // 2.2

    // % - остаток от деления

    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    //....

    val y = readLine()?.toInt()
    val yy = readln().toInt()

    val(p1,p2) = readln().split(" ").map { it.toInt() }

    var str: String = "abc"
    str = null

    var str2: String? = "abc"
    str2 = null

    val l = if(str2 != null) str2.length else 0
    println(str2?.length) // ?. - оператор безопасного вызова

    val l2 = str2?.length ?: -1 // elvis expression
    println(l2)

    var w1 = 5     // 6
    var w2 = ++w1  // 6

    var w3 = 5      //6
    var w4 = w3++   //5

    val g = 10
    if(g == 10) {
        //
    } else if(g != 8) {
        // ...
    } else {

    }

    var s = 10
    var p = 20
    var result = if(s > p) {
        println("s>p")
        s
    } else {
        println("...")
        p
    }

    // < > != ==
    // тип логической операции in

    var q = 5
    var r1 = q in 1..6 // [1,6] - true
    var r2 = q !in 10 downTo 1

    when(flag) {
        true -> {
            // что-то делать
        }
        false -> {
            // другое
        }
        else -> println()
    }

    val m = 10
    when(m) {
        10,20,30 -> println("Or")
        else -> println()
    }
    when(m) {
        in 10..19 -> println()
        in 20..29 -> println()
        !in 10..20 -> println()
    }
    val j = 10
    val i = 5
    val r = 23
    when(j+r) {
        i-r -> println("i-r")
        i+100 -> println("")
    }

    val sum = 1000
    val rate = when (sum) {
        in 100..999 -> 10
        in 1000..10000->15
        else -> 20
    }
    val k1 = 15
    val k2 = 6
    when {
        (k1>10) -> println()
        (k2>5) -> {
            // ...
        }
    }
    when(val kk = k1+k2) {
        10 -> println()
        20 -> {
            // ...
        }
    }
}