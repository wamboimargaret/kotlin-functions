fun main(){
    greet("Megan")
    greet("flo")

    var a = div(10, 3)
    println(a)
    var b = div(17,4)
    println(b)

    var c = add(50,40,3,20)
    println(c)
    var d = add(5,7,10,50)
    println(d)

    facts("I love doing accents.")
    facts("I can bake cakes")

}

    //Question 1
fun greet(name:String){
println("Hello, $name")


}
    //Question 2
fun div(num1:Int,num2:Int): Int {
    var modulus = num1 % num2
    return modulus
}

    //Question 3
fun add(numb1: Int,numb2: Int,numb3: Int,numb4: Int) :Int {
    var addition = numb1 + numb2 + numb3 + numb4
    return addition
}
    //Question 4
fun facts(fact: String){
    println("One thing about me is that, $fact")

}
