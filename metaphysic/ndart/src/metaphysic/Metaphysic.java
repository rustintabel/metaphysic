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
import java.awt.image.*;
import java.awt.RenderingHints;
import java.awt.Image;
 
 

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
        
        GeneralStrongAnthropicGaliosGroupFractle metaPhysic = new GeneralStrongAnthropicGaliosGroupFractle();
        int screenHeight=2000;
 
        int screenWidth=2000;
        BufferedImage fractle= new BufferedImage(screenHeight, screenWidth, BufferedImage.TYPE_INT_RGB);
       BufferedImage eyeImage=null; 
       int newHeight=0;
       String[] files=new String[0];
       String path="src"+File.separator+"metaphysic"+File.separator+"cells"+File.separator;      
        try{

            File newFile=new File(path);
            boolean isPath=newFile.isDirectory();
            files=newFile.list();
            
            boolean isAbsolute=newFile.isAbsolute();
            String patha=newFile.getPath();
            
            newHeight=eyeImage.getHeight();
        }catch(Exception i){
            System.out.print(i);
        }
        Graphics2D graphics=fractle.createGraphics();
        Color lightBlue=new Color(0,128,255);
        Color yellow=new Color(255,255,0);
        Color white=new Color(255,255,255);
        Color red=new Color(255,0,0);
        Color black=new Color(0,0,0);
        
        
        AstheticCircle aCircle=new AstheticCircle(50,(screenHeight/2),(screenWidth/2),metaPhysic);
        aCircle.metaPhysic=metaPhysic;
        aCircle.centerX=screenWidth/2;
        aCircle.centerY=screenHeight/2;
        
        graphics.setColor(lightBlue);
        graphics.fillRect(0, 0, screenWidth, screenHeight);
        //graphics.setBackground(yellow);
        graphics.drawLine(0, 0, screenHeight, screenWidth);
        graphics.setColor(red);
        graphics.drawString(""+newHeight,50, 50);
        
        Image small;
        try{
        for(int i=0;i<files.length;i++)
        {
            if(files[i].endsWith("jpg"))
            {
                File newFile=new File(path+files[i]);
                eyeImage=ImageIO.read(newFile);
                RenderingHints hint=new RenderingHints(null);
                RescaleOp scale=new RescaleOp((float)0.5, (float)0.0, hint); 
                small=eyeImage.getScaledInstance(50, 50, 0);
                graphics.translate(Math.random()*(screenWidth),Math.random()*(screenHeight));
                //graphics.setTransform(null);
                graphics.drawImage(small, null, null);            
            }



        }
        
        }catch(Exception e){}
        
       
        
        
        try{
            ImageIO.write(fractle,"jpg",new File("Fractle.jpg"));
        }catch(IOException i){
        
        }
    }
    
    public void drawRecursiveQuadrants(int startX,int startY,int endX,int endY,Graphics2D graphics 
            ,Color yellow,Color white,Color red,Color black,int centerX,int centerY,
            GeneralStrongAnthropicGaliosGroupFractle metaPhysic)
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
