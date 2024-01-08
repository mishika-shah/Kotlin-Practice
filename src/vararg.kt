fun main(args:Array<String>)
{
    println(sum(5,6,7,5,6,4,2,45,7))

}

fun sum(vararg numbers : Int): Int
{
    var result = 0
    for(number in numbers) {
        result += number
    }
    return result
}
