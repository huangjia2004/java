package Java程序设计上机实训;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
public class Demo10_04_EventHandle {
    private Frame f;
    private TextField tf;
    private Button but,okBut;
    private TextArea ta;
    private Dialog d;
    Demo10_04_EventHandle(){
        init();
    }
    public void init(){
        f=new Frame ("my window");
        f.setBounds(300,100,600,500);
        f.setLayout(new FlowLayout());
        tf=new TextField(60);
        but=new Button("转到");
        ta=new TextArea(25,70);
        f.add (tf);
        f.add (but);
        f.add(ta);
        myEvent();
        f.setVisible(true);
    }
    private void myEvent(){
        tf.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    showDir();
            }
        });
        but.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                showDir();
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    private void errorEvent(){
        okBut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });
        d.addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e){
                d.setVisible(false);
            }
        });
    }
    private void showDir(){
        String dirPath=tf.getText();
        File dir=new File(dirPath);
        if(dir.exists()&& dir.isDirectory()){
            ta.setText("");
            String[] names=dir.list();
            for(String name : names){
                ta.append(name+"\r\n");
            }
        }
        else{
            d=new Dialog(f,"提示信息-self",true);
            d.setBounds(400,200,240,150);
            d.setLayout(new FlowLayout());
            Label lab=new Label();
            okBut=new Button("确定");
            d.add(lab);
            d.add(okBut);String info="您输入的信息:"+dirPath+"是错误的。请重输";
            lab.setText(info);
            errorEvent();
            d.setVisible(true);
        }
    }
    public static void main(String[] args){
        new Demo10_04_EventHandle();
    }
}
