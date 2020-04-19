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
    public static int largura;
    public static int altura;
    
    Point(){
       this(0,0,null);
    }
    
    Point(int x, int y, Graphics g){
       this(x,y,g,0, 0);
    }
    
    Point(int x, int y, Graphics g, int p_altura, int p_largura ){
       this(x,y,(Graphics2D) g, p_altura, p_largura);
    }
    
    Point(int x, int y, Graphics2D g2d){
       this(x,y,g2d, 0, 0);
    }
    
    Point(int x, int y, Graphics2D g2d, int p_altura, int p_largura){
       this.x = x;
       this.y = y;
       this.g2d = g2d;
       if(p_altura > 0)
        this.altura = p_altura;
       if(p_largura > 0)
        this.largura = p_largura;
    }
    
    public void draw()
    {
      draw(Color.red);
    }

    public void draw(Color c)
    {
        g2d.setStroke(new BasicStroke(0.1f));
        g2d.setColor(c);
        
        int drawX = x;
        int drawY = y;
        
        /*if(largura > 0 && altura > 0)
        {
            int meioX = largura/2;
            int meioY = altura/2;
            
            drawX = meioX + (x/2);
            drawY = meioY + (y/2);
        }*/
        
        g2d.draw(new Line2D.Double(drawX, drawY, drawX, drawY));
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
