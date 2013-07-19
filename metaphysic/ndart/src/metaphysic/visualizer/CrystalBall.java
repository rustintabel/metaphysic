/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import metaphysic.GeneralStrongAnthropicGaliosGroupFractle;

/**
 *One solid hyperdymentional sphere the quadrants of each contain representations
 * of the mechanisms through an asthetic. The equtorial circle contains the mechanisms 
 * of the quadrants of the central asthetic of the current spine. y spines orient the 
 * symmetry shell asthetic through the equator and x spines do it through the asthetic of the organs.
 * 
 * @author justin
 */
public class CrystalBall {
    
    int numberOfDimentions=3;
    BSPTree tree=new BSPTree(numberOfDimentions);
    
    public int northHandHumunculousRemaining=0;
    public int northHandRemaining=0;
    public int northEyeHumunculousRemaining=0;
    public int northEyeRemaining=0;
    
    public int equatorHandHumunculousRemaining=0;
    public int equatorHandRemaining=0;
    public int equatorEyeHumunculousRemaining=0;
    public int equatorEyeRemaining=0;    
    
    public int southHandHumunculousRemaining=0;
    public int southHandRemaining=0;
    public int southEyeHumunculousRemaining=0;
    public int southEyeRemaining=0;  
    
    String northHandHumunculousPath;
    String northHandPath;
    String northEyeHumunculousPath;
    String northEyePath;
    
    String equatorHandHumunculousPath;
    String equatorHandPath;
    String equatorEyeHumunculousPath;
    String equatorEyePath;
    
    String southHandHumunculousPath;
    String southHandPath;
    String southEyeHumunculousPath;
    String southEyePath; 
    
    String handDefaultImagePath="defaultImages"+"Foot.png";
    String footDefaultImagePath="defaultImages"+"Hand.png";
    String heartDefaultImagePath="defaultImages"+"Heart.png";
    
    java.awt.Image[] northHandHumunculous;
    java.awt.Image[] northHand;
    java.awt.Image[] northEyeHumunculous;
    java.awt.Image[] northEye;
    
    java.awt.Image[] equatorHandHumunculous;
    java.awt.Image[] equatorHand;
    java.awt.Image[] equatorEyeHumunculous;
    java.awt.Image[] equatorEye;    
    
    java.awt.Image[] southHandHumunculous;
    java.awt.Image[] southHand;
    java.awt.Image[] southEyeHumunculous;
    java.awt.Image[] southEye; 
    
    String symmetryShellsPath="src"+File.separator+"metaphysic";
    String resultPath; 
 

