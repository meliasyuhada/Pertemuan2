//Array Method

fun main() {
    //sort()
    val simpsonsA = arrayOf("Hakim", "Maryam", "Bella", "Lukman", "Laura")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("Hakim", "Maryam", "Bella", "Lukman", "Laura")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')

    //reverse() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Hakim", "Maryam", "Bella", "Lukman", "Laura")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexOf
    val simponsD = arrayOf("Hakim", "Maryam", "Bella", "Lukman", "Laura")
    val simpson = "Lukman"
    val position = simponsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpon!")
    }

    val simpsonsE = arrayOf("Hakim", "Maryam", "Bella", "Lukman", "Laura")
    println("simpsons size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = " + simpsonsE.minOrNull())
    println("Max = " + simpsonsE.maxOrNull())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())
    println(simpsonsE.contains("Maryam"))
}