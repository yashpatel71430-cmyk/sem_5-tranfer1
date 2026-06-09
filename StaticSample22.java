class Study
{
    //static method or class method 
    static void greet()
    {
        System.out.println("Welcome user BCA");
    }
// non static method or instance method
    void message(String msg)
    {
        System.out.println( msg );
    }
}
public class StaticSample22 {
    public static void main(String[] args) {
        Study.greet();
        Study s1=new Study();
        s1.message("Good Day");
        s1.greet();
       // Study.message("hi");
    }
}