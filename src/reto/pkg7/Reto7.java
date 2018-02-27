
package reto.pkg7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reto7 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("- Fácil \n"
                + "- Intermedio \n"
                + "- Difícil \n"
                + "Selecciona el nivel de dificultad:");
            String dificultad = br.readLine();
            char dif = dificultad.charAt(0);
                if (dif == 'F' || dif == 'f'){
                    System.out.println("Dificultad Fácil.");
                    System.out.println("Este nivel contiene una palabra de 4 letras.");
                    }
                if (dif == 'I' || dif == 'i'){
                    System.out.println("Dificultad Intermedio");
                    System.out.println("Este nivel contiene una palabra de 8 letras.");
                    }
                if (dif == 'D' || dif == 'D'){
                    System.out.println("Dificultad Dificil");
                    System.out.println("Este nivel contiene una palabra de 12 letras.");
                    }
           
           
    }
}
