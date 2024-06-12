import java.awt.*;
class Rectangle extends Frame
{
    Button b1,b2;
    Label lb1,lb2,lb3;
    TextField t1,t2,t3;

    public Rectangle()
    {
        setLayout(null);
        lb1=new Label("Length");
        lb2=new Label("Breadth");
        lb3=new Label("Area");

        t1=new TextField();
        t2=new TextField();
        t3=new TextField();

        b1=new Button("OK");
        b2=new Button("Cancel");

        lb1.setBounds(100,100,100,30);
        lb2.setBounds(100,150,100,30);
        lb3.setBounds(100,200,100,30);

        t1.setBounds(250,100,200,30);
        t2.setBounds(250,150,200,30);
        t3.setBounds(250,200,200,30);

        b1.setBounds(100,300,100,30);
        b2.setBounds(250,300,100,30);

        add(lb1);
        add(lb2);
        add(lb3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
    }
}

public class advance 
{
    public static void main(String[] args)
     {
        Rectangle rc=new Rectangle();
        rc.setSize(800,800);
        rc.setVisible(true);
    }
}
