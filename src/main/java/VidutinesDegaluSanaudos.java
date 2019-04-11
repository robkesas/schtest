import degaluapskaita.Apskaita;
import degaluapskaita.Cekis;

import java.util.Set;

public class VidutinesDegaluSanaudos {

    public static void main(String[] args) {

        Apskaita degaluApskaita = new Apskaita();

        degaluApskaita.pridetiCeki(new Cekis("End46\n7", 1.25, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis("E nd4 67", 2.10, 50, 150));
        degaluApskaita.pridetiCeki(new Cekis("End 467", 1.60, 20, 600));
        degaluApskaita.pridetiCeki(new Cekis("End   467", 0.99, 20, 850));
        degaluApskaita.pridetiCeki(new Cekis("knu839", 1.25, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis("knu 839", 2.10, 50, 150));
        degaluApskaita.pridetiCeki(new Cekis("KNu839", 1.60, 20, 600));
        degaluApskaita.pridetiCeki(new Cekis("KNU839", 0.99, 20, 850));

                Set<String> nrSarasas = degaluApskaita.getCekiaiByVm();

        for (String numeris:nrSarasas) {
            System.out.println();
            System.out.println("Valstybinis numeris " + numeris);
            System.out.println(degaluApskaita.vidLitraiSimtui(numeris) + " l/100km vidurkis");
            System.out.println(degaluApskaita.vidKainaSimtui(numeris) + " Eur/100km vidutinė kaina");
        }



    }

}



