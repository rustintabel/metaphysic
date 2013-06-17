/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.cells;

import metaphysic.Asthetic;
import metaphysic.ReproductionAsthetic;
import metaphysic.proteins.ProteinGeneAsthetic;
import metaphysic.proteins.ProteinRNAAsthetic;
import metaphysic.proteins.ProteinTertiaryStructureAsthetic;

/**
 *
 * @author justin
 */
public class CellMembraneInformationFieldCytoplasmAsthetic extends ReproductionAsthetic{
        public Asthetic handHumunculous=new ProteinGeneAsthetic();
    public Asthetic hand=new ProteinGeneAsthetic();
    public Asthetic eye=new ProteinRNAAsthetic();
    public Asthetic eyeHumunculous=new ProteinTertiaryStructureAsthetic();
    
    public void handHumunculous()
    {}
    public void hand()
    {}
    public void eye()
    {}
    public void eyeHumunculous()
    { 
    }
}
