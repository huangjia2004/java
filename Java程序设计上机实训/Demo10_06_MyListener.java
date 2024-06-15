package Java程序设计上机实训;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font.*;
public class Demo10_06_MyListener extends Demo10_06_MyNotepad implements ActionListener, MouseListener{
    int flag=0;
    public Demo10_06_MyListener(){
        n.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        save_as.addActionListener(this);
        exit.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        i11.addActionListener(this);
        i12.addActionListener(this);
        i13.addActionListener(this);
        i21.addActionListener(this);
        i22.addActionListener(this);
        i23.addActionListener(this);
        about.addActionListener(this);
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        editor.addMouseListener(this);
        addWindowListener(new windowlistener());
        editor.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                flag=1;
            }
        });
    }
    class windowlistener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            if(flag==0) System.exit(0);
            else close();
        }
    }
    public void actionPerformed(ActionEvent e){
        Font f2=editor.getFont();
        JMenuItem mi=(JMenuItem)e.getSource();
        if(mi==n){if(flag==0) editor.setText("");else close2();}
        if(mi==open)loadFile();
        if(mi==save||mi==save_as)saveFile();
        if(mi==exit){if(flag==0)System.exit(0);close();}
        if(mi==copy)editor.copy();
        if(mi==cut)editor.cut();
        if(mi==paste)editor.paste();
        if(mi==i11)editor.setFont(new java.awt.Font ("宋体",java.awt.Font.PLAIN,f2.getSize()));
        if(mi==i12)editor.setFont (new java.awt.Font("楷体",java.awt.Font.PLAIN,f2.getSize()));
        if(mi==i13)editor.setFont(new java.awt.Font("黑体",java.awt.Font.PLAIN,f2.getSize()));
        if(mi==i21)editor.setForeground(Color.red);
        if(mi==i22)editor.setForeground(Color.blue);
        if(mi==i23)editor.setForeground(Color.green);
        if(mi==about)JOptionPane.showMessageDialog(Demo10_06_MyListener.this,"记事本","关于...",JOptionPane.PLAIN_MESSAGE);
        if(mi==item1)editor.copy();
        if(mi==item2)editor.cut();
        if(mi==item3)editor.paste();
    }
    void loadFile(){
        JFileChooser fc=new JFileChooser();
        int r=fc.showOpenDialog(this);
        if(r==JFileChooser.APPROVE_OPTION){
            File file=fc.getSelectedFile();
            try{
                editor.read(new FileReader(file),null);
                editor.setFont(font);
            }
            catch(IOException e){
            }
        }
    }
    void saveFile(){
        JFileChooser fc=new JFileChooser();
        int r=fc.showSaveDialog(this);
        if(r==JFileChooser.APPROVE_OPTION){
            File file=fc.getSelectedFile();
            try{
                editor.write(new FileWriter(file));
            }
            catch (IOException e){
            }
        }
    }
    void close(){
        try {
            int option=JOptionPane.showConfirmDialog(null,"是否保存文件?","保存文件?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null);
            switch (option){
                case JOptionPane.YES_OPTION:saveFile();break;
                case JOptionPane.NO_OPTION:System.exit(0);break;
                case JOptionPane.CANCEL_OPTION:return;
            }
        }
        catch(Exception e){e.printStackTrace();}
    }
    void close2(){
        int option=JOptionPane.showConfirmDialog(null,"是否保存文件?","保存文件?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null);
        try{
            switch(option){
                case JOptionPane.YES_OPTION:saveFile ();editor .setText("");break;
                case JOptionPane.NO_OPTION:editor.setText("");return;
            }
        }
        catch(Exception e){e.printStackTrace();}
    }
    public void mouseReleased(MouseEvent e){
        if(e.isPopupTrigger())
            pm.show(editor,e.getX(),e.getY());
    }
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public static void main(String[]args){
        Demo10_06_MyListener dListener=new Demo10_06_MyListener();
    }
}

