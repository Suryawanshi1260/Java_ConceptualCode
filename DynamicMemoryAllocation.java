import java.util.Scanner;

class DynamicMemoryAllocation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter number of elements : ");
        Size = sobj.nextInt();

        // Dynamic memory allocation
        float Marks[] = new float[Size];
        
        // Use the memory

        Marks = null;
        System.gc();
    }
}
