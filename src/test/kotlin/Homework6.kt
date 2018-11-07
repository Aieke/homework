import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec



class BasicsSpec7 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("palindrome") {
            it("first is mustn't be a palindrome"){
            isPalindrome(122) shouldBe false}
            it("second must be a palindrome"){
            isPalindrome(117711) shouldBe true}
            it("negative number must not be a palindrome") {
            isPalindrome(-7887) shouldBe false
            }
        }

    }
})

fun isPalindrome(integer:Int):Boolean{
    val intStr = integer.toString()
    return intStr == StringBuilder(intStr).reverse().toString()
}




