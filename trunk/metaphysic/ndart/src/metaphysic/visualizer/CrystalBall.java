/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;

import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author justin
 */
public class CrystalBall {
    
    //eight quadrants +++... ++-... +-+... +--... -++... -+-... --+... ---...
    //filter new imagefile objects by which quadrant its center point is in.
    
    public int northHandHumunculousRemaining=0;
    public int northHandRemaining=0;
    public int northEyeHumunculousRemaining=0;
    public int northEyeRemaining=0;
    public int southHandHumunculousRemaining=0;
    public int southHandRemaining=0;
    public int southEyeHumunculousRemaining=0;
    public int southEyeRemaining=0;  
    
    String northHandHumunculousPath;
    String northHandPath;
    String northEyeHumunculousPath;
    String northEyePath;
    String southHandHumunculousPath;
    String southHandPath;
    String southEyeHumunculousPath;
    String southEyePath;    
    
    java.awt.Image[] northHandHumunculous;
    java.awt.Image[] northHand;
    java.awt.Image[] northEyeHumunculous;
    java.awt.Image[] northEye;
    java.awt.Image[] southHandHumunculous;
    java.awt.Image[] southHand;
    java.awt.Image[] southEyeHumunculous;
    java.awt.Image[] southEye; 
    
    String resultPath; 
    
    //String path="src"+File.separator+"metaphysic"+File.separator+"cells"+File.separator; 
    public CrystalBall(
            String northHandHumunculousPath,
            String northHandPath,
            String northEyePath,
            String northEyeHumunculousPath,
            String southHandHumunculousPath,
            String southHandPath,
            String southEyePath,
            String southEyeHumunculousPath,
            String resultPath
            )
    {
        this.northHandHumunculousPath=northHandHumunculousPath;
        this.northHandPath=northHandPath;
        this.northEyePath=northEyePath;
        this.northEyeHumunculousPath=northEyeHumunculousPath;
        this.southHandHumunculousPath=southHandHumunculousPath;
        this.southHandPath=southHandPath;
        this.southEyePath=southEyePath; 
        this.southEyeHumunculousPath=southEyeHumunculousPath;
        this.resultPath=resultPath;
        
        this.northHandHumunculous =getFiles(this.northHandHumunculousPath);  
        this.northHand =getFiles(this.northHandPath);
        this.northEye =getFiles(this.northEyePath);
        this.northEyeHumunculous =getFiles(this.northEyeHumunculousPath);
        this.southHandHumunculous =getFiles(this.southHandHumunculousPath);
        this.southHand =getFiles(this.southHandPath);
        this.southEye =getFiles(this.southEyePath);
        this.southEyeHumunculous =getFiles(this.southEyeHumunculousPath);
        
        northHandHumunculousRemaining=this.northHandHumunculous.length;
        northHandRemaining=this.northHand.length;
        northEyeHumunculousRemaining=this.northEye.length;
        northEyeRemaining=this.northEyeHumunculous.length;
        southHandHumunculousRemaining=this.southHandHumunculous.length;
        southHandRemaining=this.southHand.length;
        southEyeHumunculousRemaining=this.southEye.length;
        southEyeRemaining=this.southEyeHumunculous.length;  
    }
    
    public java.awt.Image[] getFiles(String path)
    {
        java.awt.Image[] imageFiles=new java.awt.Image[0];
        String[] files=new String[0];
        try{

            File directory=new File(path);
            
            if(directory.isDirectory())
            {
                files=directory.list();
                imageFiles=new java.awt.Image[files.length];
                for(int i=0;i<files.length;i++)
                {
                    File newFile=new File(path+File.separator+files[i]);
                    java.awt.Image newImage=ImageIO.read(newFile); 
                    imageFiles[i]=newImage;
                }
             
            }
        }catch(Exception i){
            System.out.print(i);
        }
        return imageFiles;
    }
    
    public boolean getImage(Triangle t)
    {
        boolean success=false;
        
           if(t.getCenter().coordinates[0]>0 & 
                   t.getCenter().coordinates[1]>0 &
                   t.getCenter().coordinates[2]>0 &
                   this.northHandHumunculousRemaining>0)
           {
               t.addImage(this.northHandHumunculous[this.northHandHumunculousRemaining-1]);
               northHandHumunculousRemaining--;
               success=true;
           }
               
           if(t.getCenter().coordinates[0]>0 & 
                   t.getCenter().coordinates[1]>0 &
                   t.getCenter().coordinates[2]<=0 &
                   this.northHandRemaining>0)
           {
               t.addImage(this.northHand[this.northHandRemaining-1]);
               northHandRemaining--;
               success=true;
           }
           
            if(t.getCenter().coordinates[0]>0 & 
                   t.getCenter().coordinates[1]<=0 &
                   t.getCenter().coordinates[2]>0 &
                   this.northEyeRemaining>0)
           {
               t.addImage(this.northEye[this.northEyeRemaining-1]);
               northEyeRemaining--;
               success=true;
           }
            
           if(t.getCenter().coordinates[0]>0 & 
                   t.getCenter().coordinates[1]<=0 &
                   t.getCenter().coordinates[2]<=0 &
                   this.northEyeHumunculousRemaining>0)
           {
               t.addImage(this.northEyeHumunculous[this.northEyeHumunculousRemaining-1]);
               northEyeHumunculousRemaining--;
               success=true;
           }
                       
           if(t.getCenter().coordinates[0]<=0 & 
                   t.getCenter().coordinates[1]>0 &
                   t.getCenter().coordinates[2]>0 &
                   this.southHandHumunculousRemaining>0)
           {
               t.addImage(this.southHandHumunculous[this.southHandHumunculousRemaining-1]);
               southHandHumunculousRemaining--;
               success=true;
           }
                                  
           if(t.getCenter().coordinates[0]<=0 & 
                   t.getCenter().coordinates[1]>0 &
                   t.getCenter().coordinates[2]<=0 &
                   this.southHandRemaining>0)
           {
               t.addImage(this.southHand[this.southHandRemaining-1]);
               southHandRemaining--;
               success=true;
           }
                                             
           if(t.getCenter().coordinates[0]<=0 & 
                   t.getCenter().coordinates[1]<=0 &
                   t.getCenter().coordinates[2]>0 &
                   this.southEyeRemaining>0)
           {
               t.addImage(this.southEye[this.southEyeRemaining-1]);
               southEyeRemaining--;
               success=true;
           }
           
           
           
           if(t.getCenter().coordinates[0]<=0 & 
                   t.getCenter().coordinates[1]<=0 &
                   t.getCenter().coordinates[2]<=0 &
                   this.southEyeHumunculousRemaining>0)
           {
               t.addImage(this.southEyeHumunculous[this.southEyeHumunculousRemaining-1]);
               southEyeHumunculousRemaining--;
               success=true;
           }            
           
           return success;    
    }
    
}
