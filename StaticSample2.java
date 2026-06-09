class Test
{
    static int x;
static
{
    x++;
    System.out.println("I am a static block"+ x);
}
 
}

class StaticSample2
{
    public static void main(String[] args) {
      Test t1=new Test();
      Test t2=new Test();
      Test t3=new Test();
    }
}