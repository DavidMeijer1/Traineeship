package levelSeven;

public class PopulationGrowth {
    public static void main(String[] args) {
        System.out.println(numberOfYears(1000, 2, 50, 1200));
        System.out.println(numberOfYears(1000, 2, 50, 1200));
        System.out.println(numberOfYears(1000, 2, 50, 1200));
        System.out.println(numberOfYears(1500, 5, 100, 5000));
        System.out.println(numberOfYears(1500000, 2.5, 10000, 2000000));
        System.out.println(numberOfYears(1500000, 2.5, 10000, 2000000));

        System.out.println(numberOfYears(1500000, 2.5, 10000, 2000000));
        System.out.println(numberOfYears(1500000, 0.25, 1000, 2000000));
    }

    static int numberOfYears(int initialPopulation, double percent, int extraYearlyPopulation, int populationToEqual) {
//        int[] array = new int[200];
//        array[0] = initialPopulation;
//        for (int i = 1; i < 200; i++) {
//            array[i] = (int) (array[i - 1] + (array[i - 1] * percent / 100) + extraYearlyPopulation);
//            if (array[i] >= populationToEqual) {
//                return i;
//            }
//        }

        int year = 0;
        int currentPopulation = initialPopulation;

        while (currentPopulation < populationToEqual) {
            currentPopulation += (int) (currentPopulation * percent / 100) + extraYearlyPopulation;
            year++;
        }


        for (int year2 = 0, currentPopulation2 = initialPopulation; ; year2++) {
            currentPopulation2 += (int) (currentPopulation2 * percent / 100) + extraYearlyPopulation;
            if (currentPopulation2 > populationToEqual) return year2;
        }
    }
}
