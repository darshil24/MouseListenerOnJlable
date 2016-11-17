package jlable;

/**
 * Created by Darshil on 11/14/2016.
 */
/*
 * Copyright (c) 199SIZE, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */



        import com.sun.org.apache.bcel.internal.generic.NEW;
        import javafx.scene.layout.BorderImage;

        import java.awt.*;
        import java.awt.event.*;
        import java.io.File;
        import java.io.IOException;
        import javax.imageio.ImageIO;
        import javax.swing.*;
        import javax.swing.border.LineBorder;

/*
 * LabelDemo.java needs one other file:
 *   images/middle.gif
 *
 */
public class LabelDemo extends JFrame  {
    public  final int SIZE = 20;
    public static Image ICON;
    public static int i ;
    public LabelDemo() {
       // addMouseListener(this);
        JFrame frame = new JFrame("Tiger Zone");
        ImageIcon [] img = new ImageIcon [24];
        ImageIcon img2 = new ImageIcon("src/jlable/assets/5.jpg");
        JPanel panel = new JPanel(new GridLayout(SIZE,SIZE));
        try {
           ICON=ImageIO.read(new File("src/jlable/assets/icon.png"));

        } catch (IOException e) {
        }
        JLabel [][] tiles= new JLabel[SIZE][SIZE];

      // MouseAdapter adapter= new MouseAdapter() { };
    for (int i=0; i<24;i++) {
        img[i]= new ImageIcon("src/jlable/assets/"+i+".jpg");

    }

        for (i=0;i<SIZE;i++){
            for ( int j=0;j<SIZE;j++){
                tiles[i][j] = new JLabel();
                tiles[i][j].setBorder(BorderFactory.createEtchedBorder(1));

                tiles[i][j].addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent me) {
                        JLabel reference =(JLabel)me.getSource();
                        reference.setIcon(img[23]);

                    }
                });
                // tiles[i][j].setIcon(img);
//                tiles[i][j].setIcon(img[i]);
                panel.add(tiles[i][j]);
            }
        }
        frame.setIconImage(ICON);
        frame.add(panel);
        frame.setSize(1000,1000);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel(new GridLayout(0,3));
//        JFrame f = new JFrame("Jlable");
//        panel.setBorder(BorderFactory.createLineBorder(Color.black));
//        f.setLayout(new GridLayout(9,9,3,3));
//        JLabel j = new JLabel(img);
//        f.setLayout(new GridLayout(7,7));
//        j.setBorder(BorderFactory.createLineBorder(Color.black));
//        //addMouseListener(this);
//        f.setSize(new Dimension(1080,1080));
//       // j.setBounds(70,70,img.getIconWidth(),img.getIconHeight());
//        //f.add(j);
//      //
//        //
//         f.add(panel);
////      //  /f.pack();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);

    }

    public static void main (String[] args){
        LabelDemo l= new LabelDemo();
        placeStartTile();

        System.out.println("hello form main");


    }

    private static void placeStartTile() {

    }



    int geti(){
        return i;
    }
}