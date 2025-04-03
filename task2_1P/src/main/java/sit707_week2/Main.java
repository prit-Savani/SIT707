package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://supplier.meesho.com/panel/v3/new/root/login?redirect=%2Fpanel");
        SeleniumOperations.Office_choice_registration_page("https://in.tradingview.com/markets");
    }
}
