package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */



public class Peamurdja3_laevad_2d {

    public static void main(String[] args) {
        int suurus = 4;
        int[][] laud = new int[suurus][suurus];
        int i;
        int j;
        for (i = 0; i < suurus; i++) {
            for (j = 0; j < suurus; j++) {
                laud[i][j] = (int) (Math.random() * 2);
            }
        }
        //System.out.println(Arrays.deepToString(laud));
        //System.out.println(laud.length);
        System.out.println(Arrays.deepToString(laud).replaceAll("],", "]," + System.getProperty("line.separator")));
        Scanner kasutaja = new Scanner(System.in);
        for (i = 0; i < suurus; i++) {
            for (j = 0; j < suurus; j++) {
                if (laud[i][j] == 1) {
                    System.out.println("Sisesta rea number");
                    int x = kasutaja.nextInt() - 1;
                    System.out.println("Sisesta veeru number");
                    int y = kasutaja.nextInt() - 1;
                    if (laud[x][y] == 1) {
                        System.out.println("Pihtas!");
                        laud[x][y] = 0;
                    }
                    else {
                        System.out.println("Mööda!");
                    }

                }
            }


            /* int Math.random(laud[1]) * 2;
            System.out.println(laud [4]);
            public static int laev() {
            int tulemus = (int) (Math.random() * 2);
            return tulemus;
            int[] laud = {laev(), laud(), laud(), laud(), laud(), laud(), laud()}
            while (true) {}
            for (int i = 0; i < laud.Length; i++) {}
            sout(laud.Length)
            */

        }
        System.out.println("Mäng on läbi!");
    }
}

/**
 */
