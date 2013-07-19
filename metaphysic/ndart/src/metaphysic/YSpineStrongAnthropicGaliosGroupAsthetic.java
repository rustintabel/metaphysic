/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

/**
 *
 * @author justin
 */
public class YSpineStrongAnthropicGaliosGroupAsthetic extends SpineStrongAnthropicGaliosGroupAsthetic{
    
    public Asthetic bodySuperHandHumunculous=new Asthetic();
    public Asthetic bodySuperHand=new Asthetic();
    public Asthetic bodySuperEye=new Asthetic();
    public Asthetic bodySuperEyeHumunnculous=new Asthetic();
    
    public Asthetic cellSuperHandHumunculous=new Asthetic();
    public Asthetic cellSuperHand=new Asthetic();
    public Asthetic cellSuperEye=new Asthetic();
    public Asthetic cellSuperEyeHumunnculous=new Asthetic();
    
    public Asthetic senses;
    public Asthetic body;
    public Asthetic tissue;
    
    public void YSpineStrongAnthropicGaliosGroupAsthetic(
            Asthetic senses,Asthetic organ,Asthetic tissue,
            RecombinationAsthetic heart,ReproductionAsthetic hand,PrintMakingAsthetic foot)
    {
            this.senses=senses;
            this.body=organ;
            this.tissue=tissue;
        
            this.bodySuperHandHumunculous.handHumunculous=this.cellSuperEye.eye;
            this.bodySuperHand.hand=this.cellSuperHandHumunculous.handHumunculous;
            this.bodySuperEye.eye=this.cellSuperEye.eye;
            this.bodySuperEyeHumunnculous.eyeHumunculous=this.cellSuperEyeHumunnculous.eyeHumunculous;
            
            this.cellSuperHandHumunculous.handHumunculous=heart;
            this.cellSuperHand.hand=hand;
            this.cellSuperEye.eye=foot;
            this.cellSuperEyeHumunnculous.eyeHumunculous=heart;

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
                current.feildMultiply(newPhenomina);
            }
        }
        if(phenominaFound==false)
        {
            this.feild.generalInformationFeild.phenomina.add(newPhenomina);
        }
    }
}
