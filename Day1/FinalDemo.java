public class FinalDemo {
    static final String var1="var1";// final is a keyword to make constant
    static String var2="var2";
    static final String var3;
    static{
        var3="var3";
    }
    public static void main(String[] args) {
        var2="hello";
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

}