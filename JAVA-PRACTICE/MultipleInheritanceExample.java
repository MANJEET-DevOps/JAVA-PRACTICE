interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Implementing methodA from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Implementing methodB from Interface B");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
