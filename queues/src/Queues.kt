import java.util.*

fun main() {
    //A classe Queue é uma interface, não pode ser instanciada. Portanto instaciamos a classe LinkedList
    //val myQueue = Queue<String>()

    val myQueue = LinkedList<String> ()

    //enqueue (adicionar) elemento
    myQueue.offer("People 1")
    myQueue.offer("People 2")
    myQueue.offer("People 3")
    myQueue.offer("People 4")
    myQueue.offer("People 5")

    //Pegar o elemento que está na primeira posição (People 1)
    println(myQueue.peek())

    //Remover o elemento que está no topo (People 1)
    myQueue.poll()
    println(myQueue.peek()) //(People 2) já que agora este é o topo da fila

    //Retornar o tamanho da fila
    println(myQueue.size)

    //Verifica se um elemento existe na fila
    println(myQueue.contains("People 6")) //Retorna um booleano
}