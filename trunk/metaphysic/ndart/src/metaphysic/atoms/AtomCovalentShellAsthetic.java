/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.atoms;

import metaphysic.Asthetic;
import metaphysic.organism.OrganismBrainAsthetic;
import metaphysic.organism.OrganismSensesAsthetic;
import metaphysic.PrintMakingAsthetic;

/**
 *
 * @author justin
 */
public class AtomCovalentShellAsthetic extends PrintMakingAsthetic{
    public Asthetic handHumunculous=new OrganismBrainAsthetic();
    public Asthetic hand=new OrganismSensesAsthetic() ;
    public Asthetic eye=new OrganismBrainAsthetic();
    public Asthetic eyeHumunculous=new OrganismSensesAsthetic() ;
    
    
    public void AtomCovalentShellAsthetic(Asthetic handHumunculous,Asthetic hand,Asthetic eye,Asthetic eyeHumunculous)
    {
        
        super.Asthetic(handHumunculous, hand, eye, eyeHumunculous);
    }
    
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