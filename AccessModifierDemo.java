class Demo
{
    public int i;
    private int j;
    protected int k;

    public Demo()
    {
        i = 10;
        j = 20;
        k = 30;
    }

    public void display()
    {
        System.out.println("Value of i : " + i);
        System.out.println("Value of j : " + j);
        System.out.println("Value of k : " + k);
    }
}

public class AccessModifierDemo
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo();

        dobj.display();

        System.out.println("Public i : " + dobj.i);

        // System.out.println(dobj.j); // Not allowed

        System.out.println("Protected k : " + dobj.k);
    }
}
