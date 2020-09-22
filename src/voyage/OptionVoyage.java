/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyage;

/**
 *
 * @author sylva.michaella
 */
public class OptionVoyage {
    private String _unNom;
    private double _unPrixForfaitaire;
            
    public OptionVoyage(String unNom, double unPrixForfaitaire){
    _unNom=unNom;
    _unPrixForfaitaire=unPrixForfaitaire;
    }

    /**
     * @return the _unNom
     */
    public String getUnNom() {
        return _unNom;
    }

    /**
     * @return the _unPrixForfaitaire
     */
    public double prix() {
        return _unPrixForfaitaire;
    }
     public String toString(){
     String resultat=getUnNom() +" " +prix()+" euros ." ;
     
     return resultat;
     }
    
    
}
