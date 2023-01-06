package src.main;

import java.util.*;

public class Main {
    public static void main(String[] args){
//        Set<Person> personTree = new TreeSet<>();
//        personTree.add(new Person("Danut", 22));
//        personTree.add(new Employed("Angajat", 33));
//        personTree.add(new Unemployed("Somer", 44));
//        personTree.add(new Student("Student Politehnica", 29));
//
//        System.out.println("S-a creat TreeSet de tip Person de dimensiune: " + personTree.size());
//        personTree.forEach(System.out::println);

        // ^^^ pentru ca nu includem Comparable in clasa Person codul de mai sus nu va functiona
        // ^^^ l-am folosit doar pentru testare personala

        //Collections.sort(personTree, new ComparatorName());
        //sort folosind comparatorul construit de mine (cum am folosit la curs) functioneaza doar pentru liste :(
        //asa ca va trebui sa fac 2 variabile in care sa folosesc fiecare comparator

        Set<Person> persontTreeCompName = new TreeSet<>(new ComparatorName());
        persontTreeCompName.add(new Person("Danut Nume", 22));
        persontTreeCompName.add(new Employed("Angajat Nume", 33));
        persontTreeCompName.add(new Unemployed("Somer Nume", 44));
        persontTreeCompName.add(new Student("Student Politehnica Nume", 29));

        System.out.println("S-a creat TreeSet de tip Person folosind Comparator de Nume de dimensiune: " + persontTreeCompName.size());
        persontTreeCompName.forEach(System.out::println);
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

        Set<Person> persontTreeCompAge = new TreeSet<>(new ComparatorAge());
        persontTreeCompAge.add(new Person("Danut Varsta", 55));
        persontTreeCompAge.add(new Employed("Angajat Varsta", 22));
        persontTreeCompAge.add(new Unemployed("Somer Varsta", 11));
        persontTreeCompAge.add(new Student("Student Politehnica Varsta", 99));

        System.out.println("S-a creat TreeSet de tip Person folosind Comparator de Varsta de dimensiune: " + persontTreeCompAge.size());
        persontTreeCompAge.forEach(System.out::println);
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nTestare creeare TreeSet-uri completa!\n\n");

        //***************************************************************************************************************
        HashMap<Person, List<Hobby>> personMap = new HashMap<Person, List<Hobby>>();
        //voi crea cate o lista de hobby-uri pentru fiecare persoana
        //dar pentru asta va trebui sa creez mai intai 2-3 liste de adrese pentru fiecare hobby

        ArrayList<Adress> adressListFirst1 = new ArrayList<>();
        adressListFirst1.add(new Adress(new Country("Germania", "Europa"), "Frankfurt"));
        adressListFirst1.add(new Adress(new Country("Romania", "Europa"), "Buzau"));
        adressListFirst1.add(new Adress(new Country("SUA", "America de Nord"), "New York"));

        ArrayList<Adress> adressListFirst2 = new ArrayList<>();
        adressListFirst2.add(new Adress(new Country("Spania", "Europa"), "Madrid"));
        adressListFirst2.add(new Adress(new Country("China", "Asia"), "Beijing"));

        //acum creez lista de hobby-uri pentru prima persoana din HashMap
        List<Hobby> hobbyListFirst = new ArrayList<>();
        hobbyListFirst.add(new Hobby("Condus", 35, adressListFirst1));
        hobbyListFirst.add(new Hobby("Plimbat", 58, adressListFirst2));

        //***************************************************************************************************************
        //fac la fel dar pentru a doua persoana
        ArrayList<Adress> adressListSecond1 = new ArrayList<>();
        adressListSecond1.add(new Adress(new Country("Egipt", "Africa"), "Cairo"));
        adressListSecond1.add(new Adress(new Country("Nigeria", "Africa"), "Oras din Nigeria"));

        ArrayList<Adress> adressListSecond2 = new ArrayList<>();
        adressListSecond2.add(new Adress(new Country("Brazilia", "America de Sud"), "Rio de Janeiro"));
        adressListSecond2.add(new Adress(new Country("Canada", "America de Nord"), "Ottawa"));
        adressListSecond2.add(new Adress(new Country("Norvegia", "Europa"), "Oslo"));
        List<Hobby> hobbyListSecond = new ArrayList<>();
        hobbyListSecond.add(new Hobby("Transpirat", 35, adressListSecond1)); // <-- :)
        hobbyListSecond.add(new Hobby("Explorat", 58, adressListSecond2));

        //***************************************************************************************************************
        //acum adaug pesoanele la HashMap
        personMap.put(new Person("George Harta", 29), hobbyListFirst);
        personMap.put(new Person("Andreea Harta", 28), hobbyListSecond);

        System.out.println("Printare HashMap de persoane:\n");
        for (Map.Entry<Person,List<Hobby>> set : personMap.entrySet()) {
            System.out.println(set.getKey().getName() + " " + set.getValue().toString());
            System.out.println("\n\n###########################################################################\n\n");
        }

        //stiu ca printarea nu e cea mai frumoasa dar am vrut sa fie cat mai aerata si explicita
        //spatierea e dubioasa dar consider ca e ok din punct de vedere functional
    }
}
