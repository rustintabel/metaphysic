/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import java.util.ArrayList;


    /**Each layer of complexity from organisms to atoms are composed as a fractle.
    * one layer fights entropy as a sort of machien and the layer above adds
    * a governing force on the one below as it is within the tissues of the organs controled
    * by a brain in which the nich comfortable for the life of the cell that the cell lives.
    * From below the layer is also managed by the modularity of the organs of its cells.
    * And so each layer adds fecundity.
    * This is how independant entities become emergant beings as individuals multiply
    * they increase the complexity of their environment and then adapt to it becoming
    * more complex themselves. They search possibility space jiggling the many to one 
    * representation trees of modularity of the nucleous and the brain composed layer
    * by layer increasing in fecundity. This cooperative behaviour. Individuals
    * empathetically help each other fighting projection of their personal perspective 
    * learning each others variation on their astheic preferences to make
    * each other happy.
    **/
public class GeneralStrongAnthropicGaliosGroup 
{
public CommunityStrongAnthropicGaliosGroup community = new CommunityStrongAnthropicGaliosGroup(); 
public OrganismStrongAnthropicGaliosGroup organisms =new OrganismStrongAnthropicGaliosGroup();
public CellsStrongAnthropicGaliosGroup cells = new CellsStrongAnthropicGaliosGroup();
public ProteinsStrongAnthropicGaliosGroup proteins = new ProteinsStrongAnthropicGaliosGroup();
public AtomsStrongAnthropicGaliosGroup atoms =new AtomsStrongAnthropicGaliosGroup();
public QuarksStrongAnthropicGaliosGroup quarks=new QuarksStrongAnthropicGaliosGroup();

    public void GeneralStrongAnthropicGaliosGroup()
    {
        atoms.multiply(quarks);
        proteins.multiply(atoms);
        cells.multiply(proteins);
        organisms.multiply(cells);
        community.multiply(organisms);
    }
    
}
