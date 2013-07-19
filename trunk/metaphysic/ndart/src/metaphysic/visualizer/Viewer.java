/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;

import java.awt.image.*;
import java.awt.geom.AffineTransform;
  
import java.awt.*;
 
/**
 
 *
 
 * @author justin
 
 */
 
public class Viewer {
 
    
 
    Point viewer=null;
 
    Point screenCenter=null;
 
    BufferedImage currentView=null;
 
    Graphics2D graphics=null;
 
    double viewableRadius=0;
 
    double distanceFromScreen=0;
 
    int screenHeight=0;
 
    int screenWidth=0;
 
    
 
    public Viewer(int dimentions, double v, double d,int sH,int sW) 
 
    {
 
        screenHeight=sH;
 
        screenWidth=sW;
 
        viewableRadius=v;
 
        distanceFromScreen=d;
 
        viewer = new Point(dimentions);
 
        viewer.setAsOrigin();
 
        viewer.setCoordinate(2, distanceFromScreen+viewableRadius);
 
        screenCenter= new Point(dimentions);
 
        screenCenter.setAsOrigin();
 
        screenCenter.setCoordinate(2, viewableRadius);
 
        currentView= new BufferedImage(screenHeight, screenWidth, BufferedImage.TYPE_INT_RGB);
 
        graphics=currentView.createGraphics();
 
        clear();
        Color lightBlue=new Color(0,128,255);
        Color c2=new Color(0,0,0);
 
        graphics.setBackground(lightBlue);
 
    }
 
    
 
    public void clear()
 
    {
 
        graphics.clearRect(0, 0, screenHeight, screenWidth);
 
    }
 
    
 
    public BufferedImage getImage()
 
    {
 
        return currentView;
 
    }
 
    
 
    public Point getViewPoint()
 
    {
 
        return viewer;
 
    }
 
    
 
    public void drawTriangle(Triangle t)
    {
        
        int[] x=new int[3];
 
        int[] y=new int[3];
 
        for(int i=0;i<t.getNumPointsSet();i++)
 
        {
 
            Point p=t.getPoint(i);

            Point pp=orthogonalProjectPoint(p);

            //Point pp=perspectiveProjectPoint(p);

            x[i]=(int)(pp).getCoordinate(0)+(screenWidth/2);

            y[i]=(int)(pp).getCoordinate(1)+(screenHeight/2);
 
        }
 
        graphics.setColor(t.getColor());
 
        //graphics.fillPolygon(x,y,3);
        graphics.drawPolygon(x, y, 3);
        
        if(t.image!=null)
        {
            AffineTransform translate=new AffineTransform();
           translate.setToTranslation(x[0],y[0] );
           Point base=t.getPoint(2).minus(t.getPoint(0));
           Point hypotenuse=t.getPoint(1).minus(t.getPoint(0));
           //rotate by anglle between hypotennuus and base
           //translate=AffineTransform.getRotateInstance(base.coordinates[0], base.coordinates[1]);
           AffineTransform scale=new AffineTransform();
           //scale.setToScale
             //      (t.getPoint(1).minus(t.getPoint(0)).coordinates[0], 
               //    t.getPoint(1).minus(t.getPoint(0)).coordinates[1]);
           
           scale.setToScale
                   (1/(t.getPoint(1).coordinates[0]-t.getPoint(0).coordinates[0]), 
                   1/(t.getPoint(1).coordinates[1]-t.getPoint(0).coordinates[1]));
           
           //translate.concatenate(scale);
           //scale.concatenate(translate);
           //t.image.getScaledInstance(
           //        (int)(1/Math.abs(t.getPoint(1).coordinates[0]-t.getPoint(0).coordinates[0])),
           //        (int)(1/Math.abs(t.getPoint(1).coordinates[1]-t.getPoint(0).coordinates[1])), 
           //        Image.SCALE_SMOOTH);
           
           graphics.drawImage(t.image, scale, null);       
        }

        

 
    }
 
        public void drawImageFile(ImageFile image)
    {

        Point pp=orthogonalProjectPoint(image.bottom.points[0]);
        Point ppSize=orthogonalProjectPoint(image.bottom.points[1]);
        //Point pp=perspectiveProjectPoint(p);
 
        int imageBottomCornerX=(int)(pp).getCoordinate(0)+(screenWidth/2);
 
        int imageBottomCornerY=(int)(pp).getCoordinate(1)+(screenHeight/2);
 
        
        
        image.xform.setToTranslation(imageBottomCornerX,imageBottomCornerY );
        AffineTransform scale=new AffineTransform();
        scale.setToScale(ppSize.minus(pp).coordinates[0], ppSize.minus(pp).coordinates[1]);
        image.xform.concatenate(scale);
        graphics.drawImage(image.image, image.xform, null);
 
    }
 
    public Point perspectiveProjectPoint(Point p)
 
    {
 
        Point projectedPoint =new Point(2);
 
        double c=((viewableRadius-distanceFromScreen)/(p.getCoordinate(2)-distanceFromScreen));
 
        projectedPoint.setCoordinate(0, p.getCoordinate(0)*c);
 
        projectedPoint.setCoordinate(1, p.getCoordinate(1)*c);
 
        return projectedPoint;
 
    }
 
    
 
        public Point orthogonalProjectPoint(Point p)
 
    {
 
        Point projectedPoint =new Point(2);
 
        projectedPoint.setCoordinate(0, p.getCoordinate(0));
 
        projectedPoint.setCoordinate(1, p.getCoordinate(1));
 
        return projectedPoint;
 
    }
 
    
 
    
 
} 

