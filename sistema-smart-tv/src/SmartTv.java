public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 25;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
    

    
    
}
