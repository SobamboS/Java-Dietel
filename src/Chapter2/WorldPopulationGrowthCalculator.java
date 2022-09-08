package Chapter2;

public class WorldPopulationGrowthCalculator {
    public static void main ( String[] args ) {

        long population = 7900000000L;
        double annualWorldPopulationGrowthRate = 1.1;

        double firstYear = (population * 100) / annualWorldPopulationGrowthRate ;
        System.out.printf ( "World Population for first year is %.0f%n", firstYear);

        double secondYear = (firstYear * 100 )/ annualWorldPopulationGrowthRate;
        System.out.printf ( "World Population for first year is %.0f%n", secondYear);

        double thirdYear = (secondYear * 100 ) / annualWorldPopulationGrowthRate;
        System.out.printf ( "World Population for first year is %.0f%n", thirdYear);

        double fourthYear = ( thirdYear * 100) / annualWorldPopulationGrowthRate;
        System.out.printf ( "World Population for first year is %.0f%n", fourthYear);

        double fifthYear = ( fourthYear * 100) / annualWorldPopulationGrowthRate;
        System.out.printf ( "World Population for first year is %.0f%n", fifthYear);
    }
}
