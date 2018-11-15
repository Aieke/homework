
import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec





class BasicsSpec9 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("collections2") {
            var a=listOf(1,2,3,4)
            it("multiply by 2"){
            calculate(a) shouldBe arrayListOf(2,4,6,8)
            }
            it("checking size of collection") {
                a shouldHaveSize 4
            }
            it("checking whether array empty or not") {
                a.isNotEmpty() shouldBe true
            }
        }

    }
})
fun calculate(list:List<Int>):ArrayList<Int>{
    var list2:ArrayList<Int> = arrayListOf()
    list.forEach{
        list2.add(it*2)
        }
        return list2
}


