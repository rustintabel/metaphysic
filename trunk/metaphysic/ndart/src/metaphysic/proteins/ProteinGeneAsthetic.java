/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.proteins;

import metaphysic.Asthetic;
import metaphysic.organism.OrganismBrainAsthetic;
import metaphysic.organism.OrganismSensesAsthetic;
import metaphysic.RecombinationAsthetic;

/**
 *
 * @author justin
 */
public class ProteinGeneAsthetic extends RecombinationAsthetic{
        public Asthetic handHumunculous=new OrganismBrainAsthetic();
    public Asthetic hand=new OrganismSensesAsthetic() ;
    public Asthetic eye=new OrganismBrainAsthetic();
    public Asthetic eyeHumunculous=new OrganismSensesAsthetic() ;
    
    
    /** 
     *
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