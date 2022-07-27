import java.util.*

fun main() {
    var queue = PriorityQueue<String> ()

    queue.offer("C")
    queue.offer("D")
    queue.offer("A")
    queue.offer("E")
    queue.offer("B")

    //Enquanto a fila não estiver vazia, remova os elementos com maior prioridade
    while(!(queue.isEmpty())) {
        println(queue.poll())
    }

    println(queue) //Vazia

    var queue2 = PriorityQueue<Double> ()

    queue2.offer(2.3)
    queue2.offer(3.4)
    queue2.offer(1.2)
    queue2.offer(6.5)

    while(!(queue2.isEmpty())) {
        println(queue2.poll()) //Quanto menor o valor, maior a prioridade
    }

}