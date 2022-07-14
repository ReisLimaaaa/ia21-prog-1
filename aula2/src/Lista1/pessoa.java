package Lista1;

public class pessoa {
    private String nome;
    private int idade; 
    private double peso, altura;  
    
public pessoa(String n, int i, double p, double a) {
    this.nome = n;
    this.idade = i;
    this.peso = p;
    this.altura = a;
}
public int envelhece() {
    this.idade ++;
    if(this.idade <21);
        this.altura +=0.05; 
    return this.idade;
}
public double engordar() {
    this.peso ++;
    return this.peso;
}
public double emagrecer() {
    this.peso --;
    return this.peso;
}
public double crescer () {
    this.altura +=0.05; 
    return this.altura;
}
}

