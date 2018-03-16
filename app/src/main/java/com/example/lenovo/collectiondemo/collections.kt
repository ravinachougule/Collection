package com.example.lenovo.collectiondemo

/**
 * Created by LENOVO on 15/03/2018.
 */



//List

fun list()
{
    println("List Demo:")
    val lst= arrayListOf<String>()
    lst.add("A")
    lst.add("B")
    lst.add("C")
    lst.add("A")
    lst.add("D")
    for(l in lst)
    {
        println("Element is:$l")
    }

    println("Using ForEach")
    lst.forEach{
        println("Element is:$it")
    }

    println("After adding element")
    lst.add(2,"E")
    lst.forEach{
        println("Element is:$it")
    }

    println("After removing element")
    lst.removeAt(1)
    lst.remove("D")
    lst.forEach{
        println("Element is:$it")
    }

    println("After removing all")
    lst.removeAll(lst)
}


//Map
fun map() {
    println("Map Demo")
    val mp = mapOf(
            1 to "aaa",
            2 to "bbb",
            3 to "ccc",
            4 to "ddd",
            5 to "bbb"
    )
    mp.forEach { (t, u) -> println("Key -$t Value-$u") }


    val m = hashMapOf<Int, String>()
    m[1] = "A"
    m[2] = "B"
    m[3] = "C"

    m.forEach({ (key, vals) -> println("Key -$key Value-$vals") })
}


//Set
fun set()
{
    println("Set demo")
    val st= hashSetOf<String>()
            st.add("Java")
            st.add("android")
            st.add("Cpp")
    st.forEach { println("Element is:$it") }
}

fun main(args: Array<String>) {
    list()
    map()
    set()
}