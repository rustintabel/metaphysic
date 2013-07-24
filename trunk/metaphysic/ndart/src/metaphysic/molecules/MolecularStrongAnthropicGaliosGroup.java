/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.molecules;

import metaphysic.molecules.MolecularReproductionPolymerAsthetic;
import metaphysic.molecules.MolecularRecombinationPolymer;
import metaphysic.atoms.AtomNuclearTissueFieldAsthetic;
import metaphysic.atoms.AtomElectronTissueFieldAsthetic;
import metaphysic.atoms.AtomCovalentShellTissueFieldAsthetic;
import java.util.ArrayList;
import metaphysic.GeneralStrongAnthropicGaliosGroupFractle;
import metaphysic.PrintMakingAsthetic;
import metaphysic.RecombinationAsthetic;
import metaphysic.ReproductionAsthetic;
import metaphysic.StrongAnthropicGaliosGroup;
import metaphysic.atoms.AtomCovalentShellAsthetic;
import metaphysic.atoms.AtomElectronsAsthetic;
import metaphysic.atoms.AtomNucleousAsthetic;
import metaphysic.atoms.AtomPeerCovalentShellAsthetic;
import metaphysic.atoms.AtomPeerElectronsAsthetic;
import metaphysic.atoms.AtomPeerNucleousAsthetic;

/**
 *
 * @author justin
 */
public class MolecularStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
    
            
     ArrayList<MolecularRecombinationPolymer> molecularRecombinationPolymerTypes
            =new ArrayList<MolecularRecombinationPolymer>();
    ArrayList<MolecularReproductionPolymerAsthetic> molecularReproductionPolymerAstheticTypes
            =new ArrayList<MolecularReproductionPolymerAsthetic>();
    ArrayList<MolecularPrintMakingPolymerAsthetic> molecularPrintMakingPolymerAstheticTypes
            =new ArrayList<MolecularPrintMakingPolymerAsthetic>();           
            
            
    ArrayList<MolecularCovalentBondAsthetic> molecularCovalentBondAstheticTypes
            =new ArrayList<MolecularCovalentBondAsthetic>();
    ArrayList<MolecularIonicBondAsthetic> molecularIonicBondAstheticTypes
            =new ArrayList<MolecularIonicBondAsthetic>();
    ArrayList<MolecularVanderwalsForcesAsthetic> molecularVanderwalsForcesAstheticTypes
            =new ArrayList<MolecularVanderwalsForcesAsthetic>();
    
    public String name="molecules";
    
public MolecularStrongAnthropicGaliosGroup(           
            RecombinationAsthetic heart,
            ReproductionAsthetic hand,
            PrintMakingAsthetic foot,            
            GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild
            )
    {
        super(heart,hand,foot,generalInformationFeild);
        name="atoms";
        
            asthetics[0][0]=brainRoleSpaceOutsideEdge=new MolecularRecombinationPolymer();//through brownian motion and angular momentum
            asthetics[0][1]=bodyRoleSpaceOutsideEdge=new MolecularReproductionPolymerAsthetic();
            asthetics[0][2]=sensesRoleSpaceOutsideEdge=new MolecularPrintMakingPolymerAsthetic();
            
            asthetics[1][0]=brain=new MolecularIonicBondAsthetic();
            asthetics[1][1]=body=new MolecularCovalentBondAsthetic();
            asthetics[1][2]=senses=new MolecularVanderwalsForcesAsthetic();
            
            asthetics[2][0]=brainInformationFeildTissue=new MolecularTissueFeildNucleousAsthetic();
            asthetics[2][1]=bodyInformationFeildTissue=new MolecularTissueFieldElectronsAsthetic();
            asthetics[2][2]=senseInformationFeildTissue=new MolecularTissueFieldCovalentShellAsthetic();
    }
    
}
