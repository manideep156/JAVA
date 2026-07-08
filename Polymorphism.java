public class Polymorphism {
    public static class InnerPolymorphism {
        void hello(){
            System.out.println("Hello from parent");
        }    
    }
    static class mani extends InnerPolymorphism{
        void hello(){
            System.out.println("Hello from child");
        }
        void hello1(){
            super.hello();
        }
    }
    public static void main(String[] args) {
        mani m = new mani();
        m.hello1();
        m.hello();
    }
}
