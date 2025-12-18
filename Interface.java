/*
An interface in java is a reference type that defines a set of abstract methods that specify a contract 
for classes to follow.

*/

/*
key points
1. contains Abstract methods 
2. A class that implements the interface must provide the method implementation
3. Supports multiple inheritance 
4. Used to define capabilities, standard or behaviors across unrelateed classes.

Interfaces are used :
1. To enforce common behavior
2. To support polymorphism
3. To reduce tight coupling
4. To achieve multiple abstraction
5. To achieve loose coupling

*/

/*interface Camera{
    void takePhoto();
}

interface MediaPlayer{
    void PlayMusic();
}

class Mobile implements Camera, MediaPlayer{
    public void takePhoto(){
        System.out.println("Taking Photo");
    }

    public void PlayMusic(){
        System.out.println("Playing Music");
    }
}

public class Interface{
    public static void main(String[] args) {
        Mobile M = new Mobile();
        M.PlayMusic();
        M.takePhoto();
    }
}*/


interface Camera{
    void takePhoto();
}

interface Wifi{
    void connect();
}

class Device{
    void power(){
        System.out.println("Power on");
    }
}

class SmartDevice extends Device{
    void assistant(){
        System.out.println("Voice Assistant.");
    }
}

class Phone extends SmartDevice implements Camera, Wifi{
    @Override
    public void takePhoto(){
        System.out.println("Taking Photo.");
    }

    @Override
    public void connect(){
        System.out.println("Connected to the Wifi.");
    }
}

public class Interface{
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.power();
        ph.assistant();
        ph.connect();
        ph.takePhoto();
    }
}
