/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author justin
 * 
 * Remember to name the website for this web applications web site
 * "o its nothing it was just a thought don't worry about it ... pure fantacy"
 */
public class Metaphysic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GeneralStrongAnthropicGaliosGroup metaPhysic = 
                new GeneralStrongAnthropicGaliosGroup();
        int screenHeight=100;
 
        int screenWidth=100;
        BufferedImage fractle= new BufferedImage(screenHeight, screenWidth, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics=fractle.createGraphics();
        Color lightBlue=new Color(0,128,255);
        Color yellow=new Color(255,255,0);
        Color white=new Color(255,255,255);
        Color red=new Color(255,0,0);
        Color black=new Color(0,0,0);
        graphics.setBackground(lightBlue);
        //graphics.drawLine(screenWidth, screenWidth, screenWidth, screenWidth);
        for(int x=0,y=0,lastX=x,lastY=0,centerX=100,centerY=100;x<33;x++)
        {
            y=x/20;
            lastX=x+centerX;
            lastY=y+centerY;
            graphics.drawLine(x, y, lastX, lastY);
        }
        try{
            ImageIO.write(fractle,"jpg",new File("Fractle.jpg"));
        }catch(IOException i){
        
        }
    }
    
    public void drawRecursiveQuadrants(int startX,int startY,int endX,int endY,Graphics2D graphics 
            ,Color yellow,Color white,Color red,Color black,int centerX,int centerY,
            GeneralStrongAnthropicGaliosGroup metaPhysic)
    {
        //metaPhysic.community
        double segmentCenterX=(startX-endX)/2;
        double segmentCenterY=(startY-endY)/2;
        
        double segmentQuarterX=(segmentCenterX-startX)/2;
        double segmentQuarterY=(segmentCenterY-startY)/2;
        
        double segmentThreeQuarterX=(segmentCenterX-endX)/2;
        double segmentThreeQuarterY=(segmentCenterY-endY)/2;
        
        graphics.drawLine(startX, startY, (int)segmentQuarterX, (int)segmentQuarterY);
        graphics.drawLine((int)segmentQuarterX, (int)segmentQuarterY, (int)segmentCenterX, (int)segmentCenterY);
        graphics.drawLine((int)segmentCenterX, (int)segmentCenterY, (int)segmentThreeQuarterX, (int)segmentThreeQuarterY);
        graphics.drawLine((int)segmentThreeQuarterX, (int)segmentThreeQuarterY, endX, endY);
    } 
}
