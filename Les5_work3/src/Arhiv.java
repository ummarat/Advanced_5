public class Arhiv {
    public int numFond;
    int mumOpys;
    private String nameSpravy;

    public Arhiv() {
    }

    public Arhiv(int numFond, int mumOpys) {
        this.numFond = numFond;
        this.mumOpys = mumOpys;
    }

    public Arhiv(int numFond, int mumOpys, String nameSpravy) {
        this.numFond = numFond;
        this.mumOpys = mumOpys;
        this.nameSpravy = nameSpravy;
    }

    public int getNumFond() {
        return numFond;
    }

    public void setNumFond(int numFond) {
        this.numFond = numFond;
    }

    public int getMumOpys() {
        return mumOpys;
    }

    public void setMumOpys(int mumOpys) {
        this.mumOpys = mumOpys;
    }

    public String getNameSpravy() {
        return nameSpravy;
    }

    public void setNameSpravy(String nameSpravy) {
        this.nameSpravy = nameSpravy;
    }
}
