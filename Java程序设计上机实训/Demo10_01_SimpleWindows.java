package Java程序设计上机实训;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
public class Demo10_01_SimpleWindows{
    public static void main(String[] args){
        JFrame f=new JFrame("my awt");
        f.setSize(500,400);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());
        Button b=new Button("I'm a button");
        f.add(b);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("关闭窗体");
                System.exit(0);
            }
            public void windowActivated(WindowEvent e){
                System.out.println("活动窗体");
            }
            public void windowOpened(WindowEvent e){
                System.out.println("打开窗体");
            }
        });
        f.setVisible(true);
    }
}
