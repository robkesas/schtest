import degaluapskaita.Apskaita;
import degaluapskaita.Cekis;

import java.util.Set;

public class VidutinesDegaluSanaudos {

    public static void main(String[] args) {

        Apskaita degaluApskaita = new Apskaita();

        degaluApskaita.pridetiCeki(new Cekis("End46\n7", 1.25, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis("E nd4 67", 2.10, 50, 200));
        degaluApskaita.pridetiCeki(new Cekis("End 467", 1.60, 20, 700));
        degaluApskaita.pridetiCeki(new Cekis("End   467", 0.99, 20, 1000));
        degaluApskaita.pridetiCeki(new Cekis("knu839", 1.05, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis("knu 839", 1.10, 50, 150));
        degaluApskaita.pridetiCeki(new Cekis("KNu839", 1.60, 20, 600));
        degaluApskaita.pridetiCeki(new Cekis("KNU839", 1.29, 20, 850));
        degaluApskaita.pridetiCeki(new Cekis("eek15511", 1.15, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis("eek 15511", 1.00, 50, 250));
        degaluApskaita.pridetiCeki(new Cekis("eek15511", 1.20, 20, 650));
        degaluApskaita.pridetiCeki(new Cekis("eek15511", 0.89, 20, 1200));

        Set<String> nrSarasas = degaluApskaita.getCekiaiByVm();
        System.out.printf( "%-10s %10s  %10s  \n","Valst. nr.", "[l/100]", "[Eur/100]");

        for (String numeris : nrSarasas) {
//            System.out.println();
//            System.out.println("TP valstybinis numeris: " + numeris);
            System.out.printf( "%-10s %10.2f %10.2f \n",numeris, degaluApskaita.vidLitraiSimtui(numeris),degaluApskaita.vidKainaSimtui(numeris) );
//            System.out.printf( "%.2f Eur/100km vidutinė kaina \n",degaluApskaita.vidKainaSimtui(numeris));
//            System.out.println(degaluApskaita.vidLitraiSimtui(numeris) + " l/100km vidurkis");
//            System.out.println(degaluApskaita.vidKainaSimtui(numeris) + " Eur/100km vidutinė kaina");

        }


    }

}



