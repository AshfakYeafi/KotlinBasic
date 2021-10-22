fun main(args: Array<String>)
{
    var a1 = Alien()
    a1.skills = "Java"
    a1.show()

    var a2 = Alien()
    a2.skills = "SQL"
    a2.show()

//    var a3 = a1 plus a2
    var a3 = a1 + a2
    a3.show()
}

//infix fun Alien.plus(a : Alien) : Alien
operator infix fun Alien.plus(a : Alien) : Alien
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}


class Alien
{

    var skills : String? = null
    fun show()
    {
        println(skills)
    }

}