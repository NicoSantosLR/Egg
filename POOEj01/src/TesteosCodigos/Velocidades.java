package TesteosCodigos;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Velocidades {

    public static void main(String[] args) {

        Set hashSet = new HashSet(1000000);
        long inicioTiempoHashSet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        long finalTiempoHashSet = System.currentTimeMillis();
        System.out.println("HashSet = " + (finalTiempoHashSet - inicioTiempoHashSet));

        Set treehSet = new TreeSet();
        long inicioTiempoTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treehSet.add(i);
        }
        long finalTiempoTreeSet = System.currentTimeMillis();
        System.out.println("TreeSet = " + (finalTiempoTreeSet - inicioTiempoTreeSet));

        Set linkeHashSet = new LinkedHashSet(1000000);
        long inicioTiempoLinkedhashSet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkeHashSet.add(i);
        }
        long finalTiempoLinkedhashSet = System.currentTimeMillis();
        System.out.println("LinkedHashSet = " + (finalTiempoLinkedhashSet - inicioTiempoLinkedhashSet));

    }

}
