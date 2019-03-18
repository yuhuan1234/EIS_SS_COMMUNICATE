package GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("SS模拟软件"); //建立一个窗口
        
        FlowLayout fl = new FlowLayout();  //使用流布局
        jf.setLayout(fl);//修改布局管理
        
        //文本
        JLabel JL1=new JLabel("IP地址");
        jf.add(JL1);
        
        //文本框
        JTextField JT1 = new JTextField(43);
        JT1.setText("127.0.0.1");
        jf.add(JT1);
        
        String IPadress = JT1.getText();
        
        //创建按钮
        JButton jb1 = new JButton("发送Msg1"); 
        JButton jb2 = new JButton("发送Msg2");
        JButton jb3 = new JButton("发送Msg3"); 
        JButton jb4 = new JButton("发送Msg4"); 
        JButton jb20 = new JButton("发送Msg20"); 
        
        //添加按钮到窗口
        jf.add(jb1); 
        jf.add(jb2);
        jf.add(jb3); 
        jf.add(jb4); 
        jf.add(jb20); 
        
        //添加监听事件
        jb1.addActionListener(new BtnListener1(IPadress));
        jb2.addActionListener(new BtnListener2(IPadress));
        jb3.addActionListener(new BtnListener3(IPadress));
        jb4.addActionListener(new BtnListener4(IPadress));
        jb20.addActionListener(new BtnListener20(IPadress));
        
        jf.setSize(600, 300); //设置窗口的大小
        jf.setLocation(300,200);//设置窗口的初始位置
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
        jf.setVisible(true); //显示窗口
    }
}