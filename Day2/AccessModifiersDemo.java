public class AccessModifiersDemo {
    private int privateVariable =10;//private is within class
    public int publicVariable= 20;
    int defaultVariable=30;// within the package
    protected int protectedVariable=40;
    private void accessPrivateVariable(){
        System.out.println("privateVariable="+privateVariable);
    }
    public void accessPublicVariable(){
        System.out.println("publicVariable="+publicVariable);
    }
    void accessDefaultVariable(){
        System.out.println("defaultVariable="+defaultVariable);
    }
    protected void accessProtectedVariable(){
        System.out.println("protectedVariable="+protectedVariable);
    }

}
class AccessModifierMain{
    public static void main(String[] args) {
        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
       // accessModifiersDemo.accessPrivateVariable();
        accessModifiersDemo.accessPublicVariable();
        accessModifiersDemo.accessDefaultVariable();
        accessModifiersDemo.accessProtectedVariable();
    }
}