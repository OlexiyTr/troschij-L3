package com.example.exework

fun main(){
    val person1 = Person_("Ivan",40)
    val person2 = Person_("Vlad",31)
    val person3 = Person_("Petr",25)
    val person4 = Person_("Gena",47)
    val person5 = Person_("Glad",54)
    val person6 = Person_("Alexei",12)
    val person7 = Person_("Vova",43)
    val person8 = Person_("Bob",65)

    val listOfPersons = mapOf(
            Pair(person1,person1.name),
            Pair(person2,person2.name),
            Pair(person3,person3.name),
            Pair(person4,person4.name),
            Pair(person5,person5.name),
            Pair(person6,person6.name),
            Pair(person7,person7.name),
            Pair(person8,person8.name)
    )
    println(listOfPersons.keys)
    val sortedList = listOfPersons.toSortedMap(compareBy<Person_>{it.age})
    println(sortedList.keys)
}

data class Person_(val name : String, val age : Int)