class M{
    class A{
    void msg1(){
        System.out.println("Hello");
    }
    }

    class B{
        void msg2(){
            System.out.println("Welcome");
        }
    }
}

class Inheritane extends M {
    public static void main(String[] args) {
        Inheritane mainobj = new Inheritane();
         A objA = mainobj.new A();
         B objB = mainobj.new B();

         objA.msg1();
         objB.msg2();

    }
    
}
