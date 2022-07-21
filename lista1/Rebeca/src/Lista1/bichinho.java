package Lista1;


public class bichinho {
    private String nome;
    private int fome, saude, idade;

    public bichinho(String n, int f, int s, int i) {
        this.nome = n;
        this.fome = f;
        this.saude = s;
        this.idade = i;
    }

    public void alteraN(String n){
        this.nome =n;
    }
    
    public void alteraF(int f){
        this.fome = f;
    }
    
    public void alteraS(int s){
        this.saude = s;
    }
    
    public void alteraIdade(int i){
        this.idade = i;
    }
    
    public String mostraN () {
        return this.nome;
    }
    
    public int mostraF () {
        return this.fome;
    }
    
    public int mostraS () {
        return this.saude;
    }

    public int mostraI () {
        return this.idade;
    }
    
    public int mostraHumor () {
        return (this.fome+this.saude)/2;
    }
}
