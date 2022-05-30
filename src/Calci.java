
public class Calci {
    public static void main(String[] args) {
//calculator operation

        float adn=add((float) 5.2, (float) 6.3);

        System.out.println("addition: " +adn);

        int sub=minus(10,6);
        System.out.println("subtraction:"+sub);

        int mul=multi(5,5);
        System.out.println("product:"+mul);

        int div=div(30,5);
        System.out.println("division:"+div);

        int rem=rem(30,7);
        System.out.println("reminder:"+rem);


    }


    private static float add(float a, float b)
    {
        float sum;
        sum=a+b;
        return sum;
    }
    public static int minus(int a,int b)
    {
        int sub=a-b;
        return sub;
    }
    public static int multi(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    private static int div(int a,int b)
    {
        int divn=a/b;
        return divn;
    }
    public static int rem(int a,int b)
    {
        int rem=a%b;
        return rem;
    }
}
