object calculateinterest
{
    def interest(amount:Int):Double=        
    {
        if((0<amount) && (amount<20000))
        {
            amount*0.02
        } 
        else if((20000<=amount) && (amount<200000))
        {
            amount*0.04
        } 
        else if((200000<=amount) && (amount<2000000))
        {
            amount*0.035
        } 
        else
        {
            amount*0.065
        }
    }

    def main(args: Array[String]):Unit = 
    {
        printf("The total interest:Rs.%.2f", interest(10000))
    } 
}