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
    public RecombinationAsthetic brain;
    public ReproductionAsthetic body;
    public PrintMakingAsthetic senses;
    public ArrayList<Phenomina> phenomina =new ArrayList<Phenomina>();
    
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
