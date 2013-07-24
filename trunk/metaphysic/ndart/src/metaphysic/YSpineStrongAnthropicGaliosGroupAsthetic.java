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
    
    public Asthetic sensesSuperHandHumunculous=new Asthetic();
    public Asthetic sensesSuperHand=new Asthetic();
    public Asthetic sensesSuperEye=new Asthetic();
    public Asthetic sensesSuperEyeHumunnculous=new Asthetic();
    
    public Asthetic organSuperHandHumunculous=new Asthetic();
    public Asthetic organSuperHand=new Asthetic();
    public Asthetic organSuperEye=new Asthetic();
    public Asthetic organSuperEyeHumunnculous=new Asthetic();
    
    public Asthetic tissueSuperHandHumunculous=new Asthetic();
    public Asthetic tissueSuperHand=new Asthetic();
    public Asthetic tissueSuperEye=new Asthetic();
    public Asthetic tissueSuperEyeHumunnculous=new Asthetic();    
    
    public Asthetic roleSpace;
    public Asthetic body;
    public Asthetic tissue;
    
    //translator circuts: these are the natural modual which is speaking a differant asthetic
    //language when used one way or the other.
    //From one row to the one above is flipped and shifted.
    //When only these quadrants are veiwed the spine can be seen.
    public Asthetic tissueTranslatorCircut;
    public Asthetic organTranslatorCircut;
    public Asthetic sensesTranslatorCircut;
    


    
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
