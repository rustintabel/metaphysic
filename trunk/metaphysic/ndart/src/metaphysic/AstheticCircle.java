/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.math.*;
import metaphysic.*;
import metaphysic.visualizer.*;
import java.lang.Math;
 
/**
 *
 * @author justin
 */
public class AstheticCircle {
    Color[] astheticColors=new Color[3];
    ArrayList<Color>  astheticSegmentColors=new ArrayList<Color>();
    int rows=10;
    int maximumSegments=84;

    ArrayList<Triangle> segmentTriangles=new ArrayList<Triangle>();
    ArrayList<Point> circleSegmentEndPoints=new ArrayList<Point>();
    GeneralStrongAnthropicGaliosGroupFractle metaPhysic;
    Color lightBlue=new Color(0,128,255);
    Color yellow=new Color(255,255,0);
    Color white=new Color(255,255,255);
    Color red=new Color(255,0,0);
    int currentRadius=20,centerX=0,centerY=0;
    double twoPi=6.283;
    
    AstheticCircle(
            int radius, int centerX, int centerY, GeneralStrongAnthropicGaliosGroupFractle meta)
    {
        this.metaPhysic=meta;
        this.currentRadius=radius;
        this.centerX=centerX;
        this.centerY=centerY;
        

        
        /*int i=9;
        StrongAnthropicGaliosGroup symetryShell=metaPhysic.quarks;
       
        for(int symetryShellCounter=1;;symetryShellCounter++)
        {
            for(int row=1;row<=3;row++){
                for(int column=1;column<=3;column++){
                    
                    divisorsSoFar=divisorsSoFar*4;
                    currentSegmentsPerColor=maximumSegments/divisorsSoFar;
                   
                    
                    if(symetryShell.asthetics[row-1][column-1].astheticType=="Recombination")
                    {
                        astheticSegmentColors[currentRow][column]=astheticColors[0];
                    }
                    if(symetryShell.asthetics[row-1][column-1].astheticType=="Reproduction")
                    {
                        astheticSegmentColors[currentRow][column]=astheticColors[1];
                    }
                    if(symetryShell.asthetics[row-1][column-1].astheticType=="Printmaking")
                    {
                        astheticSegmentColors[currentRow][column]=astheticColors[2];
                    }
                    
        for(int j=1;j<=4;j++)
        {
            for(int i=0;i<currentSegmentsPerColor;i++)
            {

                xLineSegmentCoordinates[currentRow+1][i]=
                        (int)(xLineSegmentCoordinates[currentRow][i]*
                        Math.sin((int)(twoPi/divisorsSoFar)));
                yLineSegmentCoordinates[currentRow+1][i]=
                        (int)(yLineSegmentCoordinates[currentRow][i]*
                        Math.sin((int)(twoPi/divisorsSoFar)));
            }
        }
                    
                    currentRow++;
                    if(symetryShell.ceiling!=null){
                        symetryShell=symetryShell.ceiling;
                    }else{break;}
                }
            }
            }
            */
        }
    
    public ArrayList<Triangle> getTriangles(GeneralStrongAnthropicGaliosGroupFractle metaphysic)
    {
        return segmentTriangles;
    }
    
