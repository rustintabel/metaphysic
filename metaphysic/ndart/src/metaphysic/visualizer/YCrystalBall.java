/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.visualizer;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import metaphysic.*;

/**
 *One solid hyperdymentional sphere the quadrants of each contain representations
 * of the mechanisms through an asthetic. The equtorial circle contains the mechanisms 
 * of the quadrants of the central asthetic of the current spine. y spines orient the 
 * symmetry shell asthetic through the equator and x spines do it through the asthetic of the organs.
 * 
 * @author justin
 */
public class YCrystalBall {
    
    int numberOfDimentions=3;
    BSPTree tree=new BSPTree(numberOfDimentions);
    YSpineStrongAnthropicGaliosGroupAsthetic spine;
    
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
    
    public boolean northHandHumunculousEmpty=true;
    public boolean northHandEmpty=true;
    public boolean northEyeHumunculousEmpty=true;
    public boolean northEyeEmpty=true;
    
    public boolean equatorHandHumunculousEmpty=true;
    public boolean equatorHandEmpty=true;
    public boolean equatorEyeHumunculousEmpty=true;
    public boolean equatorEyeEmpty=true;    
    
    public boolean southHandHumunculousEmpty=true;
    public boolean southHandEmpty=true;
    public boolean southEyeHumunculousEmpty=true;
    public boolean southEyeEmpty=true;  
    
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
    
    String handDefaultImagePath="defaultImages"+File.pathSeparator+"Foot.png";
    String footDefaultImagePath="defaultImages"+File.pathSeparator+"Hand.png";
    String heartDefaultImagePath="defaultImages"+File.pathSeparator+"Heart.png";
    
    java.awt.Image[] northHandHumunculousImages;
    java.awt.Image[] northHandImages;
    java.awt.Image[] northEyeHumunculousImages;
    java.awt.Image[] northEyeImages;
    
    java.awt.Image[] equatorHandHumunculousImages;
    java.awt.Image[] equatorHandImages;
    java.awt.Image[] equatorEyeHumunculousImages;
    java.awt.Image[] equatorEyeImages;    
    
    java.awt.Image[] southHandHumunculousImages;
    java.awt.Image[] southHandImages;
    java.awt.Image[] southEyeHumunculousImages;
    java.awt.Image[] southEyeImages; 
    
    java.awt.Image[] naturalModularityImages; 
    
    String symmetryShellsPath="src"+File.separator+"metaphysic";
    String defaultImagesPath=File.separator+"defaultImages";
    String resultPath; 
 
    char spineOrientation=' ';


