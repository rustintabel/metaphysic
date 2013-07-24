/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

    /**
     *
     * @param roleSpace Your house. Abstractly where you live with respect to the other cells of your organ. 
     * @param body The symmetry shell. Bodies composed of organs with an outside edge and a controller organ.
     * @param tissue An information field transmitting a cascade from hand to eye. Composed into an organ.
     * 
     * The natural modularity of the symmetry shell below this one. 
     * @param heart Recombination asthetic. The controller organ of the body.
     * @param hand Reproduction asthetic. The non controller organs of the body.
     * @param foot Printmaking asthetic. The sense organs of the body.
     */
public class YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic extends YSpineStrongAnthropicGaliosGroupAsthetic {
        public YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic(
            Asthetic senses,Asthetic organ,Asthetic tissue,
            RecombinationAsthetic heart,ReproductionAsthetic hand,PrintMakingAsthetic foot
            )
    {
        
            this.roleSpace=roleSpace;
            this.body=body;
            this.tissue=tissue;
            
            this.tissueSuperHandHumunculous=heart;
            this.tissueSuperHand=hand;
            this.tissueSuperEye=foot;
            this.tissueSuperEyeHumunnculous=heart; 
            //this.tissueTranslatorCircut=this.tissueSuperHandHumunculous.plus(this.tissueSuperEyeHumunnculous);
                 
            this.organSuperHandHumunculous= this.tissueSuperHandHumunculous;
            this.organSuperHand= this.tissueSuperEyeHumunnculous;
            this.organSuperEye= this.tissueSuperHand;
            this.organSuperEyeHumunnculous= this.tissueSuperEye;
            //this.organTranslatorCircut=this.organSuperHand.plus(this.organSuperHandHumunculous);
                    
            this.sensesSuperHandHumunculous=this.organSuperHandHumunculous;
            this.sensesSuperHand=this.organSuperEyeHumunnculous;
            this.sensesSuperEye=this.organSuperHand;
            this.sensesSuperEyeHumunnculous=this.organSuperEye;
            //this.sensesTranslatorCircut=this.sensesSuperHand.plus(body);
    }
}
