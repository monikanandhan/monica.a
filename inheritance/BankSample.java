interface BankSample {
    float ROI();
}
class SBI implements BankSample
{
    public float ROI()
    {
        return 1.25f;
    }
}
class ICICI implements BankSample{
    public float ROI()
    {
        return 5.25f;
    }
}
class Canara implements BankSample{
    public float ROI()
    {
        return 8.25f;
    }
}
class SampleInterest
{
    public static void main(String args[])
    {
        BankSample s=new SBI();
        System.out.println(s.ROI()); 
        s=new ICICI();
        System.out.println(s.ROI()); 
        s=new Canara();
        System.out.println(s.ROI()); 
    }
}