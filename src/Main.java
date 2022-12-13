import java.util.*;

public class Main {
    public static void main(String[] args) {
        Passport irina = new Passport(
                Collections.singleton("523HQG"),
                "Ягодкова",
                "Вишня",
                "Константиновна", "01.01.1980");
        Passport sergei = new Passport(
                Collections.singleton("184AEW"),
                "Михайлов",
                "Потап",
                "Таптыгович",
                "02.02.1963");
        Passport andrei = new Passport(
                Collections.singleton("591KРB"),
                "Мамбаева",
                "Любовь",
                "Сергеевна",
                "03.03.2000");

        Set<Passport> passportSets = new HashSet<>();
        passportSets.add(irina);
        passportSets.add(sergei);
        passportSets.add(andrei);

        Iterator itr = passportSets.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Паспорт: " + find(passportSets, "591KРB"));


    }

    public static Passport find(Set<Passport> passportSets, String number) {
        for (Passport passports: passportSets) {
            if (passports.isSetNumber(number)) {
                return passports;
            }
        }
        return null;
    }




}