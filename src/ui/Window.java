package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements ActionListener {

    // todo : fix this nightmare, make scalable
    private JFrame mFrame;
    private JPanel mPanel1;
    private MyDrawPanel mPanel2;
    private JButton mButton1;
    private JButton mButton2;
    private JButton mButton3;
    private JButton mButton4;

    public Window(){

    }

    // EFFECTS: Brings up the start menu.
    public void createStartMenu(){

        // set up the left panel
        mPanel1 = new JPanel();

        mButton1 = new JButton("Click me");
        mButton2 = new JButton("Click me");
        mButton3 = new JButton("Click me");
        mButton4 = new JButton("Click me right now or i will ... burn the whole place down");


        // register button with action listener
        mButton1.addActionListener(this);

        mPanel1.setBackground(Color.darkGray);
        mPanel1.setLayout(new BoxLayout(mPanel1, BoxLayout.Y_AXIS));
        mPanel1.add(mButton1);
        mPanel1.add(mButton2);
        mPanel1.add(mButton3);

        // set up the right panel
        mPanel2 = new MyDrawPanel();

        mPanel2.add(mButton4);


        // set up the frame
        mFrame = new JFrame();

        // program quit as soon as the window is closed
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mFrame.getContentPane().add(BorderLayout.CENTER, mPanel1);
        mFrame.getContentPane().add(BorderLayout.EAST, mPanel2);
        mFrame.setSize(500,500);
        mFrame.setVisible(true);

        mPanel2.setSize(200,50);


    }

    // implement ActionListener interface's actionPerformed
    public void actionPerformed(ActionEvent event) {
        mButton1.setText("I've been clicked....................");
    }
}
