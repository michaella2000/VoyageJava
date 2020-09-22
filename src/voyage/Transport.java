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
public class Transport extends OptionVoyage{
    private boolean _trajetLong;
    public final double TARIF_LONG=1500.0;
    public final double TARIF_BASE=200.0;
    
    public Transport(String unNom, double unPrixForfaitaire){
        super(unNom, unPrixForfaitaire);
        _trajetLong=false;
    }
    
    public Transport(String unNom, double unPrixForfaitaire, boolean unTrajetLong){
        super(unNom, unPrixForfaitaire);
        _trajetLong=unTrajetLong;
    }
    
    @Override
    public double prix(){
        double rslt;
    if (_trajetLong){
    rslt= TARIF_LONG+super.prix();
    }
    else{
    rslt= TARIF_BASE+ super.prix();
    }
    return rslt;
    }
    @Override
    public String toString(){
        
        return super.getUnNom()+prix()+" euros ";
    }
    
    
    
}
