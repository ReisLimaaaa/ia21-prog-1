package Lista1;

public class quadrado {
    private double lado;
    
    public quadrado(double l){
        this.lado = l;                
    }
    
    public void Mlado (double l) {
        this.lado = l;
    }
    
    public double Rlado () {
       return this.lado;
    }
    
    public double Carea () {
        return lado*lado;
    }
    
}
