package org.exercise.lexicagraphicalOrder.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/// https://www.arquitecturajava.com/java-stream/
public class Principal2 {
    public static void main(String[] args) {
        Factura f= new Factura("ordenador",1200);
        Factura f2= new Factura("movil",300);
        Factura f3= new Factura("impresora",200);
        Factura f4= new Factura("imac",1500);
        List<Factura> lista= new ArrayList<Factura>();
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        Predicate<Factura> predicado= new Predicate<Factura>() {
            @Override
            public boolean test(Factura f) {
                System.out.println(" iteracion ");
                return f.getImporte()>300;
            }
        };
        Factura facturaFiltro=
                lista.stream()
                        .filter(predicado).findFirst().get();
        System.out.println("UNICA :"+facturaFiltro.getImporte());
    }
}
