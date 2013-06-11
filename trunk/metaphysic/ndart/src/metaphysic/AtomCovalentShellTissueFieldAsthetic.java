/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author justin
 */
public class AtomCovalentShellTissueFieldAsthetic extends PrintMakingAsthetic{
    int[] covalentShells ={2,2,4,4,8,8,16,16}; 
    public Asthetic handHumunculous=new AtomNucleousAsthetic();
    public Asthetic hand=new AtomElectronsAsthetic();//if this atom has more than half its covalent shell
    public Asthetic eye=new AtomElectronsAsthetic();//if the atom has less than half it complimentary shell
    public Asthetic eyeHumunculous=new AtomCovalentShellAsthetic();
    public ArrayList<AtomCovalentShellTissueFieldAsthetic> handsOfOtherAtoms;
    public ArrayList<AtomCovalentShellTissueFieldAsthetic> eyesOfOtherAtoms;
    Integer covalentShell;
    
    public void AtomCovalentShellTissueFieldAsthetic(int numberOfElectrons)
    {
        int covalentShellCounter=0;
        if(numberOfElectrons-2>0)
        {
            covalentShellCounter++;
        }
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
