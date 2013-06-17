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
