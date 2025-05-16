public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada -> " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //Ligar e desligar a Tv.
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada -> " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada -> " + smartTv.ligada);

        //Aumentar ou diminuir o volume.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        //Mudar de canal

        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);


        
    }   
}
