package aula02;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {

        Locale Idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é:" + Idioma.getDisplayLanguage());
    }
    
}
