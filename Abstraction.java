/* Abstraction is the proccess of hiding internal implementation details and showing only the essential featuers of an object */

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