
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec


class BasicsSpec5 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("unique letters") {
            val obj = GfG()
            val input = "AidosBa"
            it("comparing two strings") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("AidosBaiburin")) shouldBe false
            }
            it("comparing two same strings") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("AidosBa")) shouldNotBe false
            }
            it("comparing two  strings without camel case") {
                obj.uniqueCharacters(input).equals(obj.uniqueCharacters("Aidosba")) shouldNotBe false
            }
           

            if (obj.uniqueCharacters(input))
                println("The String $input has all unique characters")
            else
                println("The String $input has duplicate characters")


        }

}
})

internal class GfG {
    fun uniqueCharacters(str: String): Boolean {
        // If at any time we encounter 2 same
        // characters, return false
        for (i in 0 until str.length)
            for (j in i + 1 until str.length)
                if (str[i] == str[j])
                    return false

        // If no duplicate characters encountered,
        // return true
        return true
    }


}