fun main(args : Array<String>) {
    var (a,b)=readLine()!!.split(' ')
    var c= maxNum(a.toInt(), b.toInt())
    println("Самое максимальное число это - $c")
    }

fun maxNum(a:Int,b:Int):Int{
    var max = if (a <= b) {
        println("Максимальное число это b и это число - $b");
        b
    } else {
        println("Максимальное число это а и это число - $a");
        a
    }
    return max;
}

