package OOP_Pommitamine;

import java.util.Scanner;

/**
 * Created by pploom on 21.11.15.
 */
public class Mangija {
    private Scanner sc = new Scanner(System.in);

    public int[] kysiLasuKoordinaadid() {
        System.out.println("Sisesta lasu koordinaadid formaadis xxx-yyy");
        String[] sisestus = sc.nextLine().split("-");
        int x = Integer.parseInt(sisestus[0]);
        int y = Integer.parseInt(sisestus[1]);

        return new int[]{x, y};
    }

    public void pihtas() {
        System.out.println("PIHTAS");
    }

    public void moodas() {
        System.out.println("MÖÖDAS");
    }

    public void gameover() {
        System.out.println("GAME OVER");
    }
}
