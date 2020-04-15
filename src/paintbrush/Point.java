/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Ernesto
 * @author Raiana
 * @author Wisney Tadeu
 */
public class Point
{
    public int x;
    public int y;
    public Graphics2D g2d;
    
    Point(){
       this(0,0,null);
    }
    
    Point(int x, int y, Graphics g){
       this(x,y,(Graphics2D) g);
    }
    
    Point(int x, int y, Graphics2D g2d){
       this.x = x;
       this.y = y;
       this.g2d = g2d;
    }
    
    public void draw()
    {
      draw(Color.red);
    }

    public void draw(Color c)
    {
        g2d.setStroke(new BasicStroke(0.1f));
        g2d.setColor(c);

        g2d.draw(new Line2D.Double(x, y, x, y));
    }

    public void rotacionar(int grau)
    {
         double grauRad = Math.toRadians(grau);
         double sinGrauRad = Math.sin(grauRad);
         double cosGrauRad = Math.cos(grauRad);
         int x = this.x;
         int y = this.y;

         this.x = (int)((x * cosGrauRad) - (y * sinGrauRad));
         this.y = (int)((x * sinGrauRad) + (y * cosGrauRad));

         System.out.println("============ Rotação do ponto ============");
         System.out.println("X: " + x + " Y: " + y + " X': " + this.x + " Y': " + this.y );
    }
    
}
