class math
{
static void show()
{
System.out.println("Hello,yash!");
}
static void show(String st)
{
System.out.println("Hello"+st);
}
void check()
{
System.out.println("I am checking");
}
}

class StaticSample3
{
public static void main(String[]args)
{
math.show();
math.show("yash");
math m=new math();
m.check();
m.show();
m.show("yash patel");
}
}