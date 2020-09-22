/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyage;

import java.util.ArrayList;

/**
 *
 * @author sylva.michaella
 */
public class KitVoyage {
    private ArrayList <OptionVoyage> _lesOptionVoyage;
    private String _depart;
    private String _destination;
    
    
    public KitVoyage(String unDepart, String uneDestination ){
    _depart=unDepart;
    _destination=uneDestination;
    _lesOptionVoyage=new ArrayList<OptionVoyage>();
    
    }
    
    public void ajouterOption(OptionVoyage uneOptionVoyage){
    _lesOptionVoyage.add(uneOptionVoyage);
    
    }
    
    public void annuler(){
    _lesOptionVoyage.clear();
    
    }
    
    public int getNombreOptions(){
    return  _lesOptionVoyage.size();
    
    }
    public String afficherOption(){
    String resultat="";
    
    for(OptionVoyage monOption: _lesOptionVoyage){
    
    resultat+=" \n - "+ monOption ;
            }
    
    return resultat;
    }
    
    public double PrixTotal(){
    double resultat=0;
    
    for(OptionVoyage monOption: _lesOptionVoyage){
    
    resultat+=monOption.prix();
            }
    
    return resultat;
    
    }
    @Override
    public String toString(){
    
    String resultat="Voyage de "+_depart+" à "+_destination+" ,avec pour options:  " +afficherOption()+"\n Prix Total: "+PrixTotal();  
            
     return resultat;       
    }
    
}
