
package Lista1;

public class tv {
   private int canal;
   private int volume;

public tv(int c, int v) {
    this.canal = c;
    this.volume = v;
}

public int iCanal() {
    if (canal > 20 || canal < 0) {
        System.out.println("Por favor, entre com outro canal, não possuimos esse canal no sistema.");
    }
    return this.canal;
}

public int aVolume() {
    if (volume >100 || volume <0) {
        System.out.println("Por favor,limites no volume, acima de 100 não é válido. Sua audição agradece e seu vizinho também.");
    }
    return this.volume;
}

public int dVolume() {
    this.volume --;
    if(volume <0) {
        System.out.println("Não é válido volume abaixo de 0!");
    }
    return this.volume;
}
}
