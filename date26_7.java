public class date26_7{
    /**
     * @param args
     */
    public static void main(String[] args) {
        child c = new child();
        c.print();
    }
}
class Grandparent {
    protected void print()
    {
        System.out.println("Class 26_7 called");
    }

    
}
 class Parent extends Grandparent{
    protected void print()
    {
        super.print();
        System.out.println("Class Parent called");
    }
}
 class child extends Parent{
    protected void print()
    {
        super.print();
        System.out.println("Class Child called");
    }
    
}