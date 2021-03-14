fun main(){
    val school = "akirachix"
    println(school[0])
    println(school[2])
    println(school[4])
    var name = "Beldine"
    var age = 21
    println("my name is $name and I am $age years old")
    me()
    Neema("Beldine")
    Neema("good")


}
fun school(school:String){
    var school = "akirichix"
    println(school)
}
fun girl(name:String,age:Int){
    var girl= "my name is $name and I am $age years old"
    println(girl)
}
fun me(){
    var me = "composition"
    println(me.length)
}
fun Neema(name:String){
    if(name=="Beldine"){
        println("thats me!")
        }
    else{
        println("i don't know  who that is")
    }
}