
package Lista1;


public class bola {
   private String cor, material;
   private double circunferencia;
   
   public bola (String c, String m, double c1) {
       this.cor = c;
       this.material = m;
       this.circunferencia = c1;
       
   }
   
   public void trocarCor (String c) {
       this.cor = c;
   }
   
   public String mostrarCor () {
       return this.cor;
   }
}
