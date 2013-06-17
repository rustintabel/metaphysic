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
public class AtomsStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
    
      
    
    public ArrayList<AtomPeerCovalentShellAsthetic> AtomPeerCovalentShellAstheticTypes
            =new ArrayList<AtomPeerCovalentShellAsthetic>();
    public ArrayList<AtomPeerElectronsAsthetic> AtomPeerElectronsAstheticTypes
            =new ArrayList<AtomPeerElectronsAsthetic>();
    public ArrayList<AtomPeerNucleousAsthetic> AtomPeerNucleousAstheticTypes
            =new ArrayList<AtomPeerNucleousAsthetic>();
    
    public ArrayList<AtomCovalentShellAsthetic> AtomCovalentShellAstheticTypes
            =new ArrayList<AtomCovalentShellAsthetic>();
    public ArrayList<AtomElectronsAsthetic> AtomElectronsAstheticTypes
            =new ArrayList<AtomElectronsAsthetic>(); 
    public ArrayList<AtomNucleousAsthetic> AtomNucleousAstheticTypes
            =new ArrayList<AtomNucleousAsthetic>();
    
    public ArrayList<AtomCovalentShellTissueFieldAsthetic> covalentShellTissueFeildTypes
            =new ArrayList<AtomCovalentShellTissueFieldAsthetic>();
    public ArrayList<AtomElectronTissueFieldAsthetic> atomElectronsTissueFieldAstheticTypes
            =new ArrayList<AtomElectronTissueFieldAsthetic>();
    public ArrayList<AtomNuclearTissueFieldAsthetic> atomNuclearTissueFieldAstheticTypes
            =new ArrayList<AtomNuclearTissueFieldAsthetic>();
    
    public void AtomsStrongAnthropicGaliosGroup()
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
        
        for(int i=1;i<118;i++)
        {
            
            covalentShellTissueFeildTypes.add(new AtomCovalentShellTissueFieldAsthetic());
            atomElectronsTissueFieldAstheticTypes.add(new  AtomElectronTissueFieldAsthetic());
            atomNuclearTissueFieldAstheticTypes.add(new  AtomNuclearTissueFieldAsthetic());
            
        }
    
    }
    
    
    
}
