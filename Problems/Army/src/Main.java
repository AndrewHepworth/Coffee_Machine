class Army {

    public static void createArmy() {
        // Implement this method
        Unit unit1 = new Unit("unit1");
        Unit unit2 = new Unit("unit2");
        Unit unit3 = new Unit("unit3");
        Unit unit4 = new Unit("unit4");
        Unit unit5 = new Unit("unit5");
        Knight knight1 = new Knight("k1");
        Knight knight2 = new Knight("k2");
        Knight knight3 = new Knight("k3");
        General general1 = new General("g1");
        Doctor doctor = new Doctor("doctor");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}