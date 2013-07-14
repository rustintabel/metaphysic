/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic.atoms;
import metaphysic.atoms.AtomNucleousAsthetic;
import metaphysic.atoms.AtomElectronsAsthetic;
import metaphysic.atoms.AtomCovalentShellAsthetic;
import java.util.*;
import java.util.ArrayList;
import metaphysic.Asthetic;
import metaphysic.PrintMakingAsthetic;

/**
 *
 * @author justin
 */
public class AtomCovalentShellTissueFieldAsthetic extends PrintMakingAsthetic{
    int[] covalentShells ={2,2,4,4,8,8,16,16}; 
    public Asthetic handHumunculous=new AtomNucleousAsthetic();
    public Asthetic hand=new AtomElectronsAsthetic();//if this atom has more than half its covalent shell
    public Asthetic eye=new AtomCovalentShellAsthetic ();//if the atom has less than half it complimentary shell
    public Asthetic eyeHumunculous=new AtomElectronsAsthetic();
    public ArrayList<AtomCovalentShellTissueFieldAsthetic> handsOfOtherAtoms;
    public ArrayList<AtomCovalentShellTissueFieldAsthetic> eyesOfOtherAtoms;
    int numberOfElectrons;
    
    public void AtomCovalentShellTissueFieldAsthetic()
    {
        
    }
    
    public void AtomCovalentShellTissueFieldAsthetic(int numberOfElectrons)
    {
        this.numberOfElectrons=numberOfElectrons;
        
    }
    
    public void handHumunculous()
    {
    
    }
    public void hand()
    {
    
    }
    public void eye()
    {
    
    }
    public void eyeHumunculous()
    { 
    
    }
}
