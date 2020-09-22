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
public class Sejour extends OptionVoyage {
    private int _nombreDeNuit;
    private double _prixParJour;
    
    public Sejour(String unNom, double unPrixForfaitaire, int unNombreDeNuit, double unPrixParJour){
        super(unNom,unPrixForfaitaire);
    _nombreDeNuit=unNombreDeNuit;
    _prixParJour=unPrixParJour;
            
    }
    
    /**
     * @return the _nombreDeNuit
     */
    public int getNombreDeNuit() {
        return _nombreDeNuit;
    }

    /**
     * @return the _prixParJour
     */
    public double getPrixParJour() {
        return _prixParJour;
    }
    
    @Override
    public double prix(){
        double prix=0;
        prix =(_nombreDeNuit*_prixParJour)+super.prix();
        
        return prix;
    }
    
    @Override
    public String toString(){
        
        return super.getUnNom()+prix()+" euros ";
    }

    
}

