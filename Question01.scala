object calculateinterest
{
    def interest(amount:Int):Double=        //amount match
    {
        /*case amount if amount<0 => amount*0
        case amount if amount<20000 => amount*0.02
        case amount if amount<200000 => amount*0.04
        case amount if amount<2000000 => amount*0.035
        case amount if amount>=2000000 => amount*0.065*/
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