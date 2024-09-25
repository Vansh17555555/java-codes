class Q1 {
    static int s=10;
    int ns=20;
    static void staticMethod(){
        System.out.println(s);
    }
    void nonStaticMethod(){
        System.out.println(s);
        System.out.println(ns);
    }
    public static void main(String []args){
        staticMethod();
        Q1 ob=new Q1();
        ob.nonStaticMethod();
    }
}