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
public class XSpineStrongAnthropicGaliosGroupAsthetic extends SpineStrongAnthropicGaliosGroupAsthetic{
    public Asthetic brain;
    public Asthetic body;
    public Asthetic senses;
    public ArrayList<Phenomina> phenomina =new ArrayList<Phenomina>();
    
            
    public XSpineStrongAnthropicGaliosGroupAsthetic(
            Asthetic brain,Asthetic body,Asthetic senses,
            RecombinationAsthetic heart,ReproductionAsthetic hand,PrintMakingAsthetic foot)
    {
            this.brain=brain;
            this.body=body;
            this.senses=senses;
        /**
            this.bodySuperHandHumunculous.handHumunculous=this.cellSuperEye.eye;
            this.bodySuperHand.hand=this.cellSuperHandHumunculous.handHumunculous;
            this.bodySuperEye.eye=this.cellSuperEye.eye;
            this.bodySuperEyeHumunnculous.eyeHumunculous=this.cellSuperEyeHumunnculous.eyeHumunculous;
            
            this.cellSuperHandHumunculous.handHumunculous=heart;
            this.cellSuperHand.hand=hand;
            this.cellSuperEye.eye=foot;
            this.cellSuperEyeHumunnculous.eyeHumunculous=heart;
            */   
    }            
    
    public void addPhenomina(Phenomina newPhenomina)
    {
        boolean phenominaFound=false;
        Phenomina current;
        
        for(int i=0;i<this.feild.generalInformationFeild.phenomina.size();i++)
        {
            current=this.feild.generalInformationFeild.phenomina.get(i);
            if(current.name.equalsIgnoreCase(newPhenomina.name))
            {
                current.feildAdd(newPhenomina);
            }
        }
        if(phenominaFound==false)
        {
            this.feild.generalInformationFeild.phenomina.add(newPhenomina);
        }
    }
}
