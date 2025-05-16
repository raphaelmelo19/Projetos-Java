public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Ligar e desligar a tv.
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    //Aumentar ou diminuir o volume

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido o volume para: " + volume);
    }

    //Mudar o canal da Tv.

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;

    }
}
