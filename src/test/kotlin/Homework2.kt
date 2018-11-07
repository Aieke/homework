import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec
import java.util.*

class BasicsSpec3 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("sorting") {
            val arr1 = intArrayOf(3, 5, -2, 1, -3)
            val arr2 = intArrayOf(3, 5, -2, 1, -3)
            val arr3 = intArrayOf(4,8,6,4,5)
            val arr4 = intArrayOf(1,2,3,4,5)

            it("") {
               bubbleSort(arr1) shouldBe false
                bubbleSort(arr2) shouldBe true
                bubbleSort(arr3) shouldBe false
                bubbleSort(arr4) shouldBe true
            }
        }
    }
})


 fun bubbleSort(arr: IntArray):Boolean
{
    var tlist:IntArray=arr.copyOf()
    var bool=false
    val n = arr.size
    var temp = 0
    for (i in 0 until n) {
        for (j in 1 until n - i) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            }
        }
    }
    bool=Arrays.toString(arr).equals(Arrays.toString(tlist),true)
    return bool
}