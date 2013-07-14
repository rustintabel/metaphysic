/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;
import java.awt.geom.AffineTransform;

/**
 *
 * @author justin
 */
public class ImageFile extends Polygon{
    public static int verticies=4;
    AffineTransform xform;
    java.awt.Image image;
    Triangle top;
    Triangle bottom;
    
    public ImageFile(int dimentions,java.awt.Image image,Triangle top,Triangle bottom)
    {
        super(dimentions,verticies);
        this.image=image;
        this.top=top;
        this.bottom=bottom;
    }
    
    //concatinate transforms
    
    public void translate()
    {
    
    }
    
}
