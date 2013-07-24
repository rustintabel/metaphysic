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
public class XSpineStrongAnthropicSymetryShellGaliosGroupAsthetic extends 
        XSpineStrongAnthropicGaliosGroupAsthetic{
    
    
    public XSpineStrongAnthropicSymetryShellGaliosGroupAsthetic(
            Asthetic brain,Asthetic body,Asthetic senses,
            RecombinationAsthetic heart,ReproductionAsthetic hand,PrintMakingAsthetic foot)
    {
        super(brain,body,senses,heart,hand,foot);
        Phenomina handVector=new Phenomina();
        handVector.setName("Hand Phenomina");
        
        phenomina.add(handVector);
        
        Phenomina eyeVector=new Phenomina();
        eyeVector.setName("Eye Phenomina");
        phenomina.add(eyeVector);
    }
}
