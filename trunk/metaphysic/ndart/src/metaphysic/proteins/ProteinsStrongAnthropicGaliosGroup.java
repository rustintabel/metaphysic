/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.proteins;

import metaphysic.proteins.ProteinGeneAsthetic;
import metaphysic.proteins.ProteinRNAAsthetic;
import metaphysic.proteins.ProteinTertiaryStructureAsthetic;
import metaphysic.proteins.ProteinPeerGeneAsthetic;
import metaphysic.proteins.ProtienPeerRNAAsthetic;
import metaphysic.proteins.ProteinPeerTertiaryStructureAsthetic;
import java.util.ArrayList;
import metaphysic.*;
import metaphysic.StrongAnthropicGaliosGroup;

/**
 *
 * @author justin
 */
public class ProteinsStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
    
    ArrayList<ProteinPeerTertiaryStructureAsthetic> ProteinPeerTertiaryStructureAstheticTypes
            =new ArrayList<ProteinPeerTertiaryStructureAsthetic>();
    ArrayList<ProtienPeerRNAAsthetic> ProtienPeerRNAAstheticTypes
            =new ArrayList<ProtienPeerRNAAsthetic>();
    ArrayList<ProteinPeerGeneAsthetic> ProteinPeerGeneAstheticTypes
            =new ArrayList<ProteinPeerGeneAsthetic>();
    
     ArrayList<ProteinTertiaryStructureAsthetic> ProteinTertiaryStructureAstheticTypes
            =new ArrayList<ProteinTertiaryStructureAsthetic>();
        ArrayList<ProteinRNAAsthetic> ProteinRNAAstheticTypes
            =new ArrayList<ProteinRNAAsthetic>(); 
    ArrayList<ProteinGeneAsthetic> ProteinGeneAstheticTypes
            =new ArrayList<ProteinGeneAsthetic>();
    

    
    public ProteinsStrongAnthropicGaliosGroup(            
            RecombinationAsthetic heart,
            ReproductionAsthetic hand,
            PrintMakingAsthetic foot,            
            GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild
            )
    {
        super(heart,hand,foot,generalInformationFeild);
        name="proteins";
        asthetics[0][0]=brainRoleSpaceOutsideEdge=new ProteinPeerGeneAsthetic();//through brownian motion and angular momentum
        asthetics[0][1]=bodyRoleSpaceOutsideEdge=new ProtienPeerRNAAsthetic();
        asthetics[0][2]=sensesRoleSpaceOutsideEdge=new ProteinPeerTertiaryStructureAsthetic();

        asthetics[1][0]=brain=new ProteinGeneAsthetic();
        asthetics[1][1]=body=new ProteinRNAAsthetic();
        asthetics[1][2]=senses=new ProteinTertiaryStructureAsthetic();

        asthetics[2][0]=brainInformationFeildTissue=new GeneTissueFieldNucleousAsthetic();
        asthetics[2][1]=bodyInformationFeildTissue=new GeneTissueFieldCytoplasmAsthetic();
        asthetics[2][2]=senseInformationFeildTissue=new GeneTissueFieldSurfaceAsthetic();
      //  Phenomina handVector=new Phenomina();
      //  handVector.setName("Hand Phenomina");
      //  handVector.automorphicAdd(this.CellRecombinationAsthetic);
      //  handVector.automorphicAdd(this.CellReproductionAsthetic);
      //  symetryShell.addPhenomina(handVector);
        
        
       // Phenomina eyeVector=new Phenomina();
       // eyeVector.setName("Eye Phenomina");
       // eyeVector.automorphicAdd(this.CellRecombinationAsthetic);
       // eyeVector.automorphicAdd(this.CellReproductionAsthetic);
       // symetryShell.addPhenomina(eyeVector);
    } 
}