    public YCrystalBall(YSpineStrongAnthropicGaliosGroupAsthetic spine, String spineFolder,String symetryShellFolderName)
    {
        String symmetryShellsPath="";
        this.spine=spine;
        symmetryShellsPath=this.symmetryShellsPath+File.separator+symetryShellFolderName;
        String northPath="",southPath="",equatorPath="";
        
        System.out.println(symmetryShellsPath);
        if(spineFolder.contains("XSpineStrongAnthropicSensesGaliosGroupAsthetic"))
        {
            northPath="CellPeerRecombinationAsthetic";
            equatorPath="CellPeerReproductionAsthetic";           
            southPath="CellPeerPrintMakingAsthetic";
            spineOrientation='X';
        }
        
        if(spineFolder.contains("XSpineStrongAnthropicSymetryShellGaliosGroupAsthetic"))
        {
            northPath="CellRecombinationAsthetic";
            equatorPath="CellReproductionAsthetic";           
            southPath="CellPrintMakingAsthetic";
            spineOrientation='X';
        }
                
        if(spineFolder.contains("XSpineStrongAnthropicTissueFeildGaliosGroupAsthetic"))
        {
            northPath="CellTissueRecombinationAsthetic";
            equatorPath="CellTissueReproductionAsthetic";           
            southPath="CellTissuePrintMakingAsthetic";
            spineOrientation='X';
        }
                        
        if(spineFolder.contains("YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic"))
        {
            northPath="CellPeerRecombinationAsthetic";
            equatorPath="CellRecombinationAsthetic";           
            southPath="CellTissueRecombinationAsthetic";
            
            spineOrientation='Y';
        }
                                
        if(spineFolder.contains("YSpineStrongAnthropicOrgansGaliosGroupAsthetic"))
        {
            northPath="CellPeerReproductionAsthetic";
            equatorPath="CellReproductionAsthetic";           
            southPath="CellTissueReproductionAsthetic";
            spineOrientation='Y';
        }
                                        
        if(spineFolder.contains("YSpineStrongAnthropicReceptorsGaliosGroupAsthetic"))
        {
            northPath="CellPeerPrintMakingAsthetic";
            equatorPath="CellPrintMakingAsthetic";           
            southPath="CellTissuePrintMakingAsthetic";
            spineOrientation='Y';
        }
        
        northPath=getFolderName(symmetryShellsPath,northPath);
        equatorPath=getFolderName(symmetryShellsPath,equatorPath);
        southPath=getFolderName(symmetryShellsPath,southPath);
        
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
        
        spineFolder=getFolderName(symmetryShellsPath,spineFolder);
        this.resultPath=symmetryShellsPath+File.separator+spineFolder;
        
        this.naturalModularityImages=getFiles(this.symmetryShellsPath+File.separator+this.defaultImagesPath);
        
        this.northHandHumunculousImages =getFiles(this.northHandHumunculousPath);  
        this.northHandImages =getFiles(this.northHandPath);
        this.northEyeImages =getFiles(this.northEyePath);
        this.northEyeHumunculousImages =getFiles(this.northEyeHumunculousPath);
        
        this.equatorHandHumunculousImages=getFiles(this.equatorHandHumunculousPath);
        this.equatorHandImages=getFiles(this.equatorHandPath);
        this.equatorEyeImages=getFiles(this.equatorEyePath); 
        this.equatorEyeHumunculousImages=getFiles(this.equatorEyeHumunculousPath);
        
        
        this.southHandHumunculousImages =getFiles(this.southHandHumunculousPath);
        this.southHandImages =getFiles(this.southHandPath);
        this.southEyeImages =getFiles(this.southEyePath);
        this.southEyeHumunculousImages =getFiles(this.southEyeHumunculousPath);
        
        this.northHandHumunculousRemaining=this.northHandHumunculousImages.length;
        if(this.northHandHumunculousRemaining!=0){this.northHandHumunculousEmpty=false;}
        this.northHandRemaining=this.northHandImages.length;
        if(this.northHandRemaining!=0){this.northHandEmpty=false;}
        this.northEyeRemaining=this.northEyeImages.length;  
        if(this.northEyeRemaining!=0){this.northEyeEmpty=false;}
        this.northEyeHumunculousRemaining=this.northEyeHumunculousImages.length;
        if(this.northEyeHumunculousRemaining!=0){this.northEyeHumunculousEmpty=false;}

        this.equatorHandHumunculousRemaining=this.equatorHandHumunculousImages.length;
        if(this.equatorHandHumunculousRemaining!=0){this.equatorHandHumunculousEmpty=false;}
        this.equatorHandRemaining=this.equatorHandImages.length;
        if(this.equatorHandRemaining!=0){this.equatorHandEmpty=false;}
        this.equatorEyeRemaining=this.equatorEyeImages.length;
        if(this.equatorEyeRemaining!=0){this.equatorEyeEmpty=false;}
        this.equatorEyeHumunculousRemaining=this.equatorEyeHumunculousImages.length;
        if(this.equatorEyeHumunculousRemaining!=0){this.equatorEyeHumunculousEmpty=false;}
          
        this.southHandHumunculousRemaining=this.southHandHumunculousImages.length;
        if(this.southHandHumunculousRemaining!=0){this.southHandHumunculousEmpty=false;}
        this.southHandRemaining=this.southHandImages.length;
        if(this.southHandRemaining!=0){this.southHandEmpty=false;}
        this.southEyeHumunculousRemaining=this.southEyeImages.length;
        if(this.southEyeHumunculousRemaining!=0){this.southEyeHumunculousEmpty=false;}
        this.southEyeRemaining=this.southEyeHumunculousImages.length; 
        if(this.southEyeRemaining!=0){this.southEyeEmpty=false;}
        
        tree.buildTreeFromRandomlyPositionedDisjointImageFiles(this);
    }
    
