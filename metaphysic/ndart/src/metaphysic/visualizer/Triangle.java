
package metaphysic.visualizer;

/*
 
 * Triangle.java
 
 *
 
 * Created on September 30, 2005, 10:11 PM
 
 *
 
 */
 

 

 
import java.awt.image.*;
 
import java.awt.*;
 
/**
 
 *
 
 * @author justin
 
 */
 
public class Triangle {
 

    int dimentions =0;
 
    private int numVerticies=3;
 
    int numPointsAdded=0;
 
    Color color=null; 

 
    Point[] points;
 
    Point[] hyperPlanes=null;
 
    int trueHyperPlaneIndex=0;
 
    Point center=null;
 
    java.awt.Image image=null;
    
    public void addImage(java.awt.Image image)
    {
        this.image=image;
    }
 
    public int getNumPointsSet()
 
    {
 
        return numPointsAdded;
 
    }
 

 
    public Triangle(int d) {
 
        dimentions=d;
 
        points=new Point[numVerticies];
 
    }
 
    
 
    public Point getPoint(int index)
 
    {
 
        if(index<numPointsAdded){
 
            return points[index];
 
        }
 
        else
 
        {
 
            return null;
 
        }
 
    }
 
    
 
    public Point getHyperplaneCenter()
 
    {
 
        Point center=null;
 
        if(hyperPlanes!=null)
 
        {
 
            center= hyperPlanes[0];
 
        }
 
        return center;
 
    }
 
    
 
    public Point getHyperplaneNormal()
 
    {
 
        Point normal=null;
 
        if(hyperPlanes!=null)
 
        {
 
            normal= hyperPlanes[trueHyperPlaneIndex];
 
        }
 
        return normal;
 
    }    
 
    
 
    public boolean addPoint(Point p)
 
    {
 
        boolean pointAdded=false;
 
        
 
        if(numPointsAdded<numVerticies)
 
        {
 
            points[numPointsAdded]=p;
 
            numPointsAdded++;
 
            pointAdded =true;
 
        }
 
        
 
        return pointAdded;
 
    }
 
    
 
    
 
    public void setCenter()
 
    {
 
        if(numPointsAdded==numVerticies)
 
        {
 
            center=new Point(dimentions);
 
            for(int i=0;i<dimentions;i++)
 
            {
 
                center.setCoordinate(i , (points[0].getCoordinate(i)+points[1].getCoordinate(i)+points[2].getCoordinate(i))/3); 
 
            }
 
        }
 
        
 
    }   
 
    
 
    public Point getCenter()
 
    {
 
        return center;
 
    }
 
    
 
    public Point getProjectedPoint(int index)
 
    {
 
        Point pPoint=(Point)points[index].clone();
 
        return pPoint;
 
    }    
 
    /**
 
     * Returns a vector of length 1 from the center of this triangle which is a normal of a dimentions-1 dimentional
 
     * hyperplane containing this triangle. In general there is a choice of n-2 of these.
 
     * 
 
     */
 
    public void setRandTriangleAndPossibleHyperPlanes(double heightByWidth)
 
    {
 
        
 
        if(dimentions>2 ){
 
	        Point normal=null;
 
	        hyperPlanes=new Point[dimentions-1];
 
	
 
	            
 
	        Point center = new Point(dimentions);
 
	        center.setAsOrigin();
 
	        hyperPlanes[0]=center;
 
	
 
	        createRandTriangleAtOriginInXYPlane(heightByWidth,500.0);
 
	        for(int i=1;i<(dimentions-1);i++)
 
	        {
 
	            normal=new Point(dimentions);
 
	            normal.setAsOrigin();
 
	            normal.setCoordinate(i+1, 1.0);
 
	            hyperPlanes[i]=normal;
 
	        }
 
	        chooseHyperplane(1);
 
	        rotateRandomly();
 
	        Point randVector=new Point(dimentions);
 
	        randVector.setRandomCoordinates(20.0);
 
	        translateByVector(randVector);
 
        }
 
    }
 
    
 
    public void createRandTriangleAtOriginInXYPlane(double heightByWidth,double maxCoordinate)
 
    {
 
        setRandomColor();
 
        
        
        
            points[0]=new Point(dimentions);
 
            points[0].setAsOrigin();
 
            points[0].setCoordinate(0, 0);
 
            points[0].setCoordinate(1, 0);
            
            
     
            points[1]=new Point(dimentions);
 
            points[1].setAsOrigin();
 
            points[1].setCoordinate(0, Math.random()*maxCoordinate);
 
            points[1].setCoordinate(1, 0);
            
            
            
            points[2]=new Point(dimentions);
 
            points[2].setAsOrigin();
 
            points[2].setCoordinate(0, 0);
 
            points[2].setCoordinate(1, points[1].getCoordinate(0)*heightByWidth);
            
            
 
        numPointsAdded=numVerticies;
 
        setCenter();
 
        Point center=getCenter();
 
        center.negative();
 
        for(int i=0;i<numVerticies;i++)
 
        {
 
            points[i].translateByVector(center);
 
        }
 
    }
 
    
 
    public void chooseHyperplane(int whichOne)
 
