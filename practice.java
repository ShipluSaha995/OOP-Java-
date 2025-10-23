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
 