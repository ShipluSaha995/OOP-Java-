/* Abstraction is the proccess of hiding internal implementation details and showing only the essential featuers of an object 
 
Abstraction reduces complexity by hiding unnecessary details.

Achieved in Java through:

Abstract Classes

Interfaces

Abstract classes can have:

Abstract methods (without body)

Concrete methods (with body)

Abstract methods must be overridden in the subclass.

Cannot create objects of abstract classes.

Interfaces provide 100% abstraction.

*/

abstract class Faculty{
    String degree;
    int experience;


    Faculty(){
        experience=0;
        degree="Unknown";
    }

    abstract void teach();
}

class ChairPerson extends Faculty{
    ChairPerson(){
        experience=20;
        degree="Phd";
    }

    @Override
    void teach(){
        System.out.println("Chair-person teaching.");
    }
}

class ProgramCordinator extends Faculty{
    ProgramCordinator(){
        experience=10;
        degree="Masters";
    }

    @Override
    void teach(){
        System.out.println("Program Co-ordinator Teaching.");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Faculty fac1 = new ChairPerson();
        Faculty fac2 = new ProgramCordinator();
        ChairPerson chair = new ChairPerson();

        fac1.teach();
        fac2.teach();
        chair.teach();
    }
}

