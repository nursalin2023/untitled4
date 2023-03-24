import java.util.Arrays;

public class Classyy {
    int namber;
    String soz;
    int[] massive;

    public Classyy(int namber, String soz, int[] massive) {
        this.namber = namber;
        this.soz = soz;
        this.massive = massive;
    }

    @Override
    public String toString() {
        return "Classyy: " +
                "namber: " + namber + "\n"+
                "soz: " + soz + "\n" +
                "massive: " + Arrays.toString(massive) +
                '}';
    }
}