    {
 
         if(whichOne>0 && whichOne<dimentions-1)
 
         {
 
            trueHyperPlaneIndex=whichOne;
 
         }
 
    }
 
    
 
    public void rotateAroundOrigin(double radians, int coordinate1,int coordinate2)
 
    {
 
        if(numPointsAdded==numVerticies)
 
        {
 
            for(int i=0;i<numVerticies;i++)
 
            {
 
                points[i].rotateAroundOrigin(radians, coordinate1 , coordinate2);
 
            }
 
            for(int i=0;i<(dimentions-1);i++)
 
            {
 
                hyperPlanes[i].rotateAroundOrigin(radians, coordinate1 , coordinate2);
 
            }
 
        }            
 
    }
 
    
 
    public void rotateRandomly()
 
    {
 
        double radians=0.0;
 
        for(int i=0;i<dimentions;i++)
 
        {
 
            for(int j=i+1;j<dimentions;j++)
 
            {
 
               radians=(Math.PI*2.0)*Math.random();
 
               rotateAroundOrigin(radians, i,j);
 
            }
 
        }
 
        
 
    }
 
    
 
        public void translateByVector(Point p)
 
    {
 
        if(p.getDimentions()==dimentions && numVerticies==numPointsAdded)
 
        {
 

 
                for(int i=0;i<numVerticies;i++)
 
                {
 
                    points[i].translateByVector(p);
 
                }
 
                
 
                for(int i=0;i<(dimentions-1);i++)
 
                {
 
                    hyperPlanes[i].translateByVector(p);
 
                }
 
        }
 
    }
 
        
 
    public void setRandomColor()
 
    {
 
        color=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
 
    }
 
    
 
    public Color getColor()
 
    {
 
        return color;
 
    }
 
    
 
    public void scale(double ratio)
 
    {
 
        if(numVerticies==numPointsAdded)
 
        {
 

 
                for(int i=0;i<numVerticies;i++)
 
                {
 
                    points[i].scale(ratio);
 
                }
 
                
 
                for(int i=0;i<(dimentions-1);i++)
 
                {
 
                    hyperPlanes[i].scale(ratio);
 
                }
 
              center.scale(ratio);  
 
        }        
 
        
 
    }  
 
    
 
    public void findNormals()
 
    {
 
        if(numVerticies==numPointsAdded)
 
        {
 
            hyperPlanes=new Point[dimentions-1];
 
            setCenter();
 
            center=getCenter();
 
            for(int i=2;i<dimentions-1;i++)
 
            {
 
                hyperPlanes[i]=new Point(dimentions);
 
                hyperPlanes[i].setAsOrigin();
 
                hyperPlanes[i].setCoordinate(i, 1.0);
 
            }
 
            Point first =points[0].minus(center);
 
            Point second =points[1].minus(center);
 
            double[] cos=first.getCosArrayRotateToAxis(0);
 
            for(int i=2;i<dimentions-1;i++)
 
            {
 
                hyperPlanes[i].rotateEachAxisGivenCos(cos, 0);
 
            }
 
            Point newSecond=second.findPerpendicularLineInPlaneOfSecondVector(second);
 
            cos=newSecond.getCosArrayRotateToAxis(1);
 
            for(int i=2;i<dimentions-1;i++)
 
            {
 
                hyperPlanes[i].rotateEachAxisGivenCos(cos, 1);
 
                hyperPlanes[i].translateByVector(center);
 
            }
 
        }
 
    }
 
    public void orientToEquitorialPlane(int planeDimention,boolean[] zzzzza,java.awt.Image image)
    {
        this.image=image;
        for(int i=0;i<dimentions;i++)
        {
            if(zzzzza[i]==true)
            {
                points[0].coordinates[i]=Math.abs(points[0].coordinates[i]);
                points[1].coordinates[i]=Math.abs(points[1].coordinates[i]);
                points[2].coordinates[i]=Math.abs(points[2].coordinates[i]);
            }
            else
            {
                points[0].coordinates[i]=-1*Math.abs(points[0].coordinates[i]);
                points[1].coordinates[i]=-1*Math.abs(points[1].coordinates[i]);
                points[2].coordinates[i]=-1*Math.abs(points[2].coordinates[i]);
            }
        }
        points[0].coordinates[planeDimention]=0;
        points[1].coordinates[planeDimention]=0;
        points[2].coordinates[planeDimention]=0;
    }
    
    public void orientToQuadrant(boolean[] zzzzza,java.awt.Image image)
    {
        this.image=image;
        for(int i=0;i<dimentions;i++)
        {
            if(zzzzza[i]==true)
            {
                points[0].coordinates[i]=Math.abs(points[0].coordinates[i]);
                points[1].coordinates[i]=Math.abs(points[1].coordinates[i]);
                points[2].coordinates[i]=Math.abs(points[2].coordinates[i]);
            }
            else
            {
                points[0].coordinates[i]=-1*Math.abs(points[0].coordinates[i]);
                points[1].coordinates[i]=-1*Math.abs(points[1].coordinates[i]);
                points[2].coordinates[i]=-1*Math.abs(points[2].coordinates[i]);
            }
        }
    }
    
 
} 

