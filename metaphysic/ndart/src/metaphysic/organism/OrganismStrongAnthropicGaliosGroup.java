/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.organism;

import metaphysic.Phenomina;
import metaphysic.StrongAnthropicGaliosGroup;

/**
 *
 * @author justin
 */
public class OrganismStrongAnthropicGaliosGroup extends StrongAnthropicGaliosGroup{
    public void OrganismStrongAnthropicGaliosGroup()
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
