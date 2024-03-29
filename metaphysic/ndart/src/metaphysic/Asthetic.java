/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;
import java.util.*;
/**
 *
 * two trees intersected in a yellow wood. 
 * one representation for many examples as moduls of the brain to the organs of the body.
 * many examples together working as an organ as organs are composed into a body.
 * + Means composition with respect to the three fundamental asthetics brain,body,nich.
 * as one is inside the next this is noncommutative. 
 * The third asthetic or nich is the connections of this cell to others
 * or thoes cells that this cell interacts with most. your nich accumulates entropy in
 * its physical material over time this is the brain of the third asthetic.
 * 
 * Your nich iterates as some of your peers act and react succesivly.
 * And your nich is closed with respect to combinations of what your organs can do and matter 
 * for you to survive. and reusable action and reaction are abstractly hand and eye. 
 * * Means composition with respect to two symetry shells and the layer of complexity between them.
 * since one layer is composed of the other and the moduals of the organs between them this like
 * addition is non commutative.
 * Asthetics composed in this way create an information and entropy feild.
 * A galios group exists in this field with the automorphism which is the 
 * symetric transformations of each quadrant of the abstract circle from hand to eye.
 * A backbone of recombination supports this life force 
 * and so it is most reasonable to add a reference to the body moduals to
 * the corresponding brain modual and you get a hand and eye hummunculous as a consequence.
 * @author justin
 */
public class Asthetic {
    public String astheticType="";
    //each of these produces  variations on a theme
    //the actions of combinations of their organs 
    //each of these has at its heart a map of switches
    //such that combinations of the actions of moduals of organs of the brain
    //coordinate moduals of organs of the body to maintain life in a 
    //closed system or nich of  the possible combinations of actions of its peers.
    //The moduals of each of these are composed of tissues of cells
    //variations on a theme again. The switch map can fight entropy
    //through coordinating moduals only because its cells are so much smaller and
    //faster. So in this way only with variations on a theme of cells composed as tissues and
    //modular organs can cells be mapped to organs in a way that is simple enough for a brain to control.
    //The brain body senses and again nucleous cytoplasm membrain each provide neccesary
    //modularity by being both simple and reflecting each other.
    public Asthetic handHumunculous;
    public Asthetic hand;
    
    public Asthetic eye;
    public Asthetic eyeHumunculous;
    
    
    
    public ArrayList<ArrayList<Asthetic>> switchMaps=new ArrayList<ArrayList<Asthetic>>();
    
    /*
     * Due to the natural modularity of controller, body organs and outside edge sense layer
     * and the fact that body to body communication is dependant on the language of the reciver
     * an information feild is built from turing machien like information vectors.
     * Layer of complexity on layer of complexity organs of a body with a controller and outside sensory edge.
     * are composed of feilds of information vectors abstractly of the hand and eye through the two axises
     * of the brain world reflection and receptor to organ information transmission
     * versus controller to organ information transmission.
     * And so a cycle of such vectors consists of four abstract vectors.
     * xy,x-y,-xy,-x-y
     */
    public void addHandsAndEyes(Asthetic handHumunculous,Asthetic hand, Asthetic eye,Asthetic eyeHumunculous)
    {
        this.handHumunculous=handHumunculous;
        this.hand=hand;
        this.eye=eye;
        this.eyeHumunculous=eyeHumunculous;
        ArrayList<Asthetic> row=new ArrayList<Asthetic>();
        
        row.add(eye);
        row.add(hand);
        
        switchMaps.add(row);
        
        row=new ArrayList<Asthetic>();
        row.add(eyeHumunculous);
        row.add(handHumunculous);
        
        switchMaps.add(row);
    }
    
     
    
    public ArrayList<Asthetic> cells=new ArrayList<Asthetic>();
    ArrayList<Asthetic> containingBodies=new ArrayList<Asthetic>();
    
    public Asthetic plus(Asthetic body){
        //pass in the containing body to add this controler and return self so the outside edge can too.
        
        containingBodies.add(body);
        return this;
    }
    
    public Asthetic multiply(Asthetic tissue){
        //pass in the containing tissue and return self so that you can again multiply another.
        
        tissue.eye=handHumunculous;
        tissue.handHumunculous=hand;
        tissue.hand=eye;
        tissue.eyeHumunculous=eyeHumunculous;
        
        
        cells.add(tissue);return this;}

    //add an asthetic , one of the three fundamental types from the layer of complexity
    //below many of which the 
    //mechanism is built primarily each of these is more one than another since the
    //asthetic always consists of four quadrants passing from brain to body through 
    //the world and back and the three are recombination and printmaking passing
    //through the reproduction layer which is a map from brain to world
    //consisting of organs mirroring the electrons of the atoms.

    //Abstractly each of the four quadrants together complete one iteration of an 
    //asthetic circle. Each moves information in two dimentions to the next quadrant and 
    //enacts variations on a theme from its own modular structur through a physically connected
    //map of two tissues as one tissue propagates a cascade of information to the other.
    //The two dimentions here are best represented by x is brain,  body, sense layer
    //And y tissues of cells composed into modular organs into cell like bodies with brains.
    //A group of which is again a tissue. The large brain made of the small ones becase
    //smaller is faster.
    
 //for each of the following do one iteration of thoes which have some work to do   
    
    
    
     /*
     * Like the eye humunculous the hand trains its cells and muscle is the equivalent of memory.
     * The variations on a theme of this quadrant build constructions from existing structures
     * Parts with parts. Where the eye humunculous builds abstractly the hand builds
     * physically.
     */
    public void hand()
    {
        
    }

    
/*
 * This is creative rather than critical
 * It is only made efficent enough by modularity of the brain mapped to organs
 * mapped to your senses and closed system personal space.
 * Variations on a theme agagin.
 * This quadrant initiates a cycle of the asthetic and the basic ideas
 * of rapid prototyping, iteration and diminishing returns must be considered.
 * This is just the logic of a cycle of improving intelligence in a body
 * from a controller to a physical outside edge.
 * 
 */
    public void handHumunculous()
    {
       
    }

    
    /*
     * At this quadrant your personal space or a peer is initiating a creative act 
     * recived by a sense organ. Moduals of the organ of the sense layer (physical outside surface)
     * Mapped to a physical connection 
     */
    public void eye()
    {
        
    }   
 
   /*
    * Critique:
    * Rapid prototyping iteration and then diminishing returns can also
    * be interpreted as variations on a theme and knowing when the painting is done.
    * Credit to my mom.
    * it could be said philisophically that thoes cells which consistantly instigate
    * actions the consequences of which lead to a new symetry shell are godlike
    * as Stephen Hawking says The universe must be the way it is for us to be here
    * asking why
    * as food for thought consider the way fine distinctions (like beuty and truth)
    * are both streangthened by
    * looking criticaly at variations on a theme and empowering.
    * this seems naturally fair
    * this quadrant terminates every iteration it is the clean up and making judgements.
    * unpainting your caches
    * This is where the goasts of superstition mystacism are exorciced.
    * obsession is seen then to be an inability to let go of things here.
    */
    public void eyeHumunculous()
    {
        
    }


}
