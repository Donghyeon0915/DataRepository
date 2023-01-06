import java.util.*
import kotlin.math.pow

var r = 0
var c = 0

fun zSearch(x: Int, y: Int, size: Int): Int{
    var x = x; var y = y; var size = size;
    var start = 0
    
    while(size > 1){
        size /= 2
        var area = size * size

        if(x + size <= r && y + size <= c) { start += 3 * area; x += size; y += size; }
        else if (x + size <= r && y <= c) { start += 2 * area; x += size; }
        else if (x <= r && y + size <= c) { start += area; y += size; }
    }

    return start
}

fun main(args: Array<String>) {

    var sc: Scanner = Scanner(System.`in`)

    var N = sc.nextInt()
    r = sc.nextInt()
    c = sc.nextInt()

    println(zSearch(0,0, 2.toDouble().pow(N.toDouble()).toInt()))
}