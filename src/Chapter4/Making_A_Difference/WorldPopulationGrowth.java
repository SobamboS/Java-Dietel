package Chapter4.Making_A_Difference;

public class WorldPopulationGrowth{
    public static void main(String[] args){

        long world_population=7_000_000_000L;
        double world_growth_rate=0.85;
        long growth =0;

        long increase=0;
        int year;


        System.out.print("Year      Growth     Rate");
        for (year = 0; year  < 76 ; year++){
             growth=(long) (world_growth_rate * world_population);
            increase +=growth;
        System.out.printf("%d%n       %d     %.1f%n",year, increase, world_growth_rate);
        }

        if(increase == world_population *2  ){

            System.out.println(growth);
            System.out.println(year);
        }

    }
}
