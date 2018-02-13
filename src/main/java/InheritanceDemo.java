
class AddFunc
{
    public int add(int a, int b)
    {
        //System.out.println(a+b);
        return a+b;
    }
}
class SubFunc extends AddFunc
{
    public void sub(long i,long j)
    {
        System.out.println(i-j);
    }
}
class MulFunc extends SubFunc
{
    public void pro(int x,int y)
    {
        System.out.println(x*y);
    }
}
 //Check for Is a relationship
public class InheritanceDemo
{
    public static void main(String[] args)
    {
      //AddFunc obj = new AddFunc();

        MulFunc func = new MulFunc();
       // System.out.println(obj.add(2,8));

        SubFunc obj1 = new SubFunc();
        obj1.sub(1111,999);
        System.out.println(obj1.add(22,88));

        func.pro(25,1);
        System.out.println(func.add(3,11));
        func.sub(2,1);

    }
}
