fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(list) // Output: [1, 2, 3, 4, 5] (Original list unchanged)
    println(filteredList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val filteredMap = map.filterValues { it % 2 != 0 }
    println(map) // Output: {a=1, b=2, c=3} (Original map unchanged)
    println(filteredMap) // Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = set.filter { it % 2 != 0 }
    println(set) // Output: [1, 2, 3, 4, 5] (Original set unchanged)
    println(filteredSet) // Output: [1, 3, 5]
} 