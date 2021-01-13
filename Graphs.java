/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoSecreto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author danielsalnikov
 */
public class Graphs extends JFrame {
   

    public Graphs() {
        setLayout(new BorderLayout());
        add(new drawStocks(), BorderLayout.CENTER);

    }

    public class drawStocks extends JPanel {
        
       public double f(double x){
           return Math.sin(x);
       }
       public double g(double x){
           return Math.cos(x);
       }


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            this.setBackground(Color.WHITE);
            
          

            g.drawLine(10, 100, 380, 100);
            g.drawLine(200, 30, 200, 190);

            g.drawLine(380, 100, 370, 90);
            g.drawLine(380, 100, 370, 110);
            g.drawLine(200, 30, 190, 40);
            g.drawLine(200, 30, 210, 40);

            g.drawString("graph", 360, 30);
            g.drawString("waves", 220, 40);

            Polygon p = new Polygon();
            Polygon p2 = new Polygon();

            for (int x = -200; x <= 200; x++) {
                p.addPoint(x + 200, 100 - (int) (50 * f((x / 100.0) * 2
                    * Math.PI)));

            }
            for (int x = -200; x <= 200; x++) {
                p2.addPoint(x + 200, 100 - (int) (50 * g((x / 100.0) * 2
                    * Math.PI)));

            }

            g.setColor(Color.BLUE);
            
            g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
            g.drawString("0", 200, 115);

            g.setColor(Color.RED);
            g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);

          
        }
    }

}

    