    public void drawAstheticCircle(Graphics2D graphics)
    {
        int currentRow=0;
        
        Point p=new Point(2);
        ArrayList<StrongAnthropicGaliosGroup> symmetryShells
                =new ArrayList<StrongAnthropicGaliosGroup>();
        
        StrongAnthropicGaliosGroup current;
        current=metaPhysic.quarks;
        
        while(current!=null)
        {
           symmetryShells.add(current);
           current=current.ceiling; 
        }
        
        for(int symmetryShell=symmetryShells.size()-1;symmetryShell>=0;symmetryShell--){
            current=symmetryShells.get(symmetryShell);
            for(currentRow=1;currentRow<3;currentRow++)
            {
                p.setCoordinate(0, 0);
                p.setCoordinate(1, currentRadius);

                 int numberOfSegments=((int)Math.pow(4, currentRow-1));
                 for(int i=0;i<numberOfSegments;i++)
                 {
                    if(current.asthetics[currentRow-1][0].handHumunculous.astheticType
                            .equalsIgnoreCase("PrintMaking")){astheticSegmentColors.add(yellow);}
                    else if(current.asthetics[currentRow-1][0].handHumunculous.astheticType
                            .equalsIgnoreCase("Recombination")){astheticSegmentColors.add(white);}
                    else if(current.asthetics[currentRow-1][0].handHumunculous.astheticType
                            .equalsIgnoreCase("Reproduction")){astheticSegmentColors.add(red);} 
                    
                     Point q=new Point(2);
                     q.setCoordinate(0, (int)p.getCoordinate(0));
                     q.setCoordinate(1, (int)p.getCoordinate(1));
                     circleSegmentEndPoints.add(q);
                     p.rotateAroundOrigin((twoPi/((int)Math.pow(4, currentRow))), 0, 1);
                 }    
                 
 

                 numberOfSegments=((int)Math.pow(4, currentRow-1));
                 for(int i=0;i<numberOfSegments;i++)
                 {
                    if(current.asthetics[currentRow-1][0].hand.astheticType
                            .equalsIgnoreCase("PrintMaking")){astheticSegmentColors.add(yellow);}
                    else if(current.asthetics[currentRow-1][0].hand.astheticType
                            .equalsIgnoreCase("Recombination")){astheticSegmentColors.add(white);}
                    else if(current.asthetics[currentRow-1][0].hand.astheticType
                            .equalsIgnoreCase("Reproduction")){astheticSegmentColors.add(red);} 
                    
                     Point q=new Point(2);
                     q.setCoordinate(0, (int)p.getCoordinate(0));
                     q.setCoordinate(1, (int)p.getCoordinate(1));
                     circleSegmentEndPoints.add(q);
                     p.rotateAroundOrigin((twoPi/((int)Math.pow(4, currentRow))), 0, 1);
                 } 
                 
 

                 numberOfSegments=((int)Math.pow(4, currentRow-1));
                 for(int i=0;i<numberOfSegments;i++)
                 {
                    if(current.asthetics[currentRow-1][0].eye.astheticType
                            .equalsIgnoreCase("PrintMaking")){astheticSegmentColors.add(yellow);}
                    else if(current.asthetics[currentRow-1][0].eye.astheticType
                            .equalsIgnoreCase("Recombination")){astheticSegmentColors.add(white);}
                    else if(current.asthetics[currentRow-1][0].eye.astheticType
                            .equalsIgnoreCase("Reproduction")){astheticSegmentColors.add(red);} 
                     Point q=new Point(2);
                     q.setCoordinate(0, (int)p.getCoordinate(0));
                     q.setCoordinate(1, (int)p.getCoordinate(1));
                     circleSegmentEndPoints.add(q);
                     p.rotateAroundOrigin((twoPi/((int)Math.pow(4, currentRow))), 0, 1);
                 } 
                 
  

                 numberOfSegments=((int)Math.pow(4, currentRow-1));
                 for(int i=0;i<numberOfSegments;i++)
                 {
                    if(current.asthetics[currentRow-1][0].eyeHumunculous.astheticType
                            .equalsIgnoreCase("PrintMaking")){astheticSegmentColors.add(yellow);}
                    else if(current.asthetics[currentRow-1][0].eyeHumunculous.astheticType
                            .equalsIgnoreCase("Recombination")){astheticSegmentColors.add(white);}
                    else if(current.asthetics[currentRow-1][0].eyeHumunculous.astheticType
                            .equalsIgnoreCase("Reproduction")){astheticSegmentColors.add(red);}
                     Point q=new Point(2);
                     q.setCoordinate(0, (int)p.getCoordinate(0));
                     q.setCoordinate(1, (int)p.getCoordinate(1));
                     circleSegmentEndPoints.add(q);
                     p.rotateAroundOrigin((twoPi/((int)Math.pow(4, currentRow))), 0, 1);
                 } 
                
                this.currentRadius=this.currentRadius+2;
            } 
        }
        
            Point start;
            start=circleSegmentEndPoints.get(0);
            for(int i=1;i<circleSegmentEndPoints.size();i++)
            {
                    p=circleSegmentEndPoints.get(i);
                    
                    if(astheticSegmentColors.size()>i)
                    {graphics.setColor(astheticSegmentColors.get(i));}
                    
                    graphics.drawLine(
                            (int)start.getCoordinate(0)+centerX, 
                            (int)start.getCoordinate(1)+centerY, 
                            (int)p.getCoordinate(0)+centerX, 
                            (int)p.getCoordinate(1)+centerY);
                    start=p;   
            } 
        
    }
    

    }
    
    
 

