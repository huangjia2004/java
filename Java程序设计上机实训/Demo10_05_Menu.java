package Java程序设计上机实训;
import java.awt.*;
import java.awt.event.*;
public class Demo10_05_Menu {
    private Frame f;
    private MenuBar mb;
    private Menu m,subMenu;
    private MenuItem closeItem,subItem;
    Demo10_05_Menu(){
        init();
    }
    public void init(){
        f=new Frame("my windows");
        f.setBounds(300,100,40,300);
        f.setLayout(new FlowLayout());
        mb=new MenuBar();
        m=new Menu("file");
        subMenu=new Menu("submenu");
        subItem=new MenuItem("subitem");
        closeItem=new Menu("close");
        subMenu.add(subItem);
        m.add(subMenu);
        m.add(closeItem);
        mb.add(m);
        f.setMenuBar(mb);
        myEvent();
        f.setVisible(true);
    }
    private void myEvent(){
        closeItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Demo10_05_Menu();
    }
}
