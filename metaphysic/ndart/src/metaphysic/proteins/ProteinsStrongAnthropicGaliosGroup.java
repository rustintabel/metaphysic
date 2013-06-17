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
import metaphysic.Phenomina;
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
    

    
    public void ProteinsStrongAnthropicGaliosGroup()
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