    public CrystalBall(String symetryShellFolder, String spineFolder, 
            GeneralStrongAnthropicGaliosGroupFractle metaPhysic)
    {
        symmetryShellsPath=symmetryShellsPath+File.separator+symetryShellFolder;
        String northPath="",southPath="",equatorPath="";
        
        if(spineFolder.equalsIgnoreCase("XSpineStrongAnthropicSensesGaliosGroupAsthetic"))
        {
            northPath="CellPeerRecombinationAsthetic";
            equatorPath="CellPeerReproductionAsthetic";           
            southPath="CellPeerPrintMakingAsthetic";
        }
        
        if(spineFolder.equalsIgnoreCase("XSpineStrongAnthropicSymetryShellGaliosGroupAsthetic"))
        {
            northPath="CellRecombinationAsthetic";
            equatorPath="CellReproductionAsthetic";           
            southPath="CellPrintMakingAsthetic";
        }
                
        if(spineFolder.equalsIgnoreCase("XSpineStrongAnthropicTissueFeildGaliosGroupAsthetic"))
        {
            northPath="CellTissueRecombinationAsthetic";
            equatorPath="CellTissueReproductionAsthetic";           
            southPath="CellTissuePrintMakingAsthetic";
        }
                        
        if(spineFolder.equalsIgnoreCase("YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic"))
        {
            northPath="CellPeerRecombinationAsthetic";
            equatorPath="CellRecombinationAsthetic";           
            southPath="CellTissueRecombinationAsthetic";
        }
                                
        if(spineFolder.equalsIgnoreCase("YSpineStrongAnthropicOrgansGaliosGroupAsthetic"))
        {
            northPath="CellPeerReproductionAsthetic";
            equatorPath="CellReproductionAsthetic";           
            southPath="CellTissueReproductionAsthetic";
        }
                                        
        if(spineFolder.equalsIgnoreCase("YSpineStrongAnthropicReceptorsGaliosGroupAsthetic"))
        {
            northPath="CellPeerPrintMakingAsthetic";
            equatorPath="CellPrintMakingAsthetic";           
            southPath="CellTissuePrintMakingAsthetic";
        }
        
        this.northHandHumunculousPath=symmetryShellsPath+File.separator+northPath+File.separator+"HandHumunculous";
        this.northHandPath=symmetryShellsPath+File.separator+northPath+File.separator+"Hand";
        this.northEyePath=symmetryShellsPath+File.separator+northPath+File.separator+"Eye";
        this.northEyeHumunculousPath=symmetryShellsPath+File.separator+northPath+File.separator+"EyeHumunculous";
        
        this.equatorHandHumunculousPath=symmetryShellsPath+File.separator+equatorPath+File.separator+"HandHumunculous";
        this.equatorHandPath=symmetryShellsPath+File.separator+equatorPath+File.separator+"Hand";
        this.equatorEyePath=symmetryShellsPath+File.separator+equatorPath+File.separator+"Eye";
        this.equatorEyeHumunculousPath=symmetryShellsPath+File.separator+equatorPath+File.separator+"EyeHumunculous";   
        
        this.southHandHumunculousPath=symmetryShellsPath+File.separator+southPath+File.separator+"HandHumunculous";
        this.southHandPath=symmetryShellsPath+File.separator+southPath+File.separator+"Hand";
        this.southEyePath=symmetryShellsPath+File.separator+southPath+File.separator+"Eye"; 
        this.southEyeHumunculousPath=symmetryShellsPath+File.separator+southPath+File.separator+"EyeHumunculous";
        
        this.resultPath=symmetryShellsPath+File.separator+spineFolder;
        
        this.northHandHumunculous =getFiles(this.northHandHumunculousPath);  
        this.northHand =getFiles(this.northHandPath);
        this.northEye =getFiles(this.northEyePath);
        this.northEyeHumunculous =getFiles(this.northEyeHumunculousPath);
        
        this.equatorHandHumunculous=getFiles(this.equatorHandHumunculousPath);
        this.equatorHand=getFiles(this.equatorHandPath);
        this.equatorEye=getFiles(this.equatorEyePath); 
        this.equatorEyeHumunculous=getFiles(this.equatorEyeHumunculousPath);
        
        
        this.southHandHumunculous =getFiles(this.southHandHumunculousPath);
        this.southHand =getFiles(this.southHandPath);
        this.southEye =getFiles(this.southEyePath);
        this.southEyeHumunculous =getFiles(this.southEyeHumunculousPath);
        
        northHandHumunculousRemaining=this.northHandHumunculous.length;
        northHandRemaining=this.northHand.length;
        northEyeRemaining=this.northEye.length;      
        northEyeHumunculousRemaining=this.northEyeHumunculous.length; 

        
        equatorHandHumunculousRemaining=this.equatorHandHumunculous.length;
        equatorHandRemaining=this.equatorHand.length;
        equatorEyeRemaining=this.equatorEye.length;
        equatorEyeHumunculousRemaining=this.equatorEyeHumunculous.length;
          
        
        southHandHumunculousRemaining=this.southHandHumunculous.length;
        southHandRemaining=this.southHand.length;
        southEyeHumunculousRemaining=this.southEye.length;
        southEyeRemaining=this.southEyeHumunculous.length;  
        
        tree.buildTreeFromRandomlyPositionedDisjointImageFiles(this);
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
        boolean[] zzzzza=new boolean[numberOfDimentions];
        if(northHandHumunculousRemaining>0&&success==false)
        {
                    zzzzza[0]=true;
                    zzzzza[1]=true;
                    zzzzza[2]=true;
                    t.orientToQuadrant(zzzzza, this.northHandHumunculous[this.northHandHumunculousRemaining-1]);
                    northHandHumunculousRemaining--;
                    success=true;
        }
        
        if(northHandRemaining>0&&success==false)
        {
           
                    zzzzza[0]=true;
                    zzzzza[1]=false;
                    zzzzza[2]=true;
                    t.orientToQuadrant(zzzzza, this.northHand[this.northHandRemaining-1]);
                    northHandRemaining--;
                    success=true;
        }
                
        if(northEyeRemaining>0&&success==false)
        {
           
                    zzzzza[0]=false;
                    zzzzza[1]=true;
                    zzzzza[2]=true;
                    t.orientToQuadrant(zzzzza, this.northEye[this.northEyeRemaining-1]);
                    northEyeRemaining--;
                    success=true;
        }
                        
        if(northEyeHumunculousRemaining>0&&success==false)
        {
           
                    zzzzza[0]=false;
                    zzzzza[1]=false;
                    zzzzza[2]=true;
                    t.orientToQuadrant(zzzzza, this.northEyeHumunculous[this.northEyeHumunculousRemaining-1]);
                    northEyeHumunculousRemaining--;
                    success=true;
        }
        
    
                    zzzzza[0]=true;
                    zzzzza[1]=true;
                    zzzzza[2]=false;
         if(equatorHandHumunculousRemaining>0&&success==false)
        {

                    t.orientToEquitorialPlane(zzzzza, this.equatorHandHumunculous[this.equatorHandHumunculousRemaining-1]);
                    equatorHandHumunculousRemaining--;
                    success=true;
        }
        
        if(equatorHandRemaining>0&&success==false)
        {

                    t.orientToEquitorialPlane(zzzzza, this.equatorHand[this.equatorHandRemaining-1]);
                    equatorHandRemaining--;
                    success=true;
        }
                
        if(equatorEyeRemaining>0&&success==false)
        {
            
                    t.orientToEquitorialPlane(zzzzza, this.equatorEye[this.equatorEyeRemaining-1]);
                    equatorEyeRemaining--;
                    success=true;
        }
                        
        if(equatorEyeHumunculousRemaining>0&&success==false)
        {
           
                    t.orientToEquitorialPlane(zzzzza, this.equatorEyeHumunculous[this.equatorEyeHumunculousRemaining-1]);
                    equatorEyeHumunculousRemaining--;
                    success=true;
        }       
        
        
        
        
        
        if(southHandHumunculousRemaining>0&&success==false)
        {
           
                    zzzzza[0]=true;
                    zzzzza[1]=true;
                    zzzzza[2]=false;
                    t.orientToQuadrant(zzzzza, this.southHandHumunculous[this.southHandHumunculousRemaining-1]);
                    southHandHumunculousRemaining--;
                    success=true;
        }
        
        if(southHandRemaining>0&&success==false)
        {
           
                    zzzzza[0]=true;
                    zzzzza[1]=false;
                    zzzzza[2]=false;
                    t.orientToQuadrant(zzzzza, this.southHand[this.southHandRemaining-1]);
                    southHandRemaining--;
                    success=true;
        }
                
        if(southEyeRemaining>0&&success==false)
        {
           
                    zzzzza[0]=false;
                    zzzzza[1]=true;
                    zzzzza[2]=false;
                    t.orientToQuadrant(zzzzza, this.southEye[this.southEyeRemaining-1]);
                    southEyeRemaining--;
                    success=true;
        }
                        
        if(southEyeHumunculousRemaining>0&&success==false)
        {
           
                    zzzzza[0]=false;
                    zzzzza[1]=false;
                    zzzzza[2]=false;
                    t.orientToQuadrant(zzzzza, this.southEyeHumunculous[this.southEyeHumunculousRemaining-1]);
                    southEyeHumunculousRemaining--;
                    success=true;
        }
        
             
           
           return success;    
    }
    
    public void  GenerateVideo(double currentRadians)
    {
            try{
 
            BufferedImage temp=null;
 
            int dimentionx=0;
 
            int dimentiony=1;
 
            double radiansSoFar=0;
 
            for(int i=0;i<200;i++){
 
            temp=tree.drawBSPTree();   
 
            radiansSoFar+=currentRadians;
 
            if(radiansSoFar>3.14*2)
 
            {
 
            radiansSoFar=0;
 
                if(dimentiony<numberOfDimentions)
 
                {
 
                    dimentiony++;
 
                }
 
                else
 
                {
 
                    if(dimentionx<numberOfDimentions)
 
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
 
            ImageIO.write(temp,"jpg",
                    new File(this.resultPath+File.separator+Integer.toString(i)+".jpg"));
 
            }
 
        }catch(Exception i)
 
        {
 
            System.out.println("dfgdg");
 
        }
 
    }
 
    }
    
    

