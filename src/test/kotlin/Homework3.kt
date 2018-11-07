import com.sun.javafx.collections.ArrayListenerHelper
import io.kotlintest.matchers.collections.shouldBeLargerThan
import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.matchers.collections.shouldEndWith
import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.matchers.types.shouldBeInstanceOf
import io.kotlintest.matchers.types.shouldNotBeInstanceOf
import io.kotlintest.shouldBe
import io.kotlintest.shouldNot
import io.kotlintest.shouldNotBe
import io.kotlintest.shouldNotHave
import io.kotlintest.specs.DescribeSpec
import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList

class BasicsSpec4 : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("Polymorphism") {
            val currentTasks:ArrayList<String> = arrayListOf("1","2","3","4","5","6","7","8")
            val listtest:ArrayList<String> = arrayListOf("1", "2", "3")
            val qaTester=QA("Tester","QA1")
            qaTester.work(2)
            qaTester.work(7)

            it("to days"){
                qaTester.releaseTesting(2,currentTasks) shouldBe false}
            it("it does in 5 days"){
                qaTester.releaseTesting(5,currentTasks) shouldBe true}
            it("we must work on time"){
                qaTester.releaseTesting(4,currentTasks) shouldNotBe false}
            it (""){
                currentTasks shouldHaveSize 8}
            it("currenttasks must be larger than all"){
                currentTasks shouldBeLargerThan listtest}
            it ("days not null"){
                qaTester.releaseTesting(4,currentTasks) shouldNotBe null

            }




                val dev=Developer("Aidos","Dev")
                dev.work(4,currentTasks)
                dev.work(5,currentTasks)
        }
    }
})
open class Engineer(name:String,department:String){

open fun work(capscity:Int){

}

    open fun work(capacity: Int, list: ArrayList<String>) {}
}
class QA(name:String,department:String):Engineer(name,department){

    fun releaseTesting(days:Int,currentTasks:ArrayList<String>):Boolean{
        var bool:Boolean
        if(days>=currentTasks.size/2){
            return true
        }
        return false
    }
    override fun work(capacity:Int,currentTasks: ArrayList<String>){

        for(i in 1..capacity) {
            currentTasks.remove("string")
        }


    }


}
class Developer(name:String,department: String):Engineer(name,department){




    override fun work(capacity: Int,currentTasks:  ArrayList<String>){

        for(i in 1..capacity) {
            currentTasks.add("string")
        }
    }
}