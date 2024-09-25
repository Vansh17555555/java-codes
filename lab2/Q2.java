public class Q2 {
    static class S{
        void ns(){
            System.out.println("Non-static method in static class");
        }
        static void sm(){
            System.out.println("Static method in static class");
        }
    }
    public static void main(String []a){
        S s=new S();
        s.ns();
        s.sm();
    }
}
