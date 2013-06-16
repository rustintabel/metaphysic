/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import java.awt.image.*;
 
import java.awt.*;
 
import javax.imageio.*;
 
import java.io.*;
 

 

 
public class Geometry {
 
    
 
    /** Creates a new instance of Geometry */
 //a visualization of two othoganal quantitative aspects of
    //richard findmans favorite symetry the parts of parts
    //this visualizer can show as dimentions how the shapes of organs(recipies) are
    //dependant on what a cell type(ingrediants) can know of in its role.
    //in this way pictures of cells will act as visual explanations of particular chemical processes
    //this can be reflected down to the atomic level.
    public Geometry() {
 
    }
 
    
 
    public static void main(String[] args)
    {
        GeneralStrongAnthropicGaliosGroup metaPhysic = 
                new GeneralStrongAnthropicGaliosGroup();
        int screenHeight=100;
 
        int screenWidth=100;
        BufferedImage fractle= new BufferedImage(screenHeight, screenWidth, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics=fractle.createGraphics();
        Color c2=new Color(0,128,255);
 
        graphics.setBackground(c2);
        //graphics.drawLine(screenWidth, screenWidth, screenWidth, screenWidth);
        try{
            ImageIO.write(fractle,"jpg",new File("Fractle.jpg"));
        }catch(IOException i){
        
        }
       // LifestyleProjectionOfStrongAnthropicGaliosGroup dayPlanner=
         //       new LifestyleProjectionOfStrongAnthropicGaliosGroup();
        
       // YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic theSpine=
         //       new YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic();
 ///////////////////////////////////////
        int dimentions=5;
 
        double currentRadians=0.4;
 
        BSPTree tree=new BSPTree(dimentions);
 
        //tree.buildTreeFromRandDisjointTriangles(100);
 
        tree.buildTreeFromRandconectedTriangles(3);
 
        try{
 
            BufferedImage temp=null;
 
            int dimentionx=0;
 
            int dimentiony=1;
 
            double radiansSoFar=0;
 
            for(int i=0;i<100;i++){
 
            temp=tree.drawBSPTree();   
 
            radiansSoFar+=currentRadians;
 
            if(radiansSoFar>3.14*2)
 
            {
 
            radiansSoFar=0;
 
                if(dimentiony<dimentions)
 
                {
 
                    dimentiony++;
 
                }
 
                else
 
                {
 
                    if(dimentionx<dimentions)
 
                    {
 
                        dimentionx++;
 
                        dimentiony=dimentionx+1;
 
                    }else
 
                    {
 
                                dimentionx=0;
 
                                dimentiony=1;
 
                    }
 
                }
 
            }
 
            tree.rotateAroundOrigin(currentRadians,dimentionx,dimentiony);
 
            
 
            //Point p=new Point(dimentions);
 
            //p.setRandomCoordinates(1.0);
 
            //tree.translateByVector(p);
 
            tree.scale(1.01);
 
            ImageIO.write(temp,"jpg",new File(Integer.toString(i)+".jpg"));
 
            }
 
        }catch(Exception i)
 
        {
 
            System.out.println("dfgdg");
 
        }
 
    }
 
    
 
} 

