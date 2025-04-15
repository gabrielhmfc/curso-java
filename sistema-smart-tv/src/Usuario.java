public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("TV ligada: " + smartTv.isLigada());
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());
        smartTv.mudarCanal(10); // Muda o canal para 10
        System.out.println("Canal atual: " + smartTv.getCanal()); // Verifica o canal atual
        smartTv.aumentarVolume(); // Aumenta o volume
        smartTv.aumentarVolume(); // Aumenta o volume novamente
        System.out.println("Volume atual: " + smartTv.getVolume()); // Verifica o volume atual
        smartTv.diminuirVolume(); // Diminui o volume
        System.out.println("Volume atual: " + smartTv.getVolume()); // Verifica o volume atual
        smartTv.desligar(); // Desliga a TV
        System.out.println("TV ligada: " + smartTv.isLigada()); // Verifica se a TV está ligada
        
    }
}
