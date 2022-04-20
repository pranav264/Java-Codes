package com.company;

class HillStations {
    public void location() {
        System.out.println("Various locations throughout India!");
    }

    public void famousFor() {
        System.out.println("Lot's of things to see!");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Welcome to Manali!");
    }

    @Override
    public void famousFor() {
        System.out.println("Solang Valley, Beas River, Manikaran Gurudwara");
    }
}

class Shimla extends HillStations {
    @Override
    public void location() {
        System.out.println("Welcome to Shimla!");
    }

    @Override
    public void famousFor() {
        System.out.println("Jakhu Temple, Viceregal Lodge, Kalka - Shimla Railway");
    }
}

class Mahabaleshwar extends HillStations {
    @Override
    public void location() {
        System.out.println("Welcome to Mahabaleshwar!");
    }

    @Override
    public void famousFor() {
        System.out.println("Venna Lake, Table-Top, Pratapgarh");
    }
}

public class hillStation {
    public static void main(String[] args) {
        HillStations hs = new HillStations();
        HillStations mn = new Manali();
        HillStations sh = new Shimla();
        HillStations mhb = new Mahabaleshwar();

        hs.location();
        hs.famousFor();

        System.out.println("");

        mn.location();
        mn.famousFor();

        System.out.println("");

        sh.location();
        sh.famousFor();

        System.out.println("");

        mhb.location();
        mhb.famousFor();
    }
}
