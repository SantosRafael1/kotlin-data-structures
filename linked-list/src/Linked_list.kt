import java.util.*

fun main() {
    val list = LinkedList<Int> ()

    list.add(2)
    list.add(9)
    list.addFirst(5) //Adiciondo no começo da lista
    list.add(1)
    list.add(6)
    list.addLast(12)
    list.addLast(13) // adiciona no final

    println(list)

    println(list.contains(14)) //Verifica se um elemento existe

    val cloneList = list.clone() //clone() faz uma cópia da lista
    println(cloneList)

    println(list.peekFirst()) // retorna o primeiro elemento
    println(list.peekLast()) // retorna o último elemento

    list.clear() // Remove todos os elementos da lista
    println(list)

    println(list.isEmpty()) // verifica se a lista está vazia

}