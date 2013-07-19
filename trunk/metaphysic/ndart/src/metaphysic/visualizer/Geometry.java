/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;

import metaphysic.visualizer.BSPTree;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import metaphysic.GeneralStrongAnthropicGaliosGroupFractle;
 
public class Geometry {
 
    
 
    /** Creates a new instance of Geometry 
     *a visualization of two othoganal quantitative aspects of
     *richard findmans favorite symetry the parts of parts
     *this visualizer can show as dimentions how the shapes of organs(recipies) are
     *dependant on what a cell type(ingrediants) can know of in its role.
     *in this way pictures of cells will act as visual explanations of particular chemical processes
     * this can be reflected down to the subatomic level.
     */
    public Geometry() {
 
    }
 
    
 
    public static void main(String[] args)
    {
        
        GeneralStrongAnthropicGaliosGroupFractle metaPhysic = 
                new GeneralStrongAnthropicGaliosGroupFractle();
        
      //  LifestyleProjectionOfStrongAnthropicGaliosGroup dayPlanner=
        //       new LifestyleProjectionOfStrongAnthropicGaliosGroup();

       
        CrystalBall crystalBall=new CrystalBall
                ("cells","YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic",
                metaPhysic);
       
        crystalBall.GenerateVideo(0.4);
    }

    
 
} 

