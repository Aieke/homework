import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class BasicsSpec2 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("collections") {
            val numbers = arrayListOf(1,2,-3,6)

            it("") {

                numbers shouldContain 2

                count2(numbers) shouldBe 6
            }
        }
    }
})
fun count2(list: ArrayList<Int>): Int {
    var sum = 0
    for (i in list) {
        sum += i
    }
    return sum
}