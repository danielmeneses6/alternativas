
package estructuras;

import java.awt.Color;
import java.awt.Graphics;


public class Dibujo extends javax.swing.JPanel {
int x=0;
    public void paintComponent(Graphics g)
   {
       super.paintComponent(g);
       Color dorado=new Color(212,175,55);
       g.setColor(dorado);
       g.fillOval( x, 0, 60, 90);
       g.setColor(Color.BLACK);
       g.drawOval(0,0,60,90);
       g.setColor(Color.WHITE);
       g.drawOval(20,20,30,30);
       g.setColor(Color.cyan);
       g.fillRect(50,80,80,20);
       g.setColor(Color.magenta);
       int vx[]={220,250,280};
       int vy[]={230,200,230};
       g.fillPolygon(vx, vy, 3);
       g.setColor(Color.black);
       g.drawPolygon(vx, vy, 3);
        
       
   }
    public Dibujo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
