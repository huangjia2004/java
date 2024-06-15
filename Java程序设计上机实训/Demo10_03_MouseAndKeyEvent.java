package Java程序设计上机实训;
import java.awt.*;
import java.awt.event.*;
public class Demo10_03_MouseAndKeyEvent {
    private Frame f;
    private Button b;
    private TextField tf;
    Demo10_03_MouseAndKeyEvent(){
        init();
    }
    public void init(){
        f=new Frame("my frame");
        f.setBounds(300,100,600,500);
        f.setLayout(new FlowLayout());
        tf=new TextField(20);
        b=new Button("my button");
        f.add(tf);
        f.add(b);
        myEvent();
        f.setVisible(true);
    }
    private void myEvent(){
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        tf.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int code=e.getKeyCode();
                if(!(code>=KeyEvent.VK_0&&code<=KeyEvent.VK_9)){
                    System.out.println(code+"illegal !");
                    e.consume();
                }
            }
        });
        b.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.println("ctrl+enter is run");
                    System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"...."+e.getKeyCode());
                }
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("action ok");
            }
        });
        b.addMouseListener(new MouseAdapter(){
            private int count=1;
            private int clickCount=1;
            public void mouseEntered(MouseEvent e){
                System.out.println("mouse insert this"+count++);
            }
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    System.out.println("double click"+clickCount++);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Demo10_03_MouseAndKeyEvent();
    }
}
