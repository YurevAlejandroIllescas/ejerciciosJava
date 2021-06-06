package POO.febrero06;


/**
 * Write a description of class MiFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiFecha
{
    private int eDia;
    private int eAnio, eMes;
    
    public MiFecha() {
    	
    }
    
    public MiFecha(int eDia, int eMes, int eAnio){
        
        this.eDia = eDia;
        this.eMes = eMes;
        this.eAnio = eAnio;
    
    }
    
    
    
    public int getDia(){
        return eDia;
    }
    
    public int getMes(){
        return eMes;
    }
    
    public int getAnio(){
        return eAnio;
    }
    
    public void setDia(int eDia){

    	this.eDia = eDia;
    }
    
    public void setMes(int eMes){
        this.eMes = eMes;
    }
    
    public void setAnio(int eAnio){
        this.eMes = eAnio;
    }                                 
    
    public void escribir(){
    
        System.out.println(eDia + "/" + eMes + "/" + eAnio);
        
    }
    
    public String toString(){
        return eDia + "/" + eMes + "/" + eAnio;
    }
   
}
