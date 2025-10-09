/*Encupsulation: Encupsulation is the machanism tha binds together code and the data it manipulates and 
keep both safe from outside interference and misuse 
It is often called “data hiding.”
*/

class Details {
    private String name;
    private int id;
    private String dept;

    public void setName(String name){ //setter method
        this.name=name;
    }

    public String getName(){ //getter method
        return name;
    }

    public void setId(int id){ //setter method
        this.id=id;
    }

    public int getId(){  //getter method
        return id;
    }

    public void setDept(String dept){ //setter method
        this.dept=dept;
    }

    public String getDept(){  //getter method
        return dept;
    }

    void display(){
        System.out.println("Name: "+name+"\n"+"Id: "+id+"\n"+"Department: "+dept+"\n");
    }
}

public class Encupsulation{
    public static void main(String[] args){
        Details d= new Details();
        d.setName("Alice");
        d.setId(024);
        d.setDept("AIDS");
        
        d.display();
    }
}
