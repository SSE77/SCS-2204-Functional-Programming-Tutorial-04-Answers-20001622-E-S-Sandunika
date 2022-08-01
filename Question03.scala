object uppercaselowercasechange
{
    def toUpper(text:String):String=
    {
        text.toUpperCase()
    } 

    def toLower(text:String):String=
    {
        text.toLowerCase()
    } 

    def formatNames(name:String)(indexlist:Int*)(function:String=>String):String=
    {
        if(indexlist.isEmpty)
        {
            return function(name)
        } 
        
        var temp=""
        var i=0 

        while(i<name.length())
        {
            if(indexlist.contains(i)) 
            {
                temp=temp+function(name.charAt(i).toString)
            } 
            else 
            {
                temp=temp+name.charAt(i).toString
            } 
            i=i+1
        }
        temp
    } 

    def main(args: Array[String]): Unit=
    {
        println("Output:")
        println("Benny --> "+formatNames("Benny")()(toUpper))
        println("Niroshan --> "+formatNames("Niroshan")(0,1)(toUpper)) 
        println("Saman --> "+formatNames("Saman")()(toLower))
        println("Kumara --> "+formatNames("Kumara")(5)(toUpper))

    }
}