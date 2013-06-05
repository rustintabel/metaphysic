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
public abstract class Asthetic {
    public Asthetic hand;

    public Asthetic handHumunculous;
    public Asthetic eye;
    public Asthetic eyeHumunculous;
    public ArrayList<Asthetic> cells=new ArrayList<Asthetic>();
    ArrayList<Asthetic> organs=new ArrayList<Asthetic>();
    public Asthetic plus(Asthetic newOrgan){
        organs.add(newOrgan);
        return this;
    }
    public Asthetic multiply(Asthetic cell){
        //the connections between cells in the asthetic should simply be a shared modual name.
        cells.add(cell);return this;}

    //add an asthetic , one of the three fundamental types from the layer of complexity
    //below many of which the 
    //mechanism is built primarily each of these is more one than another since the
    //asthetic always consists of four quadrants passing from brain to body through 
    //the world and back and the three are recombination and printmaking passing
    //through the reproduction layer which is a map from brain to world
    //consisting of organs mirroring the electrons of the atoms.

 //for each of the following do one iteration of thoes which have some work to do   
    public abstract void hand();
    public abstract void handHumunculous();
    public abstract void eye();
    public abstract void eyeHumunculous();
    //Critique:
    //Rapid prototyping iteration and then diminishing returns can also
    //be interpreted as variations on a theme and knowing when the painting is done.
    //Credit to my mom.
    //it could be said philisophically that thoes cells which consistantly instigate 
    //actions the consequences of which lead to a new symetry shell are godlike
    //as Stephen Hawking says The universe must be the way it is for us to be here 
    //asking why
    //as food for thought consider the way fine distinctions are both streangthened by
    //looking criticaly at variations on a theme and empowering. 
    //this seems naturally fair
    //this quadrant terminates every iteration it is the clean up and making judgements. 
    //unpainting your caches 
    //This is where the goasts of superstition mystacism are exorciced.
    //obsession is seen then to be an inability to let go of things here.
}
