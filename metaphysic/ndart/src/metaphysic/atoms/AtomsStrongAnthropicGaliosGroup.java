/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.atoms;
import metaphysic.atoms.AtomNuclearTissueFieldAsthetic;
import metaphysic.atoms.AtomElectronTissueFieldAsthetic;
import metaphysic.atoms.AtomCovalentShellTissueFieldAsthetic;
import metaphysic.atoms.AtomNucleousAsthetic;
import metaphysic.atoms.AtomElectronsAsthetic;
import metaphysic.atoms.AtomCovalentShellAsthetic;
import metaphysic.atoms.AtomPeerNucleousAsthetic;
import metaphysic.atoms.AtomPeerElectronsAsthetic;
import metaphysic.atoms.AtomPeerCovalentShellAsthetic;
import java.util.ArrayList;
import metaphysic.GeneralStrongAnthropicGaliosGroupFractle;
import metaphysic.*;
import metaphysic.PrintMakingAsthetic;
import metaphysic.RecombinationAsthetic;
import metaphysic.ReproductionAsthetic;
import metaphysic.StrongAnthropicGaliosGroup;
import metaphysic.quarks.CenterOfGravityAsthetic;
import metaphysic.quarks.CovalentShellAsthetic;
import metaphysic.quarks.DownDownQuarkTissueFeildAsthetic;
import metaphysic.quarks.ElectronElectronTissueFieldAsthetic;
import metaphysic.quarks.ElectronsProbabilityDistributionFunctionAsthetic;
import metaphysic.quarks.NeutronAsthetic;
import metaphysic.quarks.ProtonAsthetic;
import metaphysic.quarks.UpUpQuarkTissueFieldAshetic;
import metaphysic.quarks.VanderwallsAsthetic;
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
    
    public AtomsStrongAnthropicGaliosGroup(
            RecombinationAsthetic heart,
            ReproductionAsthetic hand,
            PrintMakingAsthetic foot,            
            GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild
            )
    {
        super(heart,hand,foot,generalInformationFeild);
        name="atoms";
        
            asthetics[0][0]=brainRoleSpaceOutsideEdge=new AtomPeerNucleousAsthetic();//through brownian motion and angular momentum
            asthetics[0][1]=bodyRoleSpaceOutsideEdge=new AtomPeerElectronsAsthetic();
            asthetics[0][2]=sensesRoleSpaceOutsideEdge=new AtomPeerCovalentShellAsthetic();
            
            asthetics[1][0]=brain=new AtomNucleousAsthetic();
            asthetics[1][1]=body=new AtomElectronsAsthetic();
            asthetics[1][2]=senses=new AtomCovalentShellAsthetic();
            
            asthetics[2][0]=brainInformationFeildTissue=new AtomNuclearTissueFieldAsthetic();
            asthetics[2][1]=bodyInformationFeildTissue=new AtomElectronTissueFieldAsthetic();
            asthetics[2][2]=senseInformationFeildTissue=new AtomCovalentShellTissueFieldAsthetic();
        
        //Phenomina handVector=new Phenomina();
        //handVector.setName("Hand Phenomina");
        //handVector.automorphicAdd(this.CellRecombinationAsthetic);
        //handVector.automorphicAdd(this.CellReproductionAsthetic);
        //symetryShell.addPhenomina(handVector);
        
        
        //Phenomina eyeVector=new Phenomina();
        //eyeVector.setName("Eye Phenomina");
        //eyeVector.automorphicAdd(this.CellRecombinationAsthetic);
        //eyeVector.automorphicAdd(this.CellReproductionAsthetic);
        //symetryShell.addPhenomina(eyeVector);
        
        //for(int i=1;i<118;i++)
        //{
            
          //  covalentShellTissueFeildTypes.add(new AtomCovalentShellTissueFieldAsthetic(i));
          //  atomElectronsTissueFieldAstheticTypes.add(new  AtomElectronTissueFieldAsthetic());
          //  atomNuclearTissueFieldAstheticTypes.add(new  AtomNuclearTissueFieldAsthetic());
            
        //}
    
    }
    
    
    
}
