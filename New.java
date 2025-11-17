/*import javax.swing.*;

public class New{
    public static void main(String[] args){
        JFrame j= new JFrame("My Swing Application");

        j.setLayout(null);
        j.setSize(400,400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}*/

//we can also sue swing in a constuctor
/*import javax.swing.*;

class MyWindow{
    MyWindow(){
        JFrame j = new JFrame("My Swing Application");
        j.setLayout(null);
        j.setSize(400, 400);
        j.setVisible(true);
    }
}

public class New{
    public static void main(String[] args){
        MyWindow myWindow = new MyWindow();
    
    }
}*/

import javax.swing.*;

class MyWindow extends JFrame{
    MyWindow(){
        setTitle("My Swing Application");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }
}

public class New{
    public static void main(String[] args){
        MyWindow myWindow = new MyWindow();
    
    }
}

