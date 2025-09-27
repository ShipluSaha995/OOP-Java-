public class Tester {
    String name;
    String id;
     public static void main (String[] args){

        //Class_name variable = new Class_name()
        Student s1=new Student();   //objects or instance
        Student s2=new Student();   //objects or instence
        s1.name="Bob";
        s1.id="11";
        s2.name="Mathew";
        s2.id="12";
       // int [] a1 = new int[4]; //array
        
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s2.id);  

    } 
}
