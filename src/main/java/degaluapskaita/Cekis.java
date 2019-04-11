package degaluapskaita;

public class Cekis {

    private String data;
    private double kainaVnt;
    private double kiekis;
    private int odometroparodymai;
    private String valstybinisNumeris;

    public Cekis(String valstybinisNumeris, double kainaVnt, double kiekis, int odometroparodymai) {
        this.valstybinisNumeris = NumeriaiUtil.remobeSpaceNUpperCase(valstybinisNumeris);
        this.kainaVnt = kainaVnt;
        this.kiekis = kiekis;
        this.odometroparodymai = odometroparodymai;
    }


    public String getValstybinisNumeris() {
        return valstybinisNumeris;
    }

    public void setValstybinisNumeris(String valstybinisNumeris) {
        this.valstybinisNumeris = valstybinisNumeris;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getKainaVnt() {
        return kainaVnt;
    }

    public void setKainaVnt(double kainaVnt) {
        this.kainaVnt = kainaVnt;
    }

    public double getKiekis() {
        return kiekis;
    }

    public void setKiekis(double kiekis) {
        this.kiekis = kiekis;
    }

    public int getOdometroparodymai() {
        return odometroparodymai;
    }

    public void setOdometroparodymai(int odometroparodymai) {
        this.odometroparodymai = odometroparodymai;
    }
}
