package ro.sci.transport;

import ro.sci.transport.model.Bunch;
import ro.sci.transport.model.Package;

import java.util.*;

/**
 * Created by Skipy on 5/20/2017.
 */
public class AppStart {
    public static void main(String[] args) {

        Map<String, Bunch> bunches = new HashMap<>();

        List<Package> packages = new ArrayList<>();

        Package pakage01 = new Package("Romania" , 50, 101, new Date(17, 5, 26));
        Package pakage02 = new Package("Albania" , 12, 192, new Date(17, 7, 26));
        Package pakage03 = new Package("Germay"  , 14, 102, new Date(17, 8, 26));
        Package pakage04 = new Package("Zorbia"  , 12, 105, new Date(17, 8, 14));
        Package pakage05 = new Package("Belaruse", 16, 350, new Date(17, 7, 12));
        Package pakage06 = new Package("Romania" , 60, 111, new Date(16, 5, 26));

        packages.add(pakage01);
        packages.add(pakage02);
        packages.add(pakage03);
        packages.add(pakage04);
        packages.add(pakage05);
        packages.add(pakage06);

        System.out.println("Unsorted List");

        for (Package p : packages) {
            System.out.println(p);
        }

        Collections.sort(packages);

        System.out.println("Sorted List");

        for (Package p : packages) {
            System.out.println(p);
        }

        Collections.reverse(packages);

        System.out.println("Reveserd sorted List");

        for (Package p : packages) {
            System.out.println(p);
        }

        for (Package p : packages) {
            String destName = p.getTargetLocation();
            if (bunches.containsKey(destName)) {
                Bunch tempBunch = bunches.get(destName);
                tempBunch.addPackage(p);
            } else {
                Bunch newBunch = new Bunch();
                newBunch.addPackage(p);
                bunches.put(destName, newBunch);
            }
        }

        System.out.println("Bunches");

        for (Bunch b: bunches.values()){
            System.out.println(b);
        }
    }
}