        public String getFolderName(String path,String preParentheticalName)
    {
        String[] folderNames=new String[0];

        try{

            File directory=new File(path);
            
            if(directory.isDirectory())
            {
                folderNames=directory.list();
               
                for(int i=0;i<folderNames.length;i++)
                {
                    if(folderNames[i].contains(preParentheticalName))
                    {
                        directory=new File(path+File.separator+folderNames[i]);
                        if(directory.isDirectory())
                        {
                            return folderNames[i];
                        }
                        
                    }  
                }
            }
        }catch(Exception i){
            System.out.print(i.getMessage());
        }
        return "";
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
                    if((path+File.separator+files[i]).contains("jpg")
                            ||(path+File.separator+files[i]).contains("png"))
                    {
                        File newFile=new File(path+File.separator+files[i]);
                        if(newFile.isFile())
                        {
                            java.awt.Image newImage=ImageIO.read(newFile); 
                            imageFiles[i]=newImage;
                        }
                    }  
                }
            }
        }catch(Exception i){
            System.out.print(i.getMessage());
        }
        return imageFiles;
    }
    
    

    
    public boolean getImage(BSPTreeNode root,BSPTreeNode newNode){
        
        Triangle t=newNode.getTriangle();
        boolean success=false;
        double heightByWidth=0;
        boolean[] zzzzza=new boolean[numberOfDimentions];
        
        zzzzza[0]=true;
        zzzzza[1]=true;
        zzzzza[2]=true;
        int eqitorialPlanedimention=2;
        if(northHandHumunculousRemaining>0&&success==false)
        {
            heightByWidth=(this.northHandHumunculousImages
                    [this.northHandHumunculousRemaining-1].getHeight(null))/
                    (this.northHandHumunculousImages
                    [this.northHandHumunculousRemaining-1].getWidth(null));
            newNode.setRandTriangle(heightByWidth);
            t.orientToQuadrant(zzzzza, this.northHandHumunculousImages
                    [this.northHandHumunculousRemaining-1]);
            if(root.addNode(newNode))
            {
                northHandHumunculousRemaining--;            
                success=true;           
            }
        }
        
        if(this.northHandHumunculousEmpty==true){
                   if(this.spine.sensesSuperHandHumunculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.sensesSuperHandHumunculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.sensesSuperHandHumunculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
        
       zzzzza[0]=true;
       zzzzza[1]=false;
       zzzzza[2]=true;
        if(northHandRemaining>0&&success==false)
        {
                    t.orientToQuadrant(zzzzza, this.northHandImages[this.northHandRemaining-1]);
                    northHandRemaining--;
                    success=true;
        }
        if(this.northHandEmpty==true){
                   if(this.spine.sensesSuperHand.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.sensesSuperHand.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.sensesSuperHand.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
               
       zzzzza[0]=false;
       zzzzza[1]=false;
       zzzzza[2]=true;       
        if(northEyeRemaining>0&&success==false)
        {
                    t.orientToQuadrant(zzzzza, this.northEyeImages[this.northEyeRemaining-1]);
                    northEyeRemaining--;
                    success=true;
        }
        if(this.northEyeEmpty==true){
                   if(this.spine.sensesSuperEye.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.sensesSuperEye.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.sensesSuperEye.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
                        
       zzzzza[0]=false;
       zzzzza[1]=true;
       zzzzza[2]=true;
        if(northEyeHumunculousRemaining>0&&success==false)
        {
                    t.orientToQuadrant(zzzzza, this.northEyeHumunculousImages[this.northEyeHumunculousRemaining-1]);
                    northEyeHumunculousRemaining--;
                    success=true;
        }
        if(this.northEyeHumunculousEmpty==true){
                   if(this.spine.sensesSuperEyeHumunnculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.sensesSuperEyeHumunnculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.sensesSuperEyeHumunnculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
        
        

        if(spineOrientation=='Y')
        {
                    eqitorialPlanedimention=2;        
        }else
        {
                    eqitorialPlanedimention=0;  
        }

        zzzzza[0]=true;
        zzzzza[1]=true;
        zzzzza[2]=true;        
        if(equatorHandHumunculousRemaining>0&&success==false)
        {

                    t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza, this.equatorHandHumunculousImages[this.equatorHandHumunculousRemaining-1]);
                    equatorHandHumunculousRemaining--;
                    success=true;
        }
        if(this.equatorHandHumunculousEmpty==true){
                   if(this.spine.organSuperHandHumunculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.organSuperHandHumunculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.organSuperHandHumunculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
        
        
        zzzzza[0]=true;
        zzzzza[1]=false;
        zzzzza[2]=true;
        if(equatorHandRemaining>0&&success==false)
        {

                    t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza, this.equatorHandImages[this.equatorHandRemaining-1]);
                    equatorHandRemaining--;
                    success=true;
        }
        if(this.equatorHandEmpty==true){
                   if(this.spine.organSuperHand.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.organSuperHand.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.organSuperHand.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
                
        zzzzza[0]=false;
        zzzzza[1]=false;
        zzzzza[2]=true;
        if(equatorEyeRemaining>0&&success==false)
        {
            
                    t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza, this.equatorEyeImages[this.equatorEyeRemaining-1]);
                    equatorEyeRemaining--;
                    success=true;
        }
        if(this.equatorEyeEmpty==true){
                   if(this.spine.organSuperEye.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.organSuperEye.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.organSuperEye.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
           
        
        zzzzza[0]=false;
        zzzzza[1]=true;
        zzzzza[2]=true;
        if(equatorEyeHumunculousRemaining>0&&success==false)
        {
           
                    t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza, this.equatorEyeHumunculousImages[this.equatorEyeHumunculousRemaining-1]);
                    equatorEyeHumunculousRemaining--;
                    success=true;
        }       
        if(this.equatorEyeHumunculousEmpty==true){
                   if(this.spine.organSuperEyeHumunnculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.organSuperEyeHumunnculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.organSuperEyeHumunnculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToEquitorialPlane(eqitorialPlanedimention,zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
        
        
        
        zzzzza[0]=false;
        zzzzza[1]=true;
        zzzzza[2]=true;
        if(southHandHumunculousRemaining>0&&success==false)
        {
           
                    zzzzza[0]=true;
                    zzzzza[1]=true;
                    zzzzza[2]=false;
                    t.orientToQuadrant(zzzzza, this.southHandHumunculousImages[this.southHandHumunculousRemaining-1]);
                    southHandHumunculousRemaining--;
                    success=true;
        }
        if(this.southHandHumunculousEmpty==true){
                   if(this.spine.tissueSuperHandHumunculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.tissueSuperHandHumunculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.tissueSuperHandHumunculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }
        
        zzzzza[0]=true;
        zzzzza[1]=false;
        zzzzza[2]=false;
        if(southHandRemaining>0&&success==false)
        {
           

                    t.orientToQuadrant(zzzzza, this.southHandImages[this.southHandRemaining-1]);
                    southHandRemaining--;
                    success=true;
        }
        if(this.southHandEmpty==true){
                   if(this.spine.tissueSuperHand.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.tissueSuperHand.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.tissueSuperHand.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }    
        
        zzzzza[0]=false;
        zzzzza[1]=false;
        zzzzza[2]=false;        
        if(southEyeRemaining>0&&success==false)
        {
                    t.orientToQuadrant(zzzzza, this.southEyeImages[this.southEyeRemaining-1]);
                    southEyeRemaining--;
                    success=true;
        }
                if(this.southEyeEmpty==true){
                   if(this.spine.tissueSuperEye.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.tissueSuperEye.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.tissueSuperEye.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
                   success=true;
       }  
                        
        zzzzza[0]=false;
        zzzzza[1]=true;
        zzzzza[2]=false;        
        if(southEyeHumunculousRemaining>0&&success==false)
        {
                    t.orientToQuadrant(zzzzza, this.southEyeHumunculousImages[this.southEyeHumunculousRemaining-1]);
                    southEyeHumunculousRemaining--;
                    success=true;
        }
                if(this.southEyeHumunculousEmpty==true){
                   if(this.spine.tissueSuperEyeHumunnculous.astheticType
                           .contains("Recombination"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[2]);
                   }

                   if(this.spine.tissueSuperEyeHumunnculous.astheticType
                           .contains("Reproduction"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[1]);
                   }    

                   if(this.spine.tissueSuperEyeHumunnculous.astheticType
                           .contains("PrintMaking"))
                   {
                       t.orientToQuadrant(zzzzza,naturalModularityImages[0]);
                   }  
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
    
    

