package Java程序设计上机实训;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Demo10_02_CloseWindow {
    private Frame f;
    private Button but;
    Demo10_02_CloseWindow(){
        init();
    }
    public void init(){
        f=new Frame("my frame");
        f.setBounds(300,100,400,300);
        f.setLayout(new FlowLayout());
        but=new Button("Close Window");
        f.add (but);
        myEvent();
        f.setVisible(true);
    }
    private void myEvent(){
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
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("单击按钮，退出窗体");
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new Demo10_02_CloseWindow();
    }
}
