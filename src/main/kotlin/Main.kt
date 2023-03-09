fun main() {
 var benz= Car("bg","subaru","blue",50)
   benz.carry(40)
    benz.carry(60)

    benz.model
    benz.make
    benz.color
    benz.capacity


}
class Car (var make:String,var model:String,var color:String,var capacity:Int){
 fun carry(people:Int) {
  if (people <= capacity) {
       println("carrying $people passengers")
  } else {
        var x = people - capacity
       println(x)
          }
//prints out the color
    fun identity() {
        println("Iam a $color $make  $model")
    }


     fun calculateparkingFees(Hours:Int):Int{
       var parkingFees = Hours * 20
    return parkingFees
    }

    fun model() {
        println(model)
    }
fun  make(){
    println(make)
}
//    prints out the capacity
    fun capacity(){
        println(capacity)
    }
//    prints out the color
    fun color(){
        println(color)
    }

   }
  class Bus ( make:String, model:String,color:String,capacity: Int, var fare :Double){


  }  }
