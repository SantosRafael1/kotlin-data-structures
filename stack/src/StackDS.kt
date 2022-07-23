import java.util.*

fun main() {
    val myStack = Stack<String> ()

    //Fazendo push
    myStack.push("Kotlin")
    myStack.push("Java")
    myStack.push("C++")
    myStack.push("JavaScript")

    //pop() removerá o último elemento que foi adicionado
    myStack.pop() //remove JavaScript devido a regra LIFO

    println(myStack) //print stack

    //Verificando se a stack está vazia
    println(myStack.isEmpty())

    //Pegar o último elemento adicionado
    println("Top element: ${myStack.peek()}")

    //Fazer uma busca na stack
    val searchPosition: Int = myStack.search("C++") //encontra na posição 1 já que C++ está no topo
    if(searchPosition < 0) {
        println("Not found 404")
    } else {
        println("Item encontrado na posição: ${searchPosition}")
    }
}