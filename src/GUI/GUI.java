package GUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("SSģ�����"); //����һ������
        
        FlowLayout fl = new FlowLayout();  //ʹ��������
        jf.setLayout(fl);//�޸Ĳ��ֹ���
        
        //�ı�
        JLabel JL1=new JLabel("IP��ַ");
        jf.add(JL1);
        
        //�ı���
        JTextField JT1 = new JTextField(43);
        JT1.setText("127.0.0.1");
        jf.add(JT1);
        
        String IPadress = JT1.getText();
        
        //������ť
        JButton jb1 = new JButton("����Msg1"); 
        JButton jb2 = new JButton("����Msg2");
        JButton jb3 = new JButton("����Msg3"); 
        JButton jb4 = new JButton("����Msg4"); 
        JButton jb20 = new JButton("����Msg20"); 
        
        //��Ӱ�ť������
        jf.add(jb1); 
        jf.add(jb2);
        jf.add(jb3); 
        jf.add(jb4); 
        jf.add(jb20); 
        
        //��Ӽ����¼�
        jb1.addActionListener(new BtnListener1(IPadress));
        jb2.addActionListener(new BtnListener2(IPadress));
        jb3.addActionListener(new BtnListener3(IPadress));
        jb4.addActionListener(new BtnListener4(IPadress));
        jb20.addActionListener(new BtnListener20(IPadress));
        
        jf.setSize(600, 300); //���ô��ڵĴ�С
        jf.setLocation(300,200);//���ô��ڵĳ�ʼλ��
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
        jf.setVisible(true); //��ʾ����
    }
}