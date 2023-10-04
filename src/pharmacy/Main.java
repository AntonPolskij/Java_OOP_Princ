package pharmacy;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Pharmacy catPharmacy = new CatPharmacy();
        Pharmacy catPharmacy1 = new CatPharmacy();
        Pharmacy catPharmacy2 = new CatPharmacy();
        Pharmacy catPharmacy3 = new CatPharmacy();
        Component penicilin = new Penicilin("5mg");
        penicilin.setWeight("7mg");
        catPharmacy.addComponent(new Azitronitum("5mg")).addComponent(new Water("10mg")).addComponent(penicilin);
        catPharmacy1.addComponent(new Azitronitum("5mg")).addComponent(new Water("10mg")).addComponent(penicilin);
        catPharmacy3.addComponent(new Azitronitum("Азитронитум","5mg", 15)).addComponent(new Water("10mg")).addComponent(penicilin);
        catPharmacy2.addComponent(new Azitronitum("10mg")).addComponent(new Water("2mg"));
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy3);
        for(Pharmacy pharmacy : pharmacyList) {
            System.out.println(pharmacy.getFullPower() + " - " + pharmacy.getPharmacyName());
        }
        System.out.println("------------------------------");
        Collections.sort(pharmacyList);
        for(Pharmacy pharmacy : pharmacyList) {
            System.out.println(pharmacy.getFullPower() + " - " + pharmacy.getPharmacyName());
        }
//        while (((Iterator<Component>) catPharmacy).hasNext()) {
//            System.out.println(((Iterator<Component>) catPharmacy).next());
//        }
//        for (Component component : catPharmacy) {
//            System.out.println(component);
//        }

//

        System.out.println("------------------------------");
        Set<Pharmacy> result = new HashSet<>(pharmacyList);
        System.out.println(result.size());
    }
}
