class Addition{
    void add(int a, int b){
        System.out.println("Adding"+"=" +(a+b));
    }
}
class Subtraction{
    void subtract(int a, int b){
        System.out.println("Subtracting" +"=" +(a-b));
    }
}
class Multiplication{
    void multiple(int a, int b){
        System.out.println("Multiplication" +"=" +(a*b));
    }
}

public class Calculation {
    public static void main(String[] args) {
        int a=52;
        int b= 21;
        Addition c = new Addition();
        c.add(a,b);
        Subtraction d= new Subtraction();
        d.subtract(a, b);
        Multiplication e = new Multiplication();
        e.multiple(a,b);
    }
    
}
