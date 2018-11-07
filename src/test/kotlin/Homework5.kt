
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec



class BasicsSpec6 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("string rotation") {


            val str1 = "swiswsft"
            val str2 = "sftswisw"

            it("checking one string for rotation of another"){
            areRotations(str1,str2) shouldBe true
            }
            it("two strings rotation is not false") {
                areRotations(str1, str2) shouldNotBe false
            }
          //  if (areRotations(str1, str2))
            //    println("Strings are rotations of each other")
            //else
              //  System.out.printf("Strings are not rotations of each other")


    }

}
})



    fun areRotations(str1: String, str2: String): Boolean {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
       if(str1.length == str2.length && (str1 + str1).indexOf(str2) != -1){
            return true
        }
        return false

}
