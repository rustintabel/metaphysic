/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metaphysic;

import metaphysic.community.CommunityStrongAnthropicGaliosGroup;
import metaphysic.organisms.OrganismStrongAnthropicGaliosGroup;
import metaphysic.cells.CellsStrongAnthropicGaliosGroup;
import metaphysic.proteins.ProteinsStrongAnthropicGaliosGroup;
import metaphysic.molecules.MolecularStrongAnthropicGaliosGroup;
import metaphysic.atoms.AtomsStrongAnthropicGaliosGroup;
import metaphysic.quarks.QuarksStrongAnthropicGaliosGroup;
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
public class GeneralStrongAnthropicGaliosGroupFractle 
{
    
    ArrayList<Phenomina> phenomina =new ArrayList<Phenomina>();
    
    public CommunityStrongAnthropicGaliosGroup community; 
    public OrganismStrongAnthropicGaliosGroup organisms;
    public CellsStrongAnthropicGaliosGroup cells;
    public ProteinsStrongAnthropicGaliosGroup proteins;
    public MolecularStrongAnthropicGaliosGroup molecules;
    public AtomsStrongAnthropicGaliosGroup atoms;
    public QuarksStrongAnthropicGaliosGroup quarks;

    public GeneralStrongAnthropicGaliosGroupFractle()
    {
        quarks=new QuarksStrongAnthropicGaliosGroup(this);
        atoms=new AtomsStrongAnthropicGaliosGroup(quarks.brain,quarks.body,quarks.senses,this);
        molecules=new MolecularStrongAnthropicGaliosGroup(atoms.brain,atoms.body,atoms.senses,this);
        proteins=new ProteinsStrongAnthropicGaliosGroup(molecules.brain,molecules.body,molecules.senses,this);
        cells=new CellsStrongAnthropicGaliosGroup(proteins.brain,proteins.body,proteins.senses,this);
        organisms=new OrganismStrongAnthropicGaliosGroup(cells.brain,cells.body,cells.senses,this);
        community=new CommunityStrongAnthropicGaliosGroup(organisms.brain,organisms.body,organisms.senses,this);
        quarks.multiply(atoms);
        atoms.multiply(molecules);
        molecules.multiply(proteins);
        proteins.multiply(cells);
        cells.multiply(organisms);
        organisms.multiply(community); 
        
        //Phenomina molecularElectricInformationFeild=new Phenomina();
        //molecularElectricInformationFeild.name="Electricity";
        //molecularElectricInformationFeild.automorphicAdd(molecules.CellTissuePrintMakingAsthetic);
        //molecules.spineTissueField.addPhenomina(molecularElectricInformationFeild);
        
        //Phenomina atomsElectricInformationFeild=new Phenomina();
        //atomsElectricInformationFeild.name="Electricity";
        //atomsElectricInformationFeild.automorphicAdd(atoms.CellPeerPrintMakingAsthetic);
        //atoms.spineSenses.addPhenomina(atomsElectricInformationFeild);
        
        
    }
    
}
