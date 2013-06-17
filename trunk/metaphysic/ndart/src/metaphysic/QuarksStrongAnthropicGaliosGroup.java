/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class QuarksStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
   
                    
    public ArrayList<SurfaceCovalentShellProbabilityDistributionFunctionAsthetic> 
            SurfaceCovalentShellProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<SurfaceCovalentShellProbabilityDistributionFunctionAsthetic>();
    public ArrayList<ElectronProbabilityDistributionFunctionAsthetic> 
            ElectronProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<ElectronProbabilityDistributionFunctionAsthetic>();
    public ArrayList<NuclearProbabilityDistributionFunctionAsthetic> 
            NuclearProbabilityDistributionFunctionAstheticTypes
            =new ArrayList<NuclearProbabilityDistributionFunctionAsthetic>();
    
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
    
    public void QuarksStrongAnthropicGaliosGroup()
    {
        Phenomina handVector=new Phenomina();
        handVector.setName("Hand Phenomina");
        handVector.automorphicAdd(this.CellRecombinationAsthetic);
        handVector.automorphicAdd(this.CellReproductionAsthetic);
        symetryShell.addPhenomina(handVector);
        
        
        Phenomina eyeVector=new Phenomina();
        eyeVector.setName("Eye Phenomina");
        eyeVector.automorphicAdd(this.CellRecombinationAsthetic);
        eyeVector.automorphicAdd(this.CellReproductionAsthetic);
        symetryShell.addPhenomina(eyeVector);
    }

            
}
