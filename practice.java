/*Implement multiple inheritanece. 3 classes A,B,C and Class C inherits both A and B

interface A{
    void code();
}

interface B{
    void language();
}

class C implements A, B{
    public void code(){
        System.out.println("code with");
    }

    public void language(){
        System.out.println("Java");
    }
}

public class practice{
    public static void main(String[] args) {
        C java = new C();
        java.code();
        java.language();
    }

}
*/

//Try various combination of public, private, protected in the given code and verify if it satisfies the table in table 1

class A{
    public int pub=10;
    private int pri=20;
    protected int pro=30;
    int var=40;  

    public void publicMethod(){
        System.out.println("public");
    }

    private void privateMethod(){
        System.out.println("private");
    }

    protected void protectedMethod(){
        System.out.println("Protected");
    }

    public void de(){    
        System.out.println(pri);
    }
}

class B{
    public int pub2=100;
    private int pri2=200;
    protected int pro2=300;

    public void publicMethod2(){
        System.out.println("public 2");
    }

    private void privateMethod2(){
        System.out.println("private 2");
    }

    protected void protectedMethod2(){
        System.out.println("Protected 2");
    } 

    public void showPrivateB() { 
        System.out.println(pri2);
        privateMethod2();  
    }
}

class C extends A {
    B b = new B();
    public void Members(){
        System.out.println(pub);        //accessible (public)
     //  ERROR (private)
        System.out.println(pro);       // protected, accessible in subclass
        System.out.println(var);       //  default, same package

        de();                          //  accesses A's private via public method

        System.out.println(b.pub2);    // public
        
        // if in same package (yes, here they are)
        b.protectedMethod2();         //  accessible (same package)
        b.showPrivateB();             //  accesses private of B internally
    }
}

public class practice{
    public static void main(String[] args) {
        C c = new C();
        c.Members();

        System.out.println("Access A's public var: " + c.pub);
        c.publicMethod();
    }
}

