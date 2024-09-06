fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    //to uppercase() and tolowercase()
    var config = " Fullscreen shadows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen ?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on ?")
    println(config.contains("shadows"))
    println("Will shadows be turned off ?")
    println(config.contains("nosound"))
    println("Would the plyaer like to use autosave?")
    println(config.contains("autosave"))


    //replace()
    var strjava = "java is the best!"
    strjava = strjava.replace("java","kotlin")
    println(s)
    println("$strjava is ${strjava.length} characters long.")

    //substring()
    println("I would not banish all of these Internets.".substring(2,7))

    //comporeto()
    println("alpha".compareTo("bravo"))


}