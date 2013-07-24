/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import java.util.ArrayList;

/**
 *
 * @author justin
 * A layer of complexity is distinguished between two occurances of
 * a brain body world cell like reflective symetry.
 * abstractly these cells are then composed of cells in a simple way 
 * which can be expressed as a galios group 
 * roughly speaking a number of cells of the same type are each capeable of 
 * a sort of bag of tricks or combinaations of actions of their organs
 * a modual of these is likely to do any combination of actions
 * and the combinations of these can be capabble of very consistantly 
 * providing in some way for a modual of these moduals or organ if provided intelligence
 * from a brain which is reflecting combinations of the cells environment.
 * This symetry is repeated any number of times up or down as a fractle.
 * 
 * At each layer of complexity from atoms to communities the moduals of the same 
 * can be simply represented as the combinations of the capabilities of any cell averaged over all the
 * cells of the tissue catylized by information controling the flow of actions of the cells
 * 
 * information requires a sort of clock cycle and brain body and world(the kind of space a cell
 * can live in) surprisingly
 * i have found are each a significantly differant kind of information cycle
 * from three basic types(recombination,copying,print making) or (miosis,mitosis,and sight) and 
 * any organ which serves that roll at any level is 
 * predominantly exibiting that behaviour in its cells. and so a group theoretical
 * mathematical symetry is manifest each cycle is an automorphism and their composition is 
 * a feild and the two are isomorphic and together form a galios group.
 */
public class StrongAnthropicGaliosGroup {
    
        public GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild;
    
        public StrongAnthropicGaliosGroup ceiling=null;

        public Asthetic[][] asthetics=new Asthetic[3][3];
        
        public String name="";
            
    
            public BrainRoleSpaceOutsideEdge brainRoleSpaceOutsideEdge;
            public BodyRoleSpaceOutsideEdge bodyRoleSpaceOutsideEdge;
            public SenseRoleSpaceOutsideEdge sensesRoleSpaceOutsideEdge;
            
            public Brain brain;
            public Body body;
            public Senses senses;
            
            public BrainInformationFeildTissue brainInformationFeildTissue;
            public BodyInformationFeildTissue bodyInformationFeildTissue;
            public SenseInformationFeildTissue senseInformationFeildTissue ;
            
            public XSpineStrongAnthropicSensesGaliosGroupAsthetic spineSenses;
            public XSpineStrongAnthropicSymetryShellGaliosGroupAsthetic symetryShell;
            public XSpineStrongAnthropicTissueFeildGaliosGroupAsthetic spineTissueField;
                   
            public YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic brainSpine;
            public YSpineStrongAnthropicOrgansGaliosGroupAsthetic spineOrgans;
            public YSpineStrongAnthropicReceptorsGaliosGroupAsthetic spineReceptors;
    
    public StrongAnthropicGaliosGroup(
            RecombinationAsthetic heart,
            ReproductionAsthetic hand,
            PrintMakingAsthetic foot,            
            GeneralStrongAnthropicGaliosGroupFractle generalInformationFeild
            )
    {
        this.generalInformationFeild=generalInformationFeild;
            
            
    //Of all the quadrants of all the three fundamental asthetics mirrored at each symetry shell.
    //two phenomina are repeated. Analogsly they are hands and eyes. occupying the same eight
    //quadrants. And a map can be made of this. This is the composistion of mebrane information 
            //feilds into organs controllable by the brain. 
            
            //Each quadrant is the interaction of two tissue information fields.
            //Each such feild conducts a cascade of information chemical or otherwise
            //as each cell of the tissue responds in like to a signal.
            //Where such a cascade meets another tissue information can be passed from
            //one such cell type to the other forming a circut between the two.
            //Such a circut consists of a transistor like component where the receptor of the second
            //cell defines the asthetic and so depending on thhe type of cell in spite of the 
            //organ its self serving the function of the asthetic befor it it will need to
            //use information from the same moduals of the destination cell to transmit information
            //to it. Since the cell is modular with its brain body and receptors this is efficennt.
            //This order is then reversed going into versus out of the brain duue to the cell
            //type order being reversed. and so for example if represennting recombination with 
            //a heart (sexual selection) and reproduction with a hand (muscle and mitosis) and finally
            //symbolizing printmaking with a foot print. Then the brain Asthetic becomes
            //heart hand foot heart    and it community containing it then becomes
            //foot heart hand heart
            //
            //the pattern being 
            //+   &   $   -*
            //*   +   &   -$ 
            //This pattern is repeated over and over to make the information field of life
            //which is a galios group as these automorphisms are composed into tissues and organs
            //which feilds in which informmation flows freely.
            
        brainSpine=new YSpineStrongAnthropicBrainSpineGaliosGroupAsthetic
                (this.brainRoleSpaceOutsideEdge,this.brain,
                this.brainInformationFeildTissue,heart,hand,foot);
            
    }
    /*
     * Use a feid to set a canonicle multiply through backbones.
     */
    public StrongAnthropicGaliosGroup multiply(StrongAnthropicGaliosGroup ceiling)
    {
        this.ceiling=ceiling;
        
        
        //attach tissues of ceiling 
        //set their hands to the natural modullarity of this symetry shell
        
        
        return this;
    }


}