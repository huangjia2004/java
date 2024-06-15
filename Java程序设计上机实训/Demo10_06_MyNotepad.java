package Java程序设计上机实训;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
public class Demo10_06_MyNotepad extends JFrame{
    JMenuBar mb=new JMenuBar();
    JMenu m1=new JMenu("file(F)");
    JMenuItem n=new JMenuItem("new");
    JMenuItem open=new JMenuItem("open(O)...ctrl+o");
    JMenuItem save=new JMenuItem("save(S)...ctrl+s");
    JMenuItem save_as=new JMenuItem("sava as(A)...ctrl+a");
    JMenuItem exit=new JMenuItem("exit");
    JMenu m2=new JMenu("edit(E)");//
    JMenuItem copy=new JMenuItem("copy(C)...ctrl+c");
    JMenuItem cut=new JMenuItem("shear(X)...ctrl+x");
    JMenuItem paste=new JMenuItem("paste(P)...ctrl+p");
    JMenu m3=new JMenu("format(O)");
    JMenu f1=new JMenu("font(F)");
    JMenuItem i11=new JMenuItem("Song typeface");
    JMenuItem i12=new JMenuItem("Regular script");
    JMenuItem i13=new JMenuItem("Blackbody");
    JMenu color=new JMenu("color(C)");
    JMenuItem i21=new JMenuItem("red");
    JMenuItem i22=new JMenuItem("blue");
    JMenuItem i23=new JMenuItem("green");
    JMenu m4=new JMenu("help(H)");
    JMenuItem about=new JMenuItem("about");
    JPopupMenu pm=new JPopupMenu();
    JMenuItem item1=new JMenuItem("copy");
    JMenuItem item2=new JMenuItem("shear");
    JMenuItem item3=new JMenuItem("paste");
    String string;
    Container container;
    JTextArea editor=new JTextArea(string);
    Font font=new Font("sanserif",Font.PLAIN,18);
    Demo10_06_MyNotepad(){
        super("My Noteoad");
        setBounds(300,300,700,500);
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            System.out.println("The reason why appearance cannot be set;"+e);
        }
        container=getContentPane();
        container.add(new JScrollPane(editor));
        addFileMenu();
        addEditMenu();
        addFormMenu();
        addHelpMenu();
        addJMenuBar();
        addJPopupMenu();
        setJMenuBar(mb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void addFileMenu(){
        m1.add(n);
        m1.add(open);
        m1.add(save);
        m1.add(save_as);
        m1.addSeparator();
        m1.add(exit);
        m1.setFont(font);
    }
    private void addEditMenu(){
        m2.add(copy);
        m2.add(cut);
        m2.addSeparator();
        m2.add(paste);
        m2.setFont(font);
    }
    private void addFormMenu(){
        m3.add(f1);
        m3.add(color);
        m3.setFont(font);
        f1.add(i11);
        f1.add(i12);
        f1.add(i13);
        color.add(i21);
        color.add(i22);
        color.add(i23);
    }
    private void addHelpMenu(){
        m4.add(about);
        m4.setFont(font);
    }
    private void addJMenuBar(){
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.setBackground(Color.cyan);
    }
    private void addJPopupMenu(){
        editor.add(pm);
        pm.add(item1);
        pm.add(item2);
        pm.add(item3);
    }
    public static void main(String[] args) {
        new Demo10_06_MyNotepad();
    }
}
