package com.window;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//登录界面
public class gema extends JFrame {

    public gema() {
        //初始化窗口
        initWindow();
        //加载菜单
        loadMenbar();

        //加载图片
        loadImage2();


        //设置窗口可见
        this.setVisible(true);
    }

    private void loadImage2() {
        String[] photo={"src\\com\\image\\p1\\1.jpg","src\\com\\image\\p1\\2.jpg",
                "src\\com\\image\\p1\\3.jpg","src\\com\\image\\p1\\4.jpg",
                "src\\com\\image\\p1\\5.jpg","src\\com\\image\\p1\\6.jpg",
                "src\\com\\image\\p1\\7.jpg","src\\com\\image\\p1\\8.jpg",};
        Random r=new Random();
        int index;
        int[] indexs={9,9,9,9,9,9,9,9};

        for (int i = 0; i < 8; i++) {
            index=r.nextInt(8);
            for (int j = 0; j < indexs.length; j++) {
                //如果随机数等于已经产生过的随机数中的任意一个 就重新生成
                if(index==indexs[j]){
                    index=r.nextInt(8);
                    j=0;
                }
            }
            indexs[i]=index;

            //图片加载
            ImageIcon pt1 = new ImageIcon(photo[index]);
            JLabel label = new JLabel(pt1);
            label.setBounds((i%3)*105+130,(i/3)*105+50,105,105);
            this.getContentPane().add(label);



        }
    }

    private void loadImage() {
        String[] photo={"src\\com\\image\\p1\\1.jpg","src\\com\\image\\p1\\2.jpg",
                        "src\\com\\image\\p1\\3.jpg","src\\com\\image\\p1\\4.jpg",
                        "src\\com\\image\\p1\\5.jpg","src\\com\\image\\p1\\6.jpg",
                        "src\\com\\image\\p1\\7.jpg","src\\com\\image\\p1\\8.jpg",};

        ImageIcon pt1 = new ImageIcon("src\\com\\image\\p1\\9.jpg");
        JLabel label = new JLabel(pt1);
        label.setBounds(0,0,105,105);

        label.setBackground(Color.red);

        this.getContentPane().add(label);

    }

    private void loadMenbar() {
        //菜单项目添加
        JMenuBar wbar = new JMenuBar();
        JMenu nbar1 = new JMenu("设置");
        JMenu nbar2 = new JMenu("关于我们");
        //nbar1子项
        JMenuItem zbar1 = new JMenuItem("set1");
        JMenuItem zbar2 = new JMenuItem("set2");
        //nbar2子项
        JMenuItem zbar3 = new JMenuItem("about1");
        JMenuItem zbar4 = new JMenuItem("about2");
        //nbar1子项装载
        nbar1.add(zbar1);
        nbar1.add(zbar2);
        //nbar2子项装载
        nbar2.add(zbar3);
        nbar2.add(zbar4);
        //wbar子项装载
        wbar.add(nbar1);
        wbar.add(nbar2);
        //设置菜单 页面菜单装载
        this.setJMenuBar(wbar);
    }

    private void initWindow() {
        //设置窗口大小
        this.setSize(603, 680);
        //设置窗口标题
        this.setTitle("拼图游戏");
        //设置窗口永远在最上面
        this.setAlwaysOnTop(true);
        //设置页面的初始位置在最中间
        this.setLocationRelativeTo(null);
        //设置窗口的关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认布局
        this.setLayout(null);
    }
}
