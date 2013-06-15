/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

/**
 *
 * @author justin
 */
public class YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic extends SpineStrongAnthropicGaliosGroupAsthetic {
        public void SpineStrongAnthropicGaliosGroupAsthetic(
            RecombinationAsthetic heart,ReproductionAsthetic hand,PrintMakingAsthetic foot)
    {
            this.superPrint.handHumunculous=this.superFoot;
            this.superPrint.hand=this.superHeart;
            this.superPrint.eye=this.superHand;
            this.superPrint.eyeHumunculous=this.superHeart;
            
            
            this.superHeart.handHumunculous=heart;
            this.superHeart.hand=hand;
            this.superHeart.eye=foot;
            this.superHeart.eyeHumunculous=heart;
            
            this.superHand.handHumunculous=foot;
            this.superHand.hand=heart;
            this.superHand.eye=heart;
            this.superHand.eyeHumunculous=foot;
            
            this.superFoot.handHumunculous=heart;
            this.superFoot.hand=foot;
            this.superFoot.eye=foot;
            this.superFoot.eyeHumunculous=heart;
                
    }
}
