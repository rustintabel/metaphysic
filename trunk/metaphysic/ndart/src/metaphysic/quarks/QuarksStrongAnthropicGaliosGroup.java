/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.quarks;

import java.util.ArrayList;
import metaphysic.GeneralStrongAnthropicGaliosGroupFractle;
import metaphysic.Phenomina;
import metaphysic.PrintMakingAsthetic;
import metaphysic.RecombinationAsthetic;
import metaphysic.ReproductionAsthetic;
import metaphysic.StrongAnthropicGaliosGroup;

/**
 *
 * @author justin
 */
public class QuarksStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
   
                    
    public ArrayList<CenterOfGravityAsthetic> 
            SurfaceCovalentShellProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<CenterOfGravityAsthetic>();
    public ArrayList<ElectronsProbabilityDistributionFunctionAsthetic> 
            ElectronProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<ElectronsProbabilityDistributionFunctionAsthetic>();
    public ArrayList<VanderwallsAsthetic> 
            NuclearProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<VanderwallsAsthetic>();
    
    public ArrayList<CovalentShellAsthetic> CovalentShellAstheticTypes
            =new ArrayList<CovalentShellAsthetic>();
    public ArrayList<ProtonAsthetic> ProtonAstheticTypes
            =new ArrayList<ProtonAsthetic>(); 
    public ArrayList<NeutronAsthetic> NeutronAstheticTypes
            =new ArrayList<NeutronAsthetic>();
    
    public ArrayList<ElectronElectronTissueFieldAsthetic> ElectronElectronTissueFieldAstheticTypes
            =new ArrayList<ElectronElectronTissueFieldAsthetic>();
    public ArrayList<UpUpQuarkTissueFieldAshetic> UpUpQuarkTissueFieldAsheticTypes
            =new ArrayList<UpUpQuarkTissueFieldAshetic>();
    public ArrayList<DownDownQuarkTissueFeildAsthetic> DownDownQuarkTissueFeildAstheticTypes
            =new ArrayList<DownDownQuarkTissueFeildAsthetic>();
    
    public QuarksStrongAnthropicGaliosGroup(            
            GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild
            )
    {
        super(
                new RecombinationAsthetic(),new ReproductionAsthetic(),new PrintMakingAsthetic(),
                generalInformationFeild
                );
        name="quarks";
        
        
                    //Add the 9 canonicle asthetics to a matrix.
            asthetics[0][0]=brainRoleSpaceOutsideEdge=new CenterOfGravityAsthetic();//through brownian motion and angular momentum
            asthetics[0][1]=bodyRoleSpaceOutsideEdge=new VanderwallsAsthetic();
            asthetics[0][2]=sensesRoleSpaceOutsideEdge=new CovalentShellAsthetic();
            
            asthetics[1][0]=brain=new NeutronAsthetic();
            asthetics[1][1]=body=new ProtonAsthetic();
            asthetics[1][2]=senses=new ElectronsProbabilityDistributionFunctionAsthetic();
            
            asthetics[2][0]=brainInformationFeildTissue=new UpUpQuarkTissueFieldAshetic();
            asthetics[2][1]=bodyInformationFeildTissue=new DownDownQuarkTissueFeildAsthetic();
            asthetics[2][2]=senseInformationFeildTissue=new ElectronElectronTissueFieldAsthetic();
            
      //  Phenomina handVector=new Phenomina();
       // handVector.setName("Hand Phenomina");
       // handVector.automorphicAdd(this.CellRecombinationAsthetic);
       // handVector.automorphicAdd(this.CellReproductionAsthetic);
       // symetryShell.addPhenomina(handVector);
        
        
        //Phenomina eyeVector=new Phenomina();
        //eyeVector.setName("Eye Phenomina");
        //eyeVector.automorphicAdd(this.CellRecombinationAsthetic);
        //eyeVector.automorphicAdd(this.CellReproductionAsthetic);
        //symetryShell.addPhenomina(eyeVector);
    }

            
}
