/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;
import java.util.*;
/**
 *
 * @author justin
 */
public class Phenomina extends Asthetic{
    String name;
    ArrayList<Asthetic> informationVector =new ArrayList<Asthetic>();
    
    public void setName(String name){this.name=name;}  
    
    public Asthetic automorphicAdd(Asthetic next)
    {
        informationVector.add(next);
        return this;
    }
    public Asthetic automorphicMultiply(Asthetic next)
    {
        informationVector.add(next);
        return this;
    }
    public Phenomina feildAdd(Phenomina body)
    {
        informationVector.addAll(body.informationVector);
        return this;
    }
    public Phenomina feildMultiply(Phenomina organ)
    {
        informationVector.addAll(organ.informationVector);
        return this;
    }
}
