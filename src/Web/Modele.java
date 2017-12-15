package Web;

import org.springframework.stereotype.Component;
@Component
/**
 * Created by X-MART on 18/03/2017.
 */
public class Modele implements Imodele{
    private double[] list;
    private double calcul;


    public double getCalcul() {
        return calcul;
    }

    public void setCalcul(double calcul) {
        this.calcul = calcul;
    }

    public double[] getList() {
        return list;
    }

    public void setList(double[] list) {
        this.list = list;
    }
}
