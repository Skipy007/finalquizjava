package ro.sci.transport.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Skipy on 5/20/2017.
 */
public class Bunch {
    private List<Package> packageList;
    private float profit;
    private float merchandiseValue;
    private float valuePerKm = 1;


    public Bunch() {
        packageList = new ArrayList<>();
        profit = 0;
        merchandiseValue = 0;
    }

    public void addPackage(Package pack) {
        packageList.add(pack);
        merchandiseValue += pack.getValue();
        profit += pack.getValue() - (pack.getDistanceToTarget() * valuePerKm);
    }

    public float getProfit() {
        return profit;
    }

    public float getMerchandiseValue() {
        return merchandiseValue;
    }

    @Override
    public String toString() {
        return "Bunch{" +
                "packageList=" + packageList +
                ", profit=" + profit +
                ", merchandiseValue=" + merchandiseValue +
                ", valuePerKm=" + valuePerKm +
                '}';
    }
}
