/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.organism;

import metaphysic.Asthetic;
import metaphysic.ReproductionAsthetic;
import metaphysic.cells.CellNucleousAsthetic;
import metaphysic.cells.CellSurfaceAsthetic;

/**
 *
 * @author justin
 */
public class OrganismBodyAsthetic extends ReproductionAsthetic{
    

    public Asthetic hand=new CellSurfaceAsthetic() ;
    public Asthetic handHumunculous=new CellSurfaceAsthetic();
    public Asthetic eye=new CellNucleousAsthetic();
    public Asthetic eyeHumunculous=new CellNucleousAsthetic();
    
    /**

     */
    public void handHumunculous()
    {}
    
    /**

     */
    public void hand()
    {}
    
    /**

     */
    public void eye()
    {}
    
    /**

     */
    public void eyeHumunculous()
    { }
}
