interface Bank
{
    public void showinterest();
}
class SBI implements Bank
{
    public void showinterest()
    {
        System.out.println("Rate of interest = @11%");
    }
}
class PNB implements Bank
{
    public void showinterest()
    {
        System.out.println("Rate of interest = @12%");
    }
}
class AXIS implements Bank
{
    public void showinterest()
    {
        System.out.println("Rate of interest = @13%");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Bank bk;
        bk=new SBI();
        bk.showinterest();
        bk=new PNB();
        bk.showinterest();
        bk=new AXIS();
        bk.showinterest();
    }
}
