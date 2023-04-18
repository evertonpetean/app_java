

import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        Celular celularA = new Celular("iphone 12", "ios", 256, 6.1f);
                
        System.out.format("Celular %s,\n sistema operacional %s,\n %dGB de memoria \n com tela de %.1f pol.!", 
        celularA.getNome(), celularA.getSistemaOperacional(), celularA.getMemoria(),celularA.getTamanhoTela() );
        
    }
}