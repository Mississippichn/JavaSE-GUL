import java.awt.*;
import java.awt.Frame;

public class Frame2 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(0,0,200,200,Color.green);
        MyFrame myFrame1 = new MyFrame(0,200,200,200,Color.black);
        MyFrame myFrame2 = new MyFrame(200,0,200,200,Color.blue);
        MyFrame myFrame3 = new MyFrame(200,200,200,200,Color.red);
    }
}

class MyFrame extends Frame {

    //构造器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("刘可的窗口");
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
    }
}
