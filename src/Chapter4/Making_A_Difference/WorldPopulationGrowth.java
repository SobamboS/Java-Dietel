package Chapter4.Making_A_Difference;

public class WorldPopulationGrowth{
    public static void main(String[] args){

        long world_population=7_000_000_000L;
        double world_growth_rate=0.85;
        int count=1;

        long growth=0;
        while (count<5) {
            System.out.println(count);
            growth=(long) (world_growth_rate*world_population);
            count++;
        }

        System.out.println(growth);


        //System.out.print(world_population + "" + world_growth_rate);
    }
}
