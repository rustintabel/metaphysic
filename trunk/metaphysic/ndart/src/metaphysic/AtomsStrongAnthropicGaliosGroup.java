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
public class AtomsStrongAnthropicGaliosGroup {
    
      
    
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

        StrongAnthropicGaliosGroup strongAnthropicGaliosGroup=
                new StrongAnthropicGaliosGroup();
        for(int i=1;i<118;i++)
        {
            AtomCovalentShellTissueFieldAsthetic covalentShell=new AtomCovalentShellTissueFieldAsthetic();
            covalentShellTissueFeildTypes.add(covalentShell);
            atomElectronsTissueFieldAstheticTypes.add(new  AtomElectronTissueFieldAsthetic());
            atomNuclearTissueFieldAstheticTypes.add(new  AtomNuclearTissueFieldAsthetic());
        }
    
    }
    
    
}
