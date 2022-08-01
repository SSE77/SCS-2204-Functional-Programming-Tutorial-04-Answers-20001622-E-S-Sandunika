object patternmatching 
{   
    def patternmatch(value:Int):Unit=value match
    {   
        case value if value<=0 => println("Negative/Zero.")
        case value if value%2==0 => println("Even number.")
        case value if value%2==1 => println("Odd number.") 
    } 

    def main(args: Array[String]):Unit= 
    {   
        println("Enter the number you want:")
        var number=scala.io.StdIn.readInt()
        patternmatch(number)
    }
}