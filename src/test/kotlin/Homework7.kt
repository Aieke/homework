import io.kotlintest.*
import io.kotlintest.matchers.beLessThan
import io.kotlintest.specs.DescribeSpec



class BasicsSpec8 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("sum of binary numbers") {
            val input0 = "1010"
            val input1 = "10"
            println(addBinary(input0, input1))
            it("should not be less than zero") {
                addBinary(input0, input1) shouldNotBe beLessThan("0")
            }
            it("making swap two numbers") {
                swapNumbers() shouldBe true
            }

        }



}
})

fun addBinary(input0:String,input1:String): String {
    // The two input Strings, containing the binary representation of the two values:
    //val input0 = "1010"
    //val input1 = "10"

    // Use as radix 2 because it's binary
    val number0 = Integer.parseInt(input0, 2)
    val number1 = Integer.parseInt(input1, 2)

    val sum = number0 + number1
    return Integer.toBinaryString(sum) //returns the answer as a binary value;
}
fun swapNumbers():Boolean{
    var x=10
    var y=5
    x=x+y
    y=x-y
    x=x-y
    println("After swapping: x=$x y=$y")
    return true


    return false


}