package degaluapskaita;


import java.util.*;

public class Apskaita {


    private Map<String, List<Cekis>> cekiaiByVm = new HashMap<>();

    public void pridetiCeki(Cekis cekis) {

        if (!cekiaiByVm.containsKey(cekis.getValstybinisNumeris())) {
            cekiaiByVm.put(cekis.getValstybinisNumeris(), new ArrayList<>());
        }

        cekiaiByVm.get(cekis.getValstybinisNumeris()).add(cekis);
    }

    public Set<String> getCekiaiByVm() {
        return cekiaiByVm.keySet();
    }

//    public List <Cekis> getCekiaiByValstbinisNr (String valstybinisNumeris) {
//        return cekiaiByVm.get(valstybinisNumeris);
//    }
    public double vidLitraiSimtui(String valstybinisNumeris) {



        List<Cekis> cekiai = this.cekiaiByVm.get(NumeriaiUtil.remobeSpaceNUpperCase(valstybinisNumeris));

        if (cekiai == null ) {

            return -1;

        }

        Cekis pirmasCekis = cekiai.get(0);

        Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);

        int nuvaziuotasAtstumas = paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();


        double litraiViso = 0;
        for (int i = 0; i < cekiai.size() - 1; i++) {

            litraiViso = litraiViso + cekiai.get(i).getKiekis();

        }

        double litraiSimtuiKm = litraiViso / nuvaziuotasAtstumas;

        return litraiSimtuiKm * 100.0;

    }



    public double vidKainaSimtui(String valstybinisNumeris) {



        double vidLitroKaina = 0;


//        Set <String> nrSarasas = cekiaiByVm.keySet();

//        for (String numeris:nrSarasas) {
            List<Cekis> numerioCekiai = cekiaiByVm.get(valstybinisNumeris);
            for (int i = 0; i < numerioCekiai.size() - 1; i++) {

                vidLitroKaina = numerioCekiai.get(i).getKainaVnt() + vidLitroKaina;
            }
//        }




        double bendraLitroKaina = vidLitroKaina / (cekiaiByVm.size() - 1);

        return bendraLitroKaina * vidLitraiSimtui(valstybinisNumeris);
    }


}